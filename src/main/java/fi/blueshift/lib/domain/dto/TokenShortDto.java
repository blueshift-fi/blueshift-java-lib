package fi.blueshift.lib.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class TokenShortDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -6278878744165190026L;

    /**
     * token address
     */
    String addressId;

    /**
     * token symbol
     */
    String symbol;
}
