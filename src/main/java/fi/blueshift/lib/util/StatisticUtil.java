package fi.blueshift.lib.util;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.interpolation.LinearInterpolator;
import org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class StatisticUtil {

    private final BigDecimal oneHundred = BigDecimal.valueOf(100);
    @Value("${config.token.usd-decimals}")
    private Long defaultUSDDecimals;

    public static BigDecimal getAmountFromDecimal(BigDecimal decimalAmount, Long decimalCoef) {
        if (isNull(decimalAmount) || isNull(decimalCoef)) {
            return BigDecimal.ZERO;
        }
        return decimalAmount.divide(BigDecimal.valueOf(Math.pow(10, decimalCoef)), decimalCoef.intValue(), RoundingMode.HALF_UP);
    }

    public static BigDecimal getDecimalFromAmount(BigDecimal amount, Long decimalCoef) {
        if (isNull(amount) || isNull(decimalCoef)) {
            return null;
        }
        return amount.multiply(BigDecimal.valueOf(Math.pow(10, decimalCoef)));
    }

    public BigDecimal calculateAmountChangePercent(BigDecimal amountCurrent, BigDecimal amountBefore) {
        BigDecimal amountChangePercent = BigDecimal.ZERO;
        if (nonNull(amountCurrent) && nonNull(amountBefore)) {
            if (amountBefore.compareTo(BigDecimal.ZERO) != 0) {
                amountChangePercent = amountCurrent.subtract(amountBefore)
                        .divide(amountBefore, defaultUSDDecimals.intValue(), RoundingMode.HALF_UP)
                        .multiply(oneHundred);
            } else if (amountCurrent.compareTo(BigDecimal.ZERO) != 0) {
                amountChangePercent = oneHundred;
            }
        }
        return amountChangePercent;
    }

    public List<Point2D.Double> interpolatedPoints(@NotEmpty List<Point2D.Double> rawPointsList,
                                                   @NotEmpty List<Double> xGoalList) {
        var existedXPoints = rawPointsList.parallelStream().mapToDouble(Point2D::getX).toArray();
        var existedYPoints = rawPointsList.parallelStream().mapToDouble(Point2D::getY).toArray();

        UnivariateInterpolator interpolator = new LinearInterpolator();
        UnivariateFunction interpolateFunction = interpolator.interpolate(existedXPoints, existedYPoints);
        return xGoalList.parallelStream()
                .map(x -> new Point2D.Double(x, interpolateFunction.value(x)))
                .collect(Collectors.toList());
    }
}
