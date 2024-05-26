package fi.blueshift.lib.domain.model.bluesbots;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class YieldPoolTvlDto {

    //in BLUES token
    BigDecimal amount;

    BigDecimal volumeUSD;

    Long timestamp;
}
