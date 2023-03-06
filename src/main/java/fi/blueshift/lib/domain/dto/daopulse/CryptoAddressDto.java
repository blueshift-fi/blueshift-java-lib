package fi.blueshift.lib.domain.dto.daopulse;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serial;
import java.io.Serializable;

@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CryptoAddressDto extends BaseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1729819205656955995L;

    @ApiModelProperty(notes = "id of DAO owner of address")
    private Long daoIdOwner;
    @ApiModelProperty(notes = "name of DAO owner of address")
    private String daoNameOwner;

    @ApiModelProperty(notes = "id of token owner of address")
    private Long tokenIdOwner;
    @ApiModelProperty(notes = "symbol of token owner of address")
    private String tokenSymbolOwner;

    @ApiModelProperty(notes = "id of wallet owner of address")
    private Long walletIdOwner;

    @JsonProperty("address")
    @JsonAlias({"token_address"})
    private String address;

    //Crypto platform (blockchain)
    @ApiModelProperty(notes = "crypto platform id (blockchain)")
    private Long cryptoPlatformId;
    @ApiModelProperty(notes = "crypto platform name (blockchain)")
    private String cryptoPlatformName;
    @JsonProperty("name")
    private String platformName;
    @JsonProperty("symbol")
    private String platformSymbol;
    @JsonProperty("slug")
    private String platformSlug;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CryptoAddressDto that = (CryptoAddressDto) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder().append(super.getId(), that.getId())
                .append(daoIdOwner, that.daoIdOwner).append(tokenIdOwner, that.tokenIdOwner).append(walletIdOwner, that.walletIdOwner)
                .append(address, that.address).append(cryptoPlatformId, that.cryptoPlatformId).append(cryptoPlatformName, that.cryptoPlatformName)
                .append(platformName, that.platformName).append(platformSymbol, that.platformSymbol)
                .append(platformSlug, that.platformSlug).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(super.getId())
                .append(daoIdOwner).append(tokenIdOwner).append(walletIdOwner)
                .append(address).append(cryptoPlatformId).append(cryptoPlatformName)
                .append(platformName).append(platformSymbol)
                .append(platformSlug).toHashCode();
    }
}
