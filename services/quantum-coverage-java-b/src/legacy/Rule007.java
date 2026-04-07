package legacy.coverage;
import java.security.*;
public final class Rule007 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0169-java
        // evidence_anchor: System.setProperty(javax.net.ssl.keyStorePassword, ...)
        // regex_sample: System   .          setProperty             (             'javax.net.ssl.keyStorePassword"
        // keywords: System.setProperty | javax.net.ssl.keyStorePassword
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
    }
}
