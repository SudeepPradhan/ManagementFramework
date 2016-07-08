package security.hash;

import java.security.NoSuchAlgorithmException;

public interface HashingMethod {
    public String hash(String data) throws NoSuchAlgorithmException;
}
