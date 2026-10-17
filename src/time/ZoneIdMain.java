package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId: ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        // 시스템이 사용하는 기본 ZoneId
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        // 타임존에서 직접 제공하는  zoneId를 반환한다.
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
