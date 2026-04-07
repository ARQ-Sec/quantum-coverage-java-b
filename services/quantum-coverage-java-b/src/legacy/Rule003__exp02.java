package legacy.coverage;
import javax.crypto.*;
public final class Rule003Exp02 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0145-java
        // evidence_anchor: Cipher.getInstance("RSA/ECB/PKCS1Padding")
        // regex_sample: Cipher.getInstanceZ:\{t[(W K|L+&<:B&D ']V[HRSA/ECB/PKCS1Padding
        // keywords: Cipher.getInstance | RSA/ECB/PKCS1Padding
        Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }
}
