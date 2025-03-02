package basics.enums;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY;

    public int getDays() {
        return switch(this) {
            case JANUARY, MARCH -> 31;
            case FEBRUARY -> 28;
            case APRIL -> 30;
            default -> 3;
        };
    }
}
