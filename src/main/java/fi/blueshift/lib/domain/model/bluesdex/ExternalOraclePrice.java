package fi.blueshift.lib.domain.model.bluesdex;

import lombok.NoArgsConstructor;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.generated.Uint256;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class ExternalOraclePrice extends DynamicStruct {
    public String baseToken;

    public List<BigInteger> prices;

    public List<String> tokens;

    public BigInteger timestamp;

    public Signature signature;

    public ExternalOraclePrice(String baseToken, List<BigInteger> prices, List<String> tokens, BigInteger timestamp, Signature signature) {
        super(new Address(160, baseToken),
                new DynamicArray<Uint256>(
                        Uint256.class,
                        org.web3j.abi.Utils.typeMap(prices, Uint256.class)),
                new DynamicArray<Address>(
                        Address.class,
                        org.web3j.abi.Utils.typeMap(tokens, Address.class)),
                new Uint256(timestamp),
                signature);
        this.baseToken = baseToken;
        this.prices = prices;
        this.tokens = tokens;
        this.timestamp = timestamp;
        this.signature = signature;
    }

    public ExternalOraclePrice(Address baseToken, DynamicArray<Uint256> prices, DynamicArray<Address> tokens, Uint256 timestamp, Signature signature) {
        super(baseToken, prices, tokens, timestamp, signature);
        this.baseToken = baseToken.getValue();
        this.prices = prices.getValue().stream().map(NumericType::getValue).collect(Collectors.toList());
        this.tokens = tokens.getValue().stream().map(Address::getValue).collect(Collectors.toList());
        this.timestamp = timestamp.getValue();
        this.signature = signature;
    }
}