// The calander function file
// Using JavaFx to create

//Imported librarys
import javax.swing.*; //For the window
import java.awt.*; //For colors
import java.time.DayOfWeek;
import java.util.*;

public class SOCCal{
    //Createing the lists of days and month names
    private static final String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static final String[] monthNames = { "January", "February", "March", "April", "May", "June", "July","August", "September", "October", "November", "December" };
    
    //Private jframe elements for storing in ram beforehand? idk
    private JPanel userInputInternalFrame;
    private SpringLayout userInputLayout;
    private JButton userConfirm;
    private JFrame calenderFrame;
    private JTable calenderTable;
    private JList monthList = new JList<>(monthNames);

    private JTextField usersName;
    private JLabel nameLabel;


    //Creating class objs
    SOCData theData = new SOCData();

    //Creating the calender UI
    public void calenderUi() {
        //Creating the calender frame
        calenderFrame = new JFrame("SOC Management APP"); 

        //Adding addtional elements
        calenderUserIn();

        // Calander Size & Parameters
        calenderFrame.setSize(1080,480);
        calenderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calenderFrame.setResizable(false);
        calenderFrame.setVisible(true);
    }

    //Creating the month panel
    public void calenderMonth() {

    }

    //Information for when user clicks on a event and to pop up something and show all info & discription + ability to delete event
    public void dayInfo() {

    }

    //Creating slot for userinput 
    public void calenderUserIn() {
        // .setBackround(Color.green) //sets backround to green; 

        
        //Creating a internal frame to hold the userinput
        JPanel userInputInternalFrame = new JPanel();
        userInputInternalFrame.setLocation(10,10);
        userInputInternalFrame.setSize(10,10);

        //Creating a layout
        SpringLayout userInputLayout = new SpringLayout();

        //Adding the textfields and text entry into layout
        //Name
        JTextField usersName = new JTextField(15);
        JLabel userNameLabel = new JLabel("Name");
        userInputInternalFrame.add(userNameLabel);
        userInputInternalFrame.add(usersName);
        
        //Date


        //Time (Probably like a dropdown menu than text input)


        //Event Name


        //Event Discription

        //Creating the userinput confirmation button
        JButton userConfirm = new JButton("Enter");
        userConfirm.setBounds(100, 100, 15, 5);
        userInputInternalFrame.add(userConfirm);

        // Adding to main and showing
        calenderFrame.add(userInputInternalFrame);
        userInputInternalFrame.setVisible(true);
    }

    public void eventList() { //List of all events/ items + ability to delete events

    }

    public void eventDelete() {
        
    }

    public void actionPerformed(Action event){ //Detects if event is performed and then returns confirmation

    }

    
}