package legacy.coverage;
import javax.crypto.*;
public final class Rule022 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0186-java
        // evidence_anchor: Cipher.getInstance("DESede
        // regex_sample: Cipher.getInstance=|.h)G+H6]6WeLDESede
        // keywords: Cipher.getInstance | DESede
        Cipher.getInstance("DESede");
    }
}
