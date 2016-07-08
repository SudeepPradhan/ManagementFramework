package security.hash;

import java.security.NoSuchAlgorithmException;
import org.mindrot.jbcrypt.BCrypt;

public class JBcryptHasher implements HashingMethod {
    protected JBcryptHasher() {

    }
    
    @Override
    public String hash(String data) throws NoSuchAlgorithmException {
        return BCrypt.hashpw(data, BCrypt.gensalt(12));
    }
}
