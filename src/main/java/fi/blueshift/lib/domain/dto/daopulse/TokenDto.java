package fi.blueshift.lib.domain.dto.daopulse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
public class TokenDto extends BaseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -7885740127426704204L;

    @ApiModelProperty(notes = "The name of this token (cryptocurrency)")
    private String name;

    @ApiModelProperty(notes = "The ticker symbol for this token.")
    private String symbol;

    @ApiModelProperty(notes = "The web URL friendly shorthand version of this token name.")
    private String slug;

    private Boolean status;

    @ApiModelProperty(notes = " Link to hosted logo png for this token.\n" +
            "    64px is default size returned. Replace \"64x64\" in the image path with these alternative sizes: 16, 32, 64, 128, 200")
    @JsonProperty("logo")
    private String logoUrl;

    @ApiModelProperty(notes = "Timestamp (ISO 8601) of when this token was added to marketProvider.")
    private LocalDateTime foundedAt;

    @ApiModelProperty(notes = "The category for this token.")
    private String category;

    //!TEXT type
    @ApiModelProperty(notes = "Applied brief description of this token. This field will return null if a description is not available.")
    private String description;

    //!TEXT type
    @ApiModelProperty(notes = "A Markdown formatted notice that may highlight a significant event or condition that is impacting\n" +
            "    the token or how it is displayed, otherwise null. A notice may highlight a recent or upcoming mainnet\n" +
            "    swap, symbol change, exploit event, or known issue with a particular exchange or market, for example..")
    private String notice;

    @ApiModelProperty(notes = "Tags associated with this token.")
    private List<String> tags;

    @ApiModelProperty(notes = "An object containing various resource URLs for this token.")
    private List<SocialProfileDto> socialProfiles;

    @ApiModelProperty(notes = "Metadata about the native token platform.")
    private CryptoAddressDto addressPrimary;

    @ApiModelProperty(notes = "All addresses for token (related contract) on other platforms")
    private Set<CryptoAddressDto> addressList;

}
