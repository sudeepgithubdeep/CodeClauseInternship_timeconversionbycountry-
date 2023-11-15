import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> countryTimeZoneMap = new HashMap<>();
        countryTimeZoneMap.put("IN", "Asia/Kolkata");
        countryTimeZoneMap.put("US", "America/New_York");
        countryTimeZoneMap.put("UK", "Europe/London");
        countryTimeZoneMap.put("CA", "America/Toronto");
        countryTimeZoneMap.put("AU", "Australia/Sydney");

        String countryCode = "IN"; // Provide your country code here
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of(countryTimeZoneMap.get(countryCode));
        LocalDateTime zonedDateTime = localDateTime.atZone(zoneId).toLocalDateTime();
        System.out.println("Current time in " + countryCode + " is: " + zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}