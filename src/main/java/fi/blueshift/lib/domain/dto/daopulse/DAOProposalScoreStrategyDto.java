package fi.blueshift.lib.domain.dto.daopulse;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@SuperBuilder
@Getter
@Setter
public class DAOProposalScoreStrategyDto implements Serializable {
    private static final long serialVersionUID = 2872597623772263054L;

    private String strategyName;

    private Integer strategyIndex;

    private Double score;
}
