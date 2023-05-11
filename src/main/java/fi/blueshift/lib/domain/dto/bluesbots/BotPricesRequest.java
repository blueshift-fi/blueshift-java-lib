package fi.blueshift.lib.domain.dto.bluesbots;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotPricesRequest implements Serializable {

    private static final long serialVersionUID = -2332084921192074250L;

    @JsonProperty("tokens")
    @JsonAlias({"token"})
    List<String> tokenAddressList;

    @JsonProperty("baseToken")
    String quoteTokenAddress;

    @Builder.Default
    boolean isSignatureNeeded = false;

    @JsonGetter("signature")
    public boolean getSignatureSign() {
        return isSignatureNeeded;
    }
}
