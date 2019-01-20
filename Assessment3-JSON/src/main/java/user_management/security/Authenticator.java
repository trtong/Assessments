package user_management.security;

import user_management.User;
import user_management.UserCollectionInitializer;

import java.io.IOException;

public class Authenticator {
    public static boolean authenticate(User user, String passwordToCheck /* this is the email*/) {

        try {
            return user.equals(UserCollectionInitializer.generate().findByEmail(passwordToCheck));
        } catch (IOException ioException) {
            System.out.println("Error: Authentication failed or account not found.");
            ioException.printStackTrace();
        }
        return false;
    }
}

