package fi.blueshift.lib.domain.enums;

import io.leangen.graphql.annotations.types.GraphQLType;

import java.time.Duration;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;

@GraphQLType(name = "IntervalType")
public enum FrequencyIntervalType implements TemporalUnit {
    MINUTES_10("10m", Duration.ofMinutes(10), "10 minutes", "10m", null),
    HOURS_1("1h", Duration.ofHours(1), "1 hour", "1h", null),
    HOURS_24("1D", Duration.ofHours(24), "1 day", "24h", "1d"),
    DAYS_7("7d", Duration.ofDays(7), "1 week", "1w", "7d"),
    DAYS_30("30d", Duration.ofDays(7) /*Duration.ofSeconds(31556952L / 12)*/, "30 days (almost 1 month)", "1month", "1M"),
    MONTHS_3("3M", Duration.ofSeconds(31556952L / 4), "3 months", "3month", "3M"),
    MONTHS_6("6M", Duration.ofSeconds(31556952L / 2), "6 months", "6month", null),
    MONTHS_12("1Y", Duration.ofSeconds(31556952L), "1 year", "12month", null),
    ;

    private final String typeName;
    private final Duration duration;
    private final String nameIntervalForGlassnode;

    private final String nameIntervalForCoinMarket;
    private final String description;

    FrequencyIntervalType(String typeName, Duration duration, String description, String nameIntervalForGlassnode, String nameIntervalForCoinMarket) {
        this.typeName = typeName;
        this.duration = duration;
        this.nameIntervalForGlassnode = nameIntervalForGlassnode;
        this.description = description;
        this.nameIntervalForCoinMarket = nameIntervalForCoinMarket;
    }

    public static FrequencyIntervalType fromType(String type) {
        return Arrays.stream(FrequencyIntervalType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getTypeName() {
        return typeName;
    }

    public String getDescription() {
        return description;
    }

    public String getNameForGlassnode() {
        return this.nameIntervalForGlassnode;
    }

    public String getNameIntervalForCoinMarket() {
        return this.nameIntervalForCoinMarket;
    }

    public long getMilliSeconds() {
        return duration.toMillis();
    }

    public long getNanoSeconds() {
        return duration.toNanos();
    }

    //-----------------------------------------------------------------------

    /**
     * Gets the estimated duration of this unit in the ISO calendar system.
     * <p>
     * All of the units in this class have an estimated duration.
     * Days vary due to daylight saving time, while months have different lengths.
     *
     * @return the estimated duration of this unit, not null
     */
    @Override
    public Duration getDuration() {
        return duration;
    }

    /**
     * Checks if the duration of the unit is an estimate.
     * <p>
     * All time units in this class are considered to be accurate, while all date
     * units in this class are considered to be estimated.
     * <p>
     * This definition ignores leap seconds, but considers that Days vary due to
     * daylight saving time and months have different lengths.
     *
     * @return true if the duration is estimated, false if accurate
     */
    @Override
    public boolean isDurationEstimated() {
        return this.compareTo(HOURS_24) >= 0;
    }

    //-----------------------------------------------------------------------

    /**
     * Checks if this unit is a date unit.
     * <p>
     * All units from days to eras inclusive are date-based.
     * Time-based units and {@code FOREVER} return false.
     *
     * @return true if a date unit, false if a time unit
     */
    @Override
    public boolean isDateBased() {
        return this.compareTo(HOURS_24) >= 0;
    }

    /**
     * Checks if this unit is a time unit.
     * <p>
     * All units from nanos to half-days inclusive are time-based.
     * Date-based units and {@code FOREVER} return false.
     *
     * @return true if a time unit, false if a date unit
     */
    @Override
    public boolean isTimeBased() {
        return this.compareTo(HOURS_24) < 0;
    }

    //-----------------------------------------------------------------------
    @Override
    public boolean isSupportedBy(Temporal temporal) {
        return temporal.isSupported(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Temporal> R addTo(R temporal, long amount) {
        return (R) temporal.plus(amount, this);
    }

    //-----------------------------------------------------------------------
    @Override
    public long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive) {
        return temporal1Inclusive.until(temporal2Exclusive, this);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
        return name();
    }
}
