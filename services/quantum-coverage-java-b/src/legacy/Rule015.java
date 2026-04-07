package legacy.coverage;
import javax.crypto.*;
public final class Rule015 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0179-java
        // evidence_anchor: Mac.getInstance("HmacMD5")
        // regex_sample: Mac.getInstancePoV02Egyx&@p:g3cyZ QkPO(M< ~";N=[Km3oa k8DDHmacMD5
        // keywords: Mac.getInstance | HmacMD5
        Mac.getInstance("HmacMD5");
    }
}
