package fi.blueshift.lib.domain.dto.bluesbots;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotPricesRequest {

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
