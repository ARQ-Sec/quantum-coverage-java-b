package legacy.coverage;
import javax.crypto.*;
public final class Rule023 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0187-java
        // evidence_anchor: Cipher.getInstance("Blowfish
        // regex_sample: Cipher.getInstancegN0Z2Ax ^2t#c+u@s!IXO4n @"3ZZr7#VgMXvoBBlowfish
        // keywords: Cipher.getInstance | Blowfish
        Cipher.getInstance("Blowfish");
    }
}
