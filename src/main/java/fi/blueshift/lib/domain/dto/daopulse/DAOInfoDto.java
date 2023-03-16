package fi.blueshift.lib.domain.dto.daopulse;

import com.fasterxml.jackson.annotation.JsonProperty;
import fi.blueshift.lib.domain.enums.daopulse.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class DAOInfoDto extends BaseDto implements Serializable {


    private static final long serialVersionUID = 1324739893553586629L;

    @NotBlank
    private String name;

    private String slug;

    private String symbol;

    private Boolean status;

    private DAOType type;

    @ApiModelProperty(notes = "Applied brief description of this token. This field will return null if a description is not available.")
    private String description;

    @ApiModelProperty(notes = " Link to hosted logo png for this token.\n" +
            "    64px is default size returned. Replace \"64x64\" in the image path with these alternative sizes: 16, 32, 64, 128, 200")
    @JsonProperty("logo")
    private String logoUrl;

    private DAOParticipationType participationType;

    @ApiModelProperty(notes = "Date of DAO launched/founded")
    private LocalDateTime foundedAt;

    @ApiModelProperty(notes = "Native blockchain platform")
    private CryptoAddressDto platformNetwork;

    private DAOTechnologyType technology;

    @ApiModelProperty(notes = "Native DAO platform//DAO maker")
    private CryptoAddressDto platformBasedOn;

    private DAOGovernanceStructureType governanceStructure;

    @ApiModelProperty(notes = "Power of control (protocol parameters, full control of a protocol, etc.)")
    private DAOPowerOfControlType powerOfControl;

    @ApiModelProperty(notes = "Primary url to DAO platform")
    private String officialUrl;

    @ApiModelProperty(notes = "All known social links to DAO platform")
    private List<SocialProfileDto> socialProfiles;

    @ApiModelProperty(notes = "Wallets that contains approved tokens list of DAO (ETH, their own token, stablecoins, other altcoins)")
    private List<WalletDto> treasureWalletList;
}
