package legacy.coverage;
import java.security.*;
public final class Rule021Exp02 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0185-java
        // evidence_anchor: Signature.getInstance("SHA1withRSA")
        // regex_sample: Signature.getInstance                 (      'SHA1withRSA'             )
        // keywords: Signature.getInstance | SHA1withRSA
        Signature.getInstance("SHA1withRSA");
    }
}
