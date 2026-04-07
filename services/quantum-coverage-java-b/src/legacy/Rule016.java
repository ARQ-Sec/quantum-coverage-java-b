package legacy.coverage;
import javax.crypto.*;
public final class Rule016 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0180-java
        // evidence_anchor: Mac.getInstance("HmacSHA1")
        // regex_sample: Mac.getInstances[`tqv D'zi;}u' t%8`qSeI,()h;fy9#6HmacSHA1
        // keywords: Mac.getInstance | HmacSHA1
        Mac.getInstance("HmacSHA1");
    }
}
