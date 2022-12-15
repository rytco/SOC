// Data Stuff

import java.time.*;
import java.util.*;

class SOCData {
    public int month;
    public int year;
    public int currentDay;
    public int daysOfMonth;

    public long monthGet() {
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int month = localDate.getMonthValue(); //uses obj above to get the month

        return(month);
    }

    public long yearGet() {
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int year = localDate.getYear(); //uses obj above to get the year

        return(year);
    }

    public long dayGet() {
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int currentDay = localDate.getDayOfMonth(); //uses obj above to get the day

        return(currentDay);
    }

    public int daysInMonth() {
        Date date = new Date(); //Creates data obj from java.util
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Gets the local date
        int daysOfMonth = localDate.lengthOfMonth(); //uses obj above to get the days in a month

        return(daysOfMonth);
    }
}