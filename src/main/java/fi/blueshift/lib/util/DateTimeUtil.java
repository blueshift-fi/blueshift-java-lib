package fi.blueshift.lib.util;

import fi.blueshift.lib.domain.enums.FrequencyIntervalType;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.util.Objects.isNull;

public class DateTimeUtil {
    //rounded date time minus seconds
    private static final long ROUND_TIMESTAMP_COEF_MILLISEC = 10 * 1000;

    /**
     * get timestamp from DateTime with milliseconds
     * @param dateTime the date for convert
     * @return timsetamp
     */
    public static Long getTimestamp(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.atZone(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    /**
     * get timestamp from DateTime with seconds
     *
     * @param dateTime the date for convert
     * @return timsetamp
     */
    public static Long getTimestampSec(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.atZone(ZoneOffset.UTC).toInstant().getEpochSecond();
    }

    public static LocalDateTime getDateTime(Long timestamp) {
        if (isNull(timestamp) || timestamp <= 0L) {
            return null;
        }
        int length = (int) (Math.log10(timestamp) + 1);
        if (length > 10) {
            // normalize timestamp to milliseconds format
            int standardizeCoef = (int) Math.pow(10, 13 - length);
            return getDateTimeWithMilli(timestamp * standardizeCoef);
        }
        return getDateTimeWithSec(timestamp);
    }

    public static Long getTimestampInSeconds(Long timestamp) {
        if (isNull(timestamp) || timestamp <= 0L) {
            return null;
        }
        int length = (int) (Math.log10(timestamp) + 1);
        if (length > 10) {
            return timestamp / 1000;
        }
        return timestamp;
    }

    private static LocalDateTime getDateTimeWithSec(Long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), ZoneOffset.UTC);
    }

