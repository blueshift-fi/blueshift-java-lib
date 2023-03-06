package fi.blueshift.lib.domain.graphqlDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@GraphQLType(name = "Token")
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TokenDto {

    @GraphQLId
    String id;

    @GraphQLInputField(description = "token address")
    String addressId;

    /**
     * token symbol
     */
    @NotNull
    @GraphQLInputField
    String symbol;

    /**
     * token name
     */
    @GraphQLInputField
    String name;

    @GraphQLInputField
    @Builder.Default
    Boolean visible = true;

    /**
     * token decimals
     */
    @GraphQLInputField
    Long decimals;

    /**
     * token total supply
     */
    @GraphQLInputField
    BigDecimal totalSupply;

    @GraphQLInputField
    Set<PortfolioDto> portfolios;

    //<editor-fold desc="Related to portfolios stats">
    @GraphQLInputField
    BigDecimal amount;

    @JsonProperty("price")
    @GraphQLInputField(description = "applicable only within portfolio entry")
    BigDecimal priceBase;

    @GraphQLInputField
    BigDecimal depositLimit;

    @GraphQLInputField
    BigDecimal withdrawLimit;

    @GraphQLInputField
    BigDecimal depositEMAPrice;

    @GraphQLInputField
    BigDecimal withdrawEMAPrice;

    @GraphQLInputField
    BigDecimal portfolioShare;

    @GraphQLInputField
    BigDecimal targetWeight;
    //</editor-fold>

    //<editor-fold desc="Statistic">
    @GraphQLInputField
    BigDecimal priceETH;

    @GraphQLInputField
    BigDecimal priceUSD;

    @GraphQLInputField
    BigDecimal price24hChange;

    @GraphQLInputField
    BigDecimal price30dChange;

    /**
     * volume in ETH (ADA) for 24 hours
     */
    @GraphQLInputField
    BigDecimal volume24hETH;

    /**
     * volume in USD for 24 hours
     */
    @GraphQLInputField
    BigDecimal volume24hUSD;

    @GraphQLInputField
    BigDecimal volumeUSD24hChange;

    @GraphQLInputField
    BigDecimal volumeUSD7dChange;

    /**
     * volume in USD for 30 days
     */
    @GraphQLInputField
    BigDecimal volume30dUSD;

    /**
     * liquidity across all portfolios in base network units
     */
    @GraphQLInputField
    BigDecimal tvlETH;

    /**
     * liquidity across all portfolios in derived USD
     */
    @GraphQLInputField
    BigDecimal tvlUSD;

    @GraphQLInputField
    BigDecimal tvlUSD24hChange;

    @GraphQLInputField
    BigDecimal fees24hETH;

    @GraphQLInputField
    BigDecimal fees24hUSD;

    @GraphQLInputField
    BigDecimal fees30dUSD;

    /**
     * transactions across all portfolio that include this token
     */
    @GraphQLInputField
    //</editor-fold>

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TokenDto tokenDto = (TokenDto) o;

        return new EqualsBuilder().append(id, tokenDto.id)
                .append(addressId, tokenDto.addressId).append(symbol, tokenDto.symbol)
                .append(name, tokenDto.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(addressId).append(symbol).append(name).toHashCode();
    }
}
