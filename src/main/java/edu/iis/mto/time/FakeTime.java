package edu.iis.mto.time;

import org.joda.time.DateTime;


public class FakeTime {

    public int getHours(){
        return  new DateTime().getHourOfDay()+25;
    }

}
