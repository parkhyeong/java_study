package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간 = " +nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate= " + localDate);
        System.out.println("localTime= " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간+1000d = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜시간+1년 = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간 보다 이전인기? " +
                nowDt.isBefore(ofDt));

        System.out.println("현재 날짜시간이 지정 날짜시간 보다 이후인기? " +
                nowDt.isAfter(ofDt));

        System.out.println("현재 날짜시간이 지정 날짜시간이 같은가? " +
                nowDt.isEqual(ofDt)); // 시간적으로 같은지

        System.out.println("현재 날짜시간이 지정 날짜시간이 같은가? " +
                nowDt.equals(ofDt)); // 내부 데이터의 모든 구성요가가 타은지

    }
}
