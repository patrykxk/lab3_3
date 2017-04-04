package edu.iis.mto.time;

public class FakeTime {
    private static final long TWENTY_FIVE_HOURS = 25*60*60*1000;

    public static long currentTimeMillis(){
        return  System.currentTimeMillis() + TWENTY_FIVE_HOURS;
    }
    public static int hoursBetweenMs(long start, long end ){
        return (int)(end-start)/(60*60*1000);
    }

}
