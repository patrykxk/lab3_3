package edu.iis.mto.time;

import org.joda.time.DateTime;


public class FakeTime {
    private static final long TWENTY_FIVE_HOURS = 25*60*60*1000;

    public long currentTimeMillis(){
        return  System.currentTimeMillis() + TWENTY_FIVE_HOURS;
    }
    public int hoursBetweenMs(long start, long end ){
        return (int)(end-start)/(60*60*1000);
    }

}
