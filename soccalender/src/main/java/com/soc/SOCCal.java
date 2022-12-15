// The calander function file
// Using JavaFx to create

package com.soc;

//For colors
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;

import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
//Imported librarys
//For the window
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

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

    public void dayData() { //Used to read/show the data of each date

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
        JTextField usersName = new JTextField(30);
        JLabel userNameLabel = new JLabel("Name:");
        //Setting name color and size
        userNameLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        userNameLabel.setForeground(Color.white);

        //Date
        JTextField userDate = new JTextField(30);
        JLabel userDateLabel = new JLabel("Date:");
        //Setting color and size
        userDateLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        userDateLabel.setForeground(Color.white);

        //Time (Probably like a dropdown menu than text input)
        JTextField userTime = new JTextField(30);
        JLabel userTimeLabel = new JLabel("Time:");
        userTimeLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        userTimeLabel.setForeground(Color.white);

        //Event Name
        JTextField userEvent = new JTextField(30);
        JLabel userEventLabel = new JLabel("Event:");
        userEventLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        userEventLabel.setForeground(Color.white);

        //Event Discription
        JTextField eventDiscription = new JTextField(25);
        JLabel eventDiscriptionLabel = new JLabel("Discription:");
        eventDiscriptionLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        eventDiscriptionLabel.setForeground(Color.white);

        //Adding items to the layout
        //For the label
        // Setting the Left (West) 5 pizels from the left side of the userInputinternal frame
        userInputLayout.putConstraint(SpringLayout.WEST, userNameLabel, 15, SpringLayout.WEST, userInputInternalFrame);
        // Setting the top (north) edge of the label x below the top of the userInputinternal frame
        userInputLayout.putConstraint(SpringLayout.NORTH, userNameLabel, 15,SpringLayout.NORTH, userInputInternalFrame);
        //For the textbox
        userInputLayout.putConstraint(SpringLayout.WEST, usersName, 5, SpringLayout.EAST, userNameLabel);
        userInputLayout.putConstraint(SpringLayout.NORTH, usersName, 0, SpringLayout.NORTH, userInputInternalFrame);

        //Setting Date
        userInputLayout.putConstraint(SpringLayout.SOUTH, userNameLabel, 15,SpringLayout.NORTH, userDateLabel);
        userInputLayout.putConstraint(SpringLayout.WEST, userInputInternalFrame, 15, SpringLayout.WEST, userDateLabel);
        userInputLayout.putConstraint(SpringLayout.SOUTH, usersName, 15,SpringLayout.NORTH, userDate);

        //Creating the userinput confirmation button
        JButton userConfirm = new JButton("Enter");
        userConfirm.setBounds(200, 200, 50, 50);
        
        //Button action 
        userConfirm.addActionListener(new ActionListener());
        
        //Showing all the items
        userInputInternalFrame.add(userNameLabel);
        userInputInternalFrame.add(usersName);
        userInputInternalFrame.add(userDateLabel);
        userInputInternalFrame.add(userDate);
        userInputInternalFrame.add(userTimeLabel);
        userInputInternalFrame.add(userTime);
        userInputInternalFrame.add(userEventLabel);
        userInputInternalFrame.add(userEvent);
        userInputInternalFrame.add(eventDiscriptionLabel);
        userInputInternalFrame.add(eventDiscription);

        userInputInternalFrame.add(userConfirm);

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