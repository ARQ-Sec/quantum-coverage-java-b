package legacy.coverage;
import java.security.*;
public final class Rule020Exp02 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0184-java
        // evidence_anchor: Signature.getInstance("MD5withRSA")
        // regex_sample: Signature.getInstance                     ( 'MD5withRSA'    )
        // keywords: Signature.getInstance | MD5withRSA
        Signature.getInstance("MD5withRSA");
    }
}
