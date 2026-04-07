package legacy.coverage;
import javax.crypto.*;
public final class Rule024Exp02 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0188-java
        // evidence_anchor: Cipher.getInstance("DES
        // regex_sample: Cipher.getInstance)&D*3&VA{Y+s,g05V+cw DES
        // keywords: Cipher.getInstance | DES
        Cipher.getInstance("DES");
    }
}
