package fi.blueshift.lib.domain.model.bluesdex;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint8;

import java.io.Serializable;
import java.math.BigInteger;

@ToString
@Getter
@Setter
public class Signature extends StaticStruct implements Serializable {
    private static final long serialVersionUID = -6995140110692956252L;

    //example
    // "v":27,
    // "r":"0x2417dadb1c2bfb84ba12a00b39bffd59eabb1e781bfcb2753753fde3180fcbbb",
    // "s":"0x4534f19d632d7b109946d8de3fc3f1625c1593cf14d5db6c239d8250af6722cc"

    public BigInteger v;

    public byte[] r;

    public byte[] s;

    public Signature() {

    }

    public Signature(BigInteger v, byte[] r, byte[] s) {
        super(new Uint8(v),
                new Bytes32(r),
                new Bytes32(s));
        this.v = v;
        this.r = r;
        this.s = s;
    }

    public Signature(Uint8 v, Bytes32 r, Bytes32 s) {
        super(v, r, s);
        this.v = v.getValue();
        this.r = r.getValue();
        this.s = s.getValue();
    }
}