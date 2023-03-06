package fi.blueshift.lib.domain.graphqlDto;

import fi.blueshift.lib.domain.enums.CryptoNetworkEnvironmentType;
import fi.blueshift.lib.domain.enums.CryptoNetworkType;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@GraphQLType(name = "SupportedChains")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CryptoNetworkSettingDto {

    @NotNull
    CryptoNetworkType type;

    String chainId;

    CryptoNetworkEnvironmentType networkEnvironmentType;

    List<String> rpcServerUrls;

    @NotBlank
    String explorerUrl;

    @NotBlank
    String ethTokenAddress;

    @NotBlank
    String ethTokenSymbol;

    @NotBlank
    String bluesAddress;

    public String getName() {
        return type.getDisplayName();
    }

    public String getShortName() {
        return type.getShortName();
    }

    public String getTypeName() {
        return type.getTypeName();
    }

    public String getDescription() {
        return type.getDescription();
    }
}
