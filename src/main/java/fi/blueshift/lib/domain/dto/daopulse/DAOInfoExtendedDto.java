package fi.blueshift.lib.domain.dto.daopulse;

import fi.blueshift.lib.domain.enums.daopulse.StatisticsType;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString(callSuper = true)
public class DAOInfoExtendedDto extends DAOInfoDto implements Serializable {


    private static final long serialVersionUID = 1324739893553586629L;

    @ApiModelProperty(notes = "Token that is represent DAO")
    private TokenDto nativeToken;

    @ApiModelProperty(notes = "Token that makes possible to enter the DAO")
    private TokenDto governanceToken;

    @ApiModelProperty(notes = "Deposit value of tokens to create proposal")
    private Double proposalDepositValue;

    private Double processingReward;

    private List<String> tags;

    @ApiModelProperty(notes = "List of statistic types that exists for DAO")
    private List<StatisticsType> existedStatisticTypesList;

    public DAOInfoExtendedDto(DAOInfoDto base) {
        super(base.toBuilder());
    }
}
