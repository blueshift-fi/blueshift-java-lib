package fi.blueshift.lib.domain.dto.bluesbots;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import fi.blueshift.lib.domain.enums.TradeOperationType;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SwapEventDto extends TransactionEventDto {

    TradeOperationType operationType;

    @JsonProperty("feeBase")
    BigDecimal feeBaseVolume;

    @JsonProperty("fee")
    BigDecimal feeVolume;

    //base token address of swap
    @JsonProperty("base_id")
    String baseTokenAddress;

    //amount of base token
    @JsonProperty("base_volume")
    BigDecimal baseTokenVolume;

    //qoute token address of swap
    @JsonProperty("qoute_id")
    String quoteTokenAddress;

    //amount of quote token
    @JsonProperty("qoute_volume")
    BigDecimal quoteTokenVolume;

    BigDecimal gasUsedVolume;
}
