package security.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public final class MD5Hasher implements HashingMethod {

    protected MD5Hasher() {

    }

    @Override
    public String hash(String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest = messageDigest.digest(data.getBytes());
        return Base64.getEncoder().encodeToString(digest);
    }

}
