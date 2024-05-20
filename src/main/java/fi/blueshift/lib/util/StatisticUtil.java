package fi.blueshift.lib.util;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.interpolation.LinearInterpolator;
import org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator;

import javax.validation.constraints.NotEmpty;
import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;


public class StatisticUtil {
    private static final int BIG_DECIMAL_SCALE = 18;
    private static final Double ONE_HUNDRED_DOUBLE = 100.0;
    private static final BigDecimal ONE_HUNDRED = BigDecimal.valueOf(ONE_HUNDRED_DOUBLE);
    private static final BigDecimal CALCULATION_ERROR = BigDecimal.ONE.divide(BigDecimal.valueOf(Math.pow(10, BIG_DECIMAL_SCALE - 1)), RoundingMode.UP);
    private final Long defaultUSDDecimals;

    public StatisticUtil(Long defaultUSDDecimals) {
        this.defaultUSDDecimals = defaultUSDDecimals;
    }

    public static boolean bigDecimalsEqualsWithCalcError(BigDecimal first, BigDecimal second){
        return first.subtract(second).abs().compareTo(CALCULATION_ERROR) <= 0;
    }


    public static BigDecimal getAmountFromDecimalAmount(BigDecimal decimalAmount, Integer decimalCoef) {
        if (isNull(decimalAmount) || isNull(decimalCoef)) {
            return BigDecimal.ZERO;
        }
        return decimalAmount.divide(BigDecimal.valueOf(Math.pow(10, decimalCoef)), decimalCoef, RoundingMode.HALF_UP);
    }

    public static BigDecimal getAmountFromDecimalAmount(BigInteger decimalAmount, Integer decimalCoef) {
        if (isNull(decimalAmount) || isNull(decimalCoef)) {
            return BigDecimal.ZERO;
        }
        return new BigDecimal(decimalAmount).divide(BigDecimal.valueOf(Math.pow(10, decimalCoef)), decimalCoef, RoundingMode.HALF_UP);
    }

    public static BigDecimal getDecimalAmountFromAmount(BigDecimal amount, Integer decimalCoef) {
        if (isNull(amount) || isNull(decimalCoef)) {
            return null;
        }
        return amount.multiply(BigDecimal.valueOf(Math.pow(10, decimalCoef))).setScale(0, RoundingMode.DOWN);
    }

