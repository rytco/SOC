// User Input Class

import java.util.*;

public class SOCUserIn {
    private String personDiscription;
    private String personName;
    private int personDate;
    private int personTime;
    aaa
    
    public void userTimetableIn() {
        Scanner userInput = new Scanner(System.in); //Creates scanner
        
        //Gets a individuals information
        personName = userInput.nextLine();
        personDiscription = userInput.nextLine();
        personDate = userInput.nextInt();
        personTime = userInput.nextInt();

        //Close Scanner
        userInput.close();
    }
}