    private static LocalDateTime getDateTimeWithMilli(Long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneOffset.UTC);
    }

    @SuppressWarnings("ConstantConditions")
    public static Long getRoundedTimestamp(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        Long timestamp = getTimestamp(dateTime);
        //round timestamp upon 10 secs
        return timestamp - timestamp % ROUND_TIMESTAMP_COEF_MILLISEC;
    }

    //<editor-fold desc="TemporalAdjusters">
    public static LocalDateTime atStartOfDay(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.toLocalDate().atStartOfDay();
    }

    public static LocalDateTime atEndOfDay(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.toLocalDate().atTime(23, 59, 59, 999000000);
    }

    public static LocalDateTime atStartOfWeek(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        TemporalField weekUS = WeekFields.of(Locale.US).dayOfWeek();
        return dateTime.toLocalDate().with(weekUS, 1).atStartOfDay();
    }

    public static LocalDateTime atEndOfWeek(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        TemporalField weekUS = WeekFields.of(Locale.US).dayOfWeek();
        return dateTime.toLocalDate().with(weekUS, 7).atTime(23, 59, 59, 999000000);
    }

    public static LocalDateTime atEndOfMonth(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.toLocalDate().with(lastDayOfMonth()).atTime(23, 59, 59, 999000000);
    }

    public static LocalDateTime atStartOfMonth(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.toLocalDate().withDayOfMonth(1).atStartOfDay();
    }

    public static LocalDateTime atStartOfDecade(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        int decadeNum = (int) Math.round(dateTime.getMonthValue() / 3.0);
        return dateTime.toLocalDate().withMonth(decadeNum).atStartOfDay();
    }

    public static LocalDateTime atEndOfDecade(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        int decadeNum = (int) Math.round(dateTime.getMonthValue() / 3.0);
        return dateTime.toLocalDate().withMonth(decadeNum).atTime(23, 59, 59, 999000000);
    }

    public static LocalDateTime atStartOfHalfYear(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        int halfYear = dateTime.getMonthValue() * 2 > 12 ? 2 : 1;
        return dateTime.toLocalDate().withDayOfMonth(halfYear).atStartOfDay();
    }

    public static LocalDateTime atEndOfHalfYear(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        int halfYear = dateTime.getMonthValue() * 2 > 12 ? 2 : 1;
        return dateTime.toLocalDate().withMonth(halfYear).atTime(23, 59, 59, 999000000);
    }

    public static LocalDateTime atStartOfYear(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.toLocalDate().withMonth(1).atStartOfDay();
    }

    public static LocalDateTime atEndOfYear(LocalDateTime dateTime) {
        if (isNull(dateTime)) {
            return null;
        }
        return dateTime.toLocalDate().withMonth(12).atTime(23, 59, 59, 999000000);
    }

    public static LocalDateTime addIntervalToDateTime(LocalDateTime date, FrequencyIntervalType interval) {
        switch (interval) {
//            case MINUTES_10:
//                return date.plusMinutes(10);
            case HOURS_1:
                return date.plusHours(1);
            case HOURS_24:
                return date.plusDays(1);
            case WEEK_1:
                return date.plusWeeks(1);
            case MONTHS_1:
                return date.plusMonths(1);
            case MONTHS_3:
                return date.plusMonths(3);
            case MONTHS_6:
                return date.plusMonths(6);
            case MONTHS_12:
                return date.plusYears(1);
        }
        return date;
    }

    public static LocalDateTime minusIntervalToDateTime(LocalDateTime date, FrequencyIntervalType interval) {
        switch (interval) {
//            case MINUTES_10:
//                return date.minusMinutes(10);
            case HOURS_1:
                return date.minusHours(1);
            case HOURS_24:
                return date.minusDays(1);
            case WEEK_1:
                return date.minusWeeks(1);
            case MONTHS_1:
                return date.minusMonths(1);
            case MONTHS_3:
                return date.minusMonths(3);
            case MONTHS_6:
                return date.minusMonths(6);
            case MONTHS_12:
                return date.minusYears(1);
        }
        return date;
    }

    public static List<LocalDateTime> composeTimeSeriesPeriod(LocalDateTime fromDate, LocalDateTime toDate, FrequencyIntervalType interval) {
        List<LocalDateTime> timePeriod = new ArrayList<>();
        LocalDateTime currentDate = fromDate;
        while (currentDate.isBefore(toDate)) {
            timePeriod.add(currentDate);
            currentDate = DateTimeUtil.addIntervalToDateTime(currentDate, interval);
        }
        timePeriod.add(toDate);
        return timePeriod;
    }

    public static List<LocalDateTime> composeRoundedTimeSeriesPeriod(LocalDateTime fromDate, LocalDateTime toDate, FrequencyIntervalType interval) {
        switch (interval) {
            case HOURS_1:
                fromDate = roundDateTimeOnInterval(fromDate, interval);
                toDate = roundDateTimeOnInterval(toDate, interval);
                break;
            case HOURS_24:
                fromDate = atStartOfDay(fromDate);
                toDate = atEndOfDay(toDate);
                break;
            case WEEK_1:
                fromDate = atStartOfWeek(fromDate);
                toDate = atEndOfWeek(toDate);
                break;
            case MONTHS_1:
                fromDate = atStartOfMonth(fromDate);
                toDate = atEndOfMonth(toDate);
                break;
            case MONTHS_3:
                fromDate = atStartOfDecade(fromDate);
                toDate = atEndOfDecade(toDate);
                break;
            case MONTHS_6:
                fromDate = atStartOfHalfYear(fromDate);
                toDate = atEndOfHalfYear(toDate);
                break;
            case MONTHS_12:
                fromDate = atStartOfYear(fromDate);
                toDate = atEndOfYear(toDate);
                break;
        }
        return composeTimeSeriesPeriod(fromDate, toDate, interval);
    }

    public static LocalDateTime roundDateTimeOnInterval(LocalDateTime date, FrequencyIntervalType interval) {
        LocalDateTime newDate;
        try {
            newDate = date.truncatedTo(interval);
            if (!date.equals(newDate)) {
                long dif = ChronoUnit.MILLIS.between(newDate, date);
                if (dif >= interval.getMilliSeconds() / 2.0) {
                    newDate = addIntervalToDateTime(newDate, interval);
                }
            }
        } catch (Exception e) {
            return date;
        }
        return newDate;
    }

    //</editor-fold>
}