    public static BigDecimal getAverage(BigDecimal... values) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal val : values) {
            sum = sum.add(val);
        }
        if (sum.compareTo(BigDecimal.ZERO) == 0) {
            return sum;
        }
        return sum.divide(new BigDecimal(values.length), RoundingMode.HALF_UP);
    }

    public static BigDecimal getAverage(List<BigDecimal> bigDecimals) {
        BigDecimal sum = bigDecimals.stream()
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        if (sum.compareTo(BigDecimal.ZERO) == 0) {
            return sum;
        }
        return sum.divide(new BigDecimal(bigDecimals.size()), RoundingMode.HALF_UP);
    }

    public static BigDecimal getRandomAmount(BigDecimal min, BigDecimal max) {
        BigDecimal randomBigDecimal = min.add(BigDecimal.valueOf(Math.random()).multiply(max.subtract(min)));
        return randomBigDecimal.setScale(BIG_DECIMAL_SCALE, RoundingMode.HALF_UP);
    }

    public static BigDecimal getAmountPlusRandomDelta(BigDecimal amount, BigDecimal delta) {
        return getRandomAmount(amount, amount.add(delta));
    }

    public static BigDecimal getAmountMinusRandomDelta(BigDecimal amount, BigDecimal delta) {
        return getRandomAmount(amount.subtract(delta), amount);
    }

    public static BigDecimal getAmountWithRandomDelta(BigDecimal amount, BigDecimal delta) {
        return getRandomAmount(amount.subtract(delta), amount.add(delta));
    }

    public static BigDecimal copyBigDecimalOf(BigDecimal value) {
        if (value == null || value.getClass() == BigDecimal.class)
            return value;
        return new BigDecimal(value.unscaledValue(), value.scale());
    }

    public static BigDecimal log10(BigDecimal b) {
        final int NUM_OF_DIGITS = BIG_DECIMAL_SCALE + 2;
        // need to add one to get the right number of dp
        //  and then add one again to get the next number
        //  so I can round it correctly.

        MathContext mc = new MathContext(NUM_OF_DIGITS, RoundingMode.HALF_EVEN);
        //special conditions:
        // log(-x) -> exception
        // log(1) == 0 exactly;
        // log of a number lessthan one = -log(1/x)
        if (b.signum() <= 0) {
            throw new ArithmeticException("log of a negative number! (or zero)");
        } else if (b.compareTo(BigDecimal.ONE) == 0) {
            return BigDecimal.ZERO;
        } else if (b.compareTo(BigDecimal.ONE) < 0) {
            return (log10((BigDecimal.ONE).divide(b, mc))).negate();
        }

        StringBuilder sb = new StringBuilder();
        //number of digits on the left of the decimal point
        int leftDigits = b.precision() - b.scale();

        //so, the first digits of the log10 are:
        sb.append(leftDigits - 1).append(".");

        //this is the algorithm outlined in the webpage
        int n = 0;
        while (n < NUM_OF_DIGITS) {
            b = (b.movePointLeft(leftDigits - 1)).pow(10, mc);
            leftDigits = b.precision() - b.scale();
            sb.append(leftDigits - 1);
            n++;
        }

        BigDecimal ans = new BigDecimal(sb.toString());

        //Round the number to the correct number of decimal places.
        ans = ans.round(new MathContext(ans.precision() - ans.scale() + BIG_DECIMAL_SCALE, RoundingMode.HALF_EVEN));
        return ans;
    }

    public static <T extends Comparable<T>> boolean isBetween(T value, T start, T end) {
        return value.compareTo(start) >= 0 && value.compareTo(end) <= 0;
    }

    public static BigDecimal calculateAmountChangePercent(BigDecimal amountCurrent, BigDecimal amountBefore) {
        BigDecimal amountChangePercent = BigDecimal.ZERO;
        if (nonNull(amountCurrent) && nonNull(amountBefore)) {
            if (amountBefore.compareTo(BigDecimal.ZERO) != 0) {
                amountChangePercent = amountCurrent.subtract(amountBefore)
                        .divide(amountBefore, amountBefore.scale(), RoundingMode.HALF_UP)//make scale like value before
                        .multiply(ONE_HUNDRED);
            } else if (amountCurrent.compareTo(BigDecimal.ZERO) != 0) {
                amountChangePercent = ONE_HUNDRED;
            }
        }
        return amountChangePercent;
    }

    public static Double calculateAmountChangePercent(Double amountCurrent, Double amountBefore) {
        double amountChangePercent = 0.0;
        if (nonNull(amountCurrent) && nonNull(amountBefore)) {
            if (amountBefore != 0.0) {
                amountChangePercent = (amountCurrent - amountBefore) / amountBefore * ONE_HUNDRED_DOUBLE;
            } else if (amountCurrent  != 0.0) {
                amountChangePercent = ONE_HUNDRED_DOUBLE;
            }
        }
        return amountChangePercent;
    }

    public static List<Point2D.Double> interpolatedPoints(@NotEmpty List<Point2D.Double> rawPointsList,
                                                          @NotEmpty List<Double> xGoalList) {
        double[] existedXPoints = rawPointsList.parallelStream().mapToDouble(Point2D::getX).toArray();
        double[] existedYPoints = rawPointsList.parallelStream().mapToDouble(Point2D::getY).toArray();

        UnivariateInterpolator interpolator = new LinearInterpolator();
        UnivariateFunction interpolateFunction = interpolator.interpolate(existedXPoints, existedYPoints);
        return xGoalList.parallelStream()
                .map(x -> new Point2D.Double(x, interpolateFunction.value(x)))
                .collect(Collectors.toList());
    }
}
