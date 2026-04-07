package legacy.coverage;
import java.security.*;
public final class Rule006 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0151-java
        // evidence_anchor: KeyPairGenerator.getInstance("RSA").initialize(768)
        // regex_sample: initialize                            (                             768
        // keywords: KeyPairGenerator.initialize | RSA
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(768);
    }
}
