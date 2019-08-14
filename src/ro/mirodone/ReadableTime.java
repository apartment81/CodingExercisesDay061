package ro.mirodone;

public class ReadableTime {

    public  String makeReadable(int seconds) {

        int hour = (int) Math.floor(seconds / 3600);
        int minute = (int) Math.floor((seconds % 3600) / 60);
        int second = (seconds % 3600) - minute * 60;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Clever solution

    //return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);

}
