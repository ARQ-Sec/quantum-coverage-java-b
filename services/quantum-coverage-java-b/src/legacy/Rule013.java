package legacy.coverage;
import java.security.*;
public final class Rule013 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0176-java
        // evidence_anchor: MessageDigest.getInstance("MD2")
        // regex_sample: MessageDigest.getInstance]fOV'Mg |x.K-F4 n&z~n-b5TVn*7U[0\OK,Ga3L`^);y<cKYMD2
        // keywords: MessageDigest.getInstance | MD2
        MessageDigest.getInstance("MD2");
    }
}
