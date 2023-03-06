package fi.blueshift.lib.domain.kafkaDto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionEventDto {

    @JsonProperty("id")
    String guid;

    @JsonProperty("tHash")
    String transactionId;

    @JsonProperty("tBlockNum")
    Long blockNumber;

    //portfolio address
    @JsonProperty("portfolio")
    String portfolioAddress;

    String portfolioName;

    //sender address
    @JsonProperty("to")
    String senderAddress;

    @JsonProperty("volumeBase")
    @JsonAlias("amountBase")
    BigDecimal amountBase;

    //amount in USD
    @JsonProperty("volume")
    BigDecimal amountUSD;

    Long timestamp;
}
