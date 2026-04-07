package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule012Exp04 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0171-java
        // evidence_anchor: System.setProperty(javax.net.ssl.trustStorePassword, ...)
        // regex_sample: System  .     setProperty (       "javax.net.ssl.trustStorePassword"
        // keywords: System.setProperty | javax.net.ssl.trustStorePassword
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
    }
}
