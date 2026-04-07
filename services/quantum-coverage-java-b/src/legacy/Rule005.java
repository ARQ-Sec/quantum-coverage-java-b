package legacy.coverage;
import java.security.*;
public final class Rule005 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0150-java
        // evidence_anchor: KeyPairGenerator.getInstance("RSA").initialize(512)
        // regex_sample: initialize            (                     512
        // keywords: KeyPairGenerator.initialize | RSA
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(512);
    }
}
