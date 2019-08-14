package ro.mirodone;

import java.time.Duration;

public class ReadableTime2 {

    public String makeReadable(int seconds) {

        Duration duration = Duration.ofSeconds(seconds);

        long hour = duration.toHours();
        long min = duration.minusHours(hour).toMinutes();
        long sec = duration.minusHours(hour).minusMinutes(min).toSeconds();

        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
