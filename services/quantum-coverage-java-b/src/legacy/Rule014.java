package legacy.coverage;
import java.security.*;
public final class Rule014 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0072-java
        // evidence_anchor: MessageDigest\.getInstance\(\s*["']MD5["']\s*\)…
        // regex_sample: MessageDigest.getInstance                    (                       'MD5'                                   )
        // keywords: MessageDigest | getInstance | MD5
        MessageDigest.getInstance("MD5");
    }
}
