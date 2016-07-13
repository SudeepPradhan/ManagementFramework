package security.hash;

import java.security.NoSuchAlgorithmException;
//context
public class PasswordHasher {

    private HashingMethod hashStrategy;

    public PasswordHasher(HashingMethod hashingStrategy) {
        this.hashStrategy = hashingStrategy;
    }

    public void setHashingStrategy(HashingMethod hashingStrategy) {
        this.hashStrategy = hashingStrategy;
    }

    public String encrypt(String password)  throws NoSuchAlgorithmException{
        return hashStrategy.hash(password);
    }

    public static HashingMethod getSHA1HashMethod() {
        return new SHA1Hasher();
    }

    public static HashingMethod getMD5HashMethod() {
        return new MD5Hasher();
    }
    
     public static HashingMethod getJBcryptHashMethod() {
        return new JBcryptHasher();
    }
}
