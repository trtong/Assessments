package user_management;

import user_management.security.Password;

public class User {

    private int id;
    private String name, email;
    private Password password;

    public User() {
    }

    public User(int id, String name, String email, Password password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password.setPassword(password);
    }

    @Override
    public String toString() {

        return this.name + " - " + this.email;
    }

    @Override
    public boolean equals(Object o) {
        User otherUser = (User) o;
        if (!this.name.equals(otherUser.getName()) || this.id != otherUser.getId() || !this.email.equals(otherUser.email)) {
            return false;
        }
        return true;
    }

    public Password getPassword() {
        return this.password;
    }
}
