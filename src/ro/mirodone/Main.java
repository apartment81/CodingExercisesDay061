package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        ReadableTime readableTime = new ReadableTime();
        System.out.println(readableTime.makeReadable(160));
        System.out.println(readableTime.makeReadable(5670));
        System.out.println(readableTime.makeReadable(80000));

        ReadableTime2 readableTime2 = new ReadableTime2();
        System.out.println(readableTime2.makeReadable(160));
        System.out.println(readableTime2.makeReadable(80000));
        

    }
}
