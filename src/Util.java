import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
public class Util {
    public synchronized String generateHash(String sOriginal){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] btEncodedhash = digest.digest(sOriginal.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < btEncodedhash.length; i++) {
                sb.append(Integer.toString((btEncodedhash[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch(Exception ex){
            System.out.println("Error generating hash: " + ex.getMessage());
            return null;
        }
    }
}
