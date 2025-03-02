package basics.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Months month = Months.JANUARY;

        System.out.println(month);              // JANUARY
        System.out.println(month.name());       // JANUARY
        System.out.println(month.ordinal());    // 0
        System.out.println(month.getDays());    // 31

        System.out.println(Arrays.toString(Months.values()));  // [JANUARY, FEBRUARY, MARCH, APRIL, MAY]
    }
}
