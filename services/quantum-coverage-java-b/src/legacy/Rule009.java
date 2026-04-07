package legacy.coverage;
import java.security.*;
public final class Rule009 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0168-java
        // evidence_anchor: System.setProperty(javax.net.ssl.keyStore, ...)
        // regex_sample: System                        . setProperty                    (                  "javax.net.ssl.keyStore'
        // keywords: System.setProperty | javax.net.ssl.keyStore
        System.setProperty("javax.net.ssl.keyStore", "legacy.jks");
    }
}
