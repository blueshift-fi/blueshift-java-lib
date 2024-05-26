package fi.blueshift.lib.domain.enums;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum SocialProfileType {
    OFFICIAL,
    TWITTER,
    TELEGRAM,
    FACEBOOK,
    MEDIUM,
    YOUTUBE,
    REDDIT,
    DISCORD,
    GIT_PLATFORM,
    CHAT_PLATFORM,
    EXPLORER,
    WHITE_PAPER_DOC,
    INFO_WEBSITE,
    TECHNICAL,
    OTHER;

    public static SocialProfileType parseType(String profileName) {
        if (profileName.equals("website")) {
            return OFFICIAL;
        }
        return Arrays.stream(SocialProfileType.values()).parallel()
                .filter(type -> type.name().contains(profileName))
                .findFirst().orElse(OTHER);
    }
}