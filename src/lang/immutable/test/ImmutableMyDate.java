package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, this.month, this.day);
    }

    // 불변객체 바꿔서 반환할때 with 많이씀
    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, this.day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
