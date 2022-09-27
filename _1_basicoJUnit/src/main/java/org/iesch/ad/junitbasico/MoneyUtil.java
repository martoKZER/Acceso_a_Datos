package org.iesch.ad.junitbasico;

import java.math.BigDecimal;

public class MoneyUtil {
    public static String format(double money){
        String simbolo= "$";
        if (money < 0) {
            simbolo = "-$";
            money = money * -1;
        }
            BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return simbolo+rounded;
    }


    public String format(double mont, double symbol) {
        return"";
    }
}
