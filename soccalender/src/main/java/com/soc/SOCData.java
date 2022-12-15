// Data Stuff

package com.soc;

//Imported librarys
import java.time.*;
import java.util.*;
import javax.json.*;

class SOCData { 
    //Date mem save
    public int month;
    public int year;
    public int currentDay;
    public int daysOfMonth;

    public long monthGet() { //Gets the month
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int month = localDate.getMonthValue(); //uses obj above to get the month

        return(month);
    }

    public long yearGet() { //Gets the year
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int year = localDate.getYear(); //uses obj above to get the year

        return(year);
    }

    public long dayGet() { //Gets the day
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int currentDay = localDate.getDayOfMonth(); //uses obj above to get the day

        return(currentDay);
    }

    public int daysInMonth() { //Gets the days in a month
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int daysOfMonth = localDate.lengthOfMonth(); //uses obj above to get the days in a month

        return(daysOfMonth);
    }
}