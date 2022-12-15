// The calander function file
// Using JavaFx to create

package com.soc;

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
    private JList dayList = new JList<>(daysOfWeek);

    //Creating class objs
    SOCData theData = new SOCData();

    //Creating the calender main UI
    public void calenderUi() {
        //Creating the calender frame
        calenderFrame = new JFrame("SOC Management APP"); 

        //Adding addtional elements
        calenderUserIn();

        // Calander Size & Parameters
        calenderFrame.setSize(1780,1020);
        calenderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calenderFrame.setResizable(true);
        calenderFrame.setVisible(true);
    }

    //Creating the month panel
    public void calenderMonth() {

    }

    public void dayData() { //Used to read/ show the data of each date

    }

    //Information for when user clicks on a event and to pop up something and show all info & discription + ability to delete event
    public void dayInfo(String string) {
        //Creating popup
        JFrame dayPopUp = new JFrame();

        //Creating delete promt for that option
        JButton deleteInfo = new JButton();
       
        //Getting days info
        String dayInfoMessage = "";

        //Text box of the information
        

        //Adding elements to the JDialog
        dayPopUp.setSize(200,100);
        dayPopUp.add(deleteInfo);
        dayPopUp.setVisible(true);
    }

    //Creating slot for userinput 
    public void calenderUserIn() {        
        //Creating a internal frame to hold the userinput
        JPanel userInputInternalFrame = new JPanel();
        userInputInternalFrame.setPreferredSize(new Dimension(500, 500));
        userInputInternalFrame.setBackground(Color.DARK_GRAY);

        //Creating a layout
        SpringLayout userInputLayout = new SpringLayout();

        //Adding the textfields and text entry into layout
        //Name
        JTextField usersName = new JTextField(15);
        JLabel userNameLabel = new JLabel("Name");
        
        //Date
        JTextField userDate = new JTextField(15);
        JLabel userDateLabel = new JLabel("Date");
        
        //Time (Probably like a dropdown menu than text input)
        JTextField userTime = new JTextField(15);
        JLabel userTimeLabel = new JLabel("Time");

        //Event Name
        JTextField userEvent = new JTextField(15);
        JLabel userEventLabel = new JLabel("Event");

        //Event Discription
        JTextField eventDiscription = new JTextField(15);
        JLabel eventDiscriptionLabel = new JLabel("Discription");

        //Adding items to the layout
        //For the label
        // Setting the Left (West) 5 pizels from the left side of the userInputinternal frame
        userInputLayout.putConstraint(SpringLayout.WEST, userNameLabel, 5, SpringLayout.WEST, userInputInternalFrame);
        // Setting the top (north) edge of the label x below the top of the userInputinternal frame
        userInputLayout.putConstraint(SpringLayout.NORTH, userNameLabel, 5,SpringLayout.NORTH, userInputInternalFrame);
        //For the textbox
        userInputLayout.putConstraint(SpringLayout.WEST, usersName, 5, SpringLayout.EAST, userNameLabel); //Sets the 
        userInputLayout.putConstraint(SpringLayout.NORTH, usersName, 5, SpringLayout.NORTH, userInputInternalFrame);

        //Creating the userinput confirmation button
        JButton userConfirm = new JButton("Enter");
        userConfirm.setBounds(100, 100, 15, 5);
        //userInputInternalFrame.add(userConfirm);

        //Showing all the items
        userInputInternalFrame.add(userNameLabel);
        userInputInternalFrame.add(usersName);
        //userInputInternalFrame.add(userDateLabel);
        //userInputInternalFrame.add(userDate);
        //userInputInternalFrame.add(userTimeLabel);
        //userInputInternalFrame.add(userTime);
        //userInputInternalFrame.add(userEventLabel);
        //userInputInternalFrame.add(userEvent);
        //userInputInternalFrame.add(ueventDiscriptionLabel);
        //userInputInternalFrame.add(eventDiscription);

        // Adding to main and showing
        calenderFrame.add(userInputInternalFrame, BorderLayout.LINE_START);
        userInputInternalFrame.setVisible(true);
    }

    public void eventList() { //List of all events/ items + ability to delete events
        // .setBackround(Color.green) //sets backround to green; 
    }

    public void eventDelete() {
        
    }

    public void actionPerformed(Action event){ //Detects if event is performed and then returns confirmation

    }
}