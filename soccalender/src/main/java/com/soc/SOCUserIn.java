// User Input Class/ Write to save

//Imported librarys
import java.util.*;
import java.io.FileReader;
import javax.json.J

public class SOCUserIn {
    private String personDiscription;
    private String personName;
    private int personDate;
    private int personTime;
    
    public void userTimetableIn() { //Gets information from SOCCal.calenderUserIn then writes to file to save 
        Scanner userInput = new Scanner(System.in); //Creates scanner
        
        //Gets a individuals information
        personName = userInput.nextLine();
        personDiscription = userInput.nextLine();
        personDate = userInput.nextInt();
        personTime = userInput.nextInt();

        //Close Scanner
        userInput.close();
    }

    private void userInfoDataWrite(){ //Writes data into a json file

    }

    public void userInfoDataRead() { //Reads data if written and returns it 

    }
}