package legacy.coverage;
import java.security.*;
public final class Rule019 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0183-java
        // evidence_anchor: Signature.getInstance("SHA1withECDSA")
        // regex_sample: SHA1withECDSA
        // keywords: Signature.getInstance | SHA1withECDSA
        Signature.getInstance("SHA1withECDSA");
    }
}
