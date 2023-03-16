package fi.blueshift.lib.domain.dto.daopulse;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@SuperBuilder
@Getter
@Setter
public class DAOProposalStrategyDto implements Serializable {

    private static final long serialVersionUID = 7739479885986129896L;

    private Integer strategyIndex;

    private String name;

    private String network;

    private StrategyParamsDto params;

    @EqualsAndHashCode
    @NoArgsConstructor
    @ToString(of = {"symbol", "address"})
    @SuperBuilder
    @Getter
    @Setter
    public static class StrategyParamsDto implements Serializable {

        private static final long serialVersionUID = 6577079361435158908L;
        private String symbol;
        private String address;
        private BigDecimal decimals;
    }
}
