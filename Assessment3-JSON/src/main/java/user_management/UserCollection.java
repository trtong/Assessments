package user_management;

import org.mindrot.jbcrypt.BCrypt;
import user_management.security.Password;
import user_management.security.UserAuthenticationFailedException;
import user_management.validation.EmailNotAvailableException;
import user_management.validation.InvalidEmailException;
import user_management.validation.PasswordTooSimpleException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCollection extends ArrayList<User> {

    private HashMap<String, Password> accountLogins;

    public UserCollection() {
        super();
    }
    public UserCollection(ArrayList<User> users) {
        this.addAll(users);
        accountLogins = storeAllAccounts();
    }


    private HashMap<String, Password> storeAllAccounts() {
        HashMap<String,Password> temp = new HashMap<>();
        for (User u: this) {
            temp.put(u.getEmail(), u.getPassword());
        }
        return temp;
    }

    public HashMap<String, Password> getAccountLogins() {
        return accountLogins;
    }

    public User findById(int id) {

            for (User u : this) {
                if (u.getId() == id) {
                    return u;
                }
            }
        return null;
    }

    public User findByEmail(String email) {
        System.out.println("email to match: " + email);
        for (User u : this) {
            System.out.println("email in collection: " + u.getEmail());
            if (u.getEmail().equals(email)) {
                System.out.println("email match found!");
                return u;
            }
        }
        return null;
    }

    public User attemptLogin(String email, String password) throws UserAuthenticationFailedException {
        // Null Pointer Exception
//        if (Authenticator.authenticate(findByEmail(email), email)) {
//            System.out.println("Got here");
        User user = findByEmail(email);
        System.out.println("user password: " + user.getPassword().getHash());
        if (user.getPassword().matches(password)) {
            return user;
        } else {
            throw new UserAuthenticationFailedException();
        }
    }

    private boolean emailCheck(String email) {
        Pattern emailCheck = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher = emailCheck .matcher(email);

        return emailMatcher.find();
    }

    private boolean passwordCheck(String password) {
        /*
            Password stipulations:
            - The password provided has less than 8 characters
            - The password provided has no upper case letters
            - The password provided has no lower case letters
            - The password provided has no numbers
            - The password provided has none of the following characters: !@#$%^&*()<>?
        */
        return (password.length() > 8 && Pattern.compile("[A-Z]").matcher(password).find() &&
                Pattern.compile("[a-z]").matcher(password).find() && Pattern.compile("[0-9]").matcher(password).find()
                && Pattern.compile("[!@#$%^&*()<>?]").matcher(password).find());
    }

    private boolean emailTaken(String email) {
        ArrayList<String> emails = new ArrayList<>();
        for (User u: this) {
            emails.add(u.getEmail());
        }

        return emails.contains(email);
    }

    private void checkExceptions(String email, String password) throws EmailNotAvailableException, InvalidEmailException, PasswordTooSimpleException {
        if (emailTaken(email)) {
            throw new EmailNotAvailableException();
        } else if (!emailCheck(email)) {
            throw new InvalidEmailException();
        } else if (!passwordCheck(password)) {
            throw new PasswordTooSimpleException();
        }
    }

    public int createUser(String name, String email, String password) throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {

        checkExceptions(email, password);

        User temp = new User(this.size()+1, name, email, new Password(password, new BCrypt()));
        this.add(temp);
        return temp.getId();
    }

}
