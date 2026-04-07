package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule011Exp03 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0170-java
        // evidence_anchor: System.setProperty(javax.net.ssl.trustStore, ...)
        // regex_sample: System            .       setProperty                  (                      "javax.net.ssl.trustStore'
        // keywords: System.setProperty | javax.net.ssl.trustStore
        System.setProperty("javax.net.ssl.trustStore", "legacy.jks");
    }
}
