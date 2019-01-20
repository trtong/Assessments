package user_management.security;

import org.mindrot.jbcrypt.BCrypt;

public class Password {
    private static String salt;
    private final static int workload = 12;
    private static String hash;
    private final BCrypt BChasher;

    public Password(String password, BCrypt hasher) {
        hash = hashPassword(password);
        BChasher = hasher;
    }

    public Password(String password) {
        hash = hashPassword(password);
        BChasher = new BCrypt();
    }

    private  String hashPassword(String password_plaintext) {
         salt = generateSalt(workload);
         hash = BCrypt.hashpw(password_plaintext, salt);

         return hash;
    }

    private static String generateSalt(int workload) {
        return BCrypt.gensalt(workload);
    }

    public boolean matches(String password_plaintext) {
        String hashToCheckAgainst = getHash();
        System.out.println("hashToCheckAgainst: " + hashToCheckAgainst);
        return BChasher.checkpw(password_plaintext, hashToCheckAgainst);
    }

    public String getHash() {
        return hash;
    }

    public void setPassword(String password) {
        hash = hashPassword(password);
    }
}
