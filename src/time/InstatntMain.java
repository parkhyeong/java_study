package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstatntMain {

    public static void main(String[] args) {

        Instant now = Instant.now(); //UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(100); // 1970-01-01 부터 100초
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond(); // 1970-01-01부터 에포크
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
