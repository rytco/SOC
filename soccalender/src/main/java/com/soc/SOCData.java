// Data Stuff

package com.soc;

//Imported librarys
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.json.simple.JSONObject;

class SOCData { 
    //Date mem save
    public int month;
    public int year;
    public int currentDay;
    public int daysOfMonth;

    public void writeData(String name, String eventName, String discription, String date, String time) {
        // Creating a json object to add info too
        JSONObject userInfo = new JSONObject();
        userInfo.put("Name", name);
        userInfo.put("Event Name", eventName);
        userInfo.put("Discription", discription);
        
        // Writing to the JSON File
        try (FileWriter fileJSON = new FileWriter("userInfoFile.json")){
            // Writes info to file
            fileJSON.write(userInfo.toJSONString()); 
            fileJSON.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeData() { // TODO remove data from JSON Folder
    
    }

    public void readData() { // TODO read data from JSON Folder

    }

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