package security.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public final class SHA1Hasher implements HashingMethod {

    public SHA1Hasher() { 
    }

    @Override
    public String hash(String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        byte[] digest = messageDigest.digest(data.getBytes());
        return Base64.getEncoder().encodeToString(digest);
    }

}
