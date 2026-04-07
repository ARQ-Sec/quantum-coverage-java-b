package legacy.coverage;
import java.security.*;
public final class Rule014Exp02 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0177-java
        // evidence_anchor: MessageDigest.getInstance("MD5")
        // regex_sample: MessageDigest.getInstance                       (       "MD5"     )
        // keywords: MessageDigest.getInstance | MD5
        MessageDigest.getInstance("MD5");
    }
}
