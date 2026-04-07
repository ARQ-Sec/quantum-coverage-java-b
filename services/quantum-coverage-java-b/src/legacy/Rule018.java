package legacy.coverage;
import java.security.*;
public final class Rule018 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0182-java
        // evidence_anchor: Signature.getInstance("SHA1withDSA")
        // regex_sample: SHA1withDSA
        // keywords: Signature.getInstance | SHA1withDSA
        Signature.getInstance("SHA1withDSA");
    }
}
