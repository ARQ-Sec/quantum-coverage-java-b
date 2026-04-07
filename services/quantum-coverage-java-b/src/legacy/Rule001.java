package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0134-java
        // evidence_anchor: SecretKeyFactory.getInstance("PBEWithSHA1AndRC2_40")
        // regex_sample: PBEWithSHA1AndRC2_40
        // keywords: SecretKeyFactory.getInstance | PBEWithSHA1AndRC2_40
        SecretKeyFactory.getInstance("PBEWithSHA1AndRC2_40");
    }
}
