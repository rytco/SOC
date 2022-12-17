// The calander function file
// Using JavaFx to create

package com.soc;

//Imported librarys
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class SOCCal{
    //Pre storing variables
    private JPanel userInputInternalFrame;
    private SpringLayout userInputLayout;
    private JButton userConfirm;
    private JFrame calenderFrame;
    private JTable calenderTable;
    public int numberDate;
    GridBagConstraints storeGrid;
    JPanel storePanel;

    //Creating the calender main UI + Running them
    public void calenderUi() {
        //Creating the calender frame
        calenderFrame = new JFrame("SOC Management APP"); 

        //Adding addtional elements
        calenderMonth();
        calenderUserIn();

        // Calander Size & Parameters
        calenderFrame.setSize(1780,1020);
        calenderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calenderFrame.setResizable(true);
        calenderFrame.setVisible(true);
    }

    //Creating the month panel
    public void calenderMonth() {
        //Creating the grid
        JPanel calenderPanel = new JPanel(new GridBagLayout());
        GridBagConstraints calenderGrid = new GridBagConstraints();
        calenderGrid.fill = GridBagConstraints.HORIZONTAL;

        //Allowing all classes to access the panel and grid
        this.storeGrid = calenderGrid;
        this.storePanel = calenderPanel;

        //Seting panel parameters/ visuals or something
        calenderPanel.setLayout(new GridLayout(6,6));
        calenderPanel.setBackground(Color.LIGHT_GRAY);

        //Creating the panels for each day
        panelGridDaysOfWeek(calenderPanel, calenderGrid);

        int offset = 2;

        for (int i = 0; i < offset; i++) {
            panelGridTemplate(calenderPanel, calenderGrid, i, 0, "", "");
        }

        for (int day = 1; day <= 31; day++) {
            int week = (day + offset) / 7 + 1;
            int dayOfWeek = (day + offset) % 7;

            panelGridTemplate(calenderPanel, calenderGrid, dayOfWeek, week, "" + day, "");
        }

        /*//All DAys :(((((
        panelGridTemplate(calenderPanel, calenderGrid, 0, 1, "1", ""); //1
        panelGridTemplate(calenderPanel, calenderGrid, 1, 1, "2", ""); //2
        panelGridTemplate(calenderPanel, calenderGrid, 2, 1, "3", ""); //3
        panelGridTemplate(calenderPanel, calenderGrid, 3, 1, "4", ""); //4
        panelGridTemplate(calenderPanel, calenderGrid, 4, 1, "5", ""); //5
        panelGridTemplate(calenderPanel, calenderGrid, 5, 1, "6", ""); //6
        panelGridTemplate(calenderPanel, calenderGrid, 6, 1, "7", ""); //7

        panelGridTemplate(calenderPanel, calenderGrid, 0, 2, "8", ""); //8
        panelGridTemplate(calenderPanel, calenderGrid, 1, 2, "9", ""); //9
        panelGridTemplate(calenderPanel, calenderGrid, 2, 2, "10", ""); //10
        panelGridTemplate(calenderPanel, calenderGrid, 3, 2, "11", ""); //11
        panelGridTemplate(calenderPanel, calenderGrid, 4, 2, "12", ""); //12
        panelGridTemplate(calenderPanel, calenderGrid, 5, 2, "13", ""); //13
        panelGridTemplate(calenderPanel, calenderGrid, 6, 2, "14", ""); //14

        panelGridTemplate(calenderPanel, calenderGrid, 1, 3, "15", ""); //15
        panelGridTemplate(calenderPanel, calenderGrid, 2, 3, "16", ""); //16
        panelGridTemplate(calenderPanel, calenderGrid, 3, 3, "17", ""); //17
        panelGridTemplate(calenderPanel, calenderGrid, 4, 3, "18", ""); //18
        panelGridTemplate(calenderPanel, calenderGrid, 5, 3, "19", ""); //19
        panelGridTemplate(calenderPanel, calenderGrid, 6, 3, "20", ""); //20
        panelGridTemplate(calenderPanel, calenderGrid, 7, 3, "21", ""); //21

        panelGridTemplate(calenderPanel, calenderGrid, 1, 4, "22", ""); //22
        panelGridTemplate(calenderPanel, calenderGrid, 2, 4, "23", ""); //23
        panelGridTemplate(calenderPanel, calenderGrid, 3, 4, "24", ""); //24
        panelGridTemplate(calenderPanel, calenderGrid, 4, 4, "25", ""); //25
        panelGridTemplate(calenderPanel, calenderGrid, 5, 4, "26", ""); //26
        panelGridTemplate(calenderPanel, calenderGrid, 6, 4, "27", ""); //27
        panelGridTemplate(calenderPanel, calenderGrid, 7, 4, "28", ""); //28

        panelGridTemplate(calenderPanel, calenderGrid, 1, 5, "29", ""); //29
        panelGridTemplate(calenderPanel, calenderGrid, 2, 5, "30", ""); //30
        panelGridTemplate(calenderPanel, calenderGrid, 3, 5, "31", ""); //31 
        */

        //Adding the panel
        calenderFrame.add(calenderPanel, BorderLayout.CENTER);
        calenderPanel.setVisible(true);
    }

    //Return the panels so all can use it
    public JPanel returnPanel() {
        return storePanel;
    }
    public GridBagConstraints returnGrid() {
        return storeGrid;
    }

    //Calender Grid is 7 (Day of week) by 5 (Total weeks) 31 days in a normal month

    public void panelGridDaysOfWeek(JPanel startPanel, GridBagConstraints gridConstraints) {
        //Border maker
        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        //Setsize
        // whatever.setSize(length, width);

        //Monday (The day of the week starts on monday and whoever says elsewise i will fight you)
        JLabel mondayLabel = new JLabel("Monday");
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        mondayLabel.setBorder(blackline);

        //Tuesday
        JLabel tuesdayLabel = new JLabel("Tuesday");
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        tuesdayLabel.setBorder(blackline);

        //Wensday
        JLabel wensdaLabel = new JLabel("Wensday");
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        wensdaLabel.setBorder(blackline);

        //Thursday
        JLabel thursdayLabel = new JLabel("Thursday");
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 0;
        thursdayLabel.setBorder(blackline);

        //Friday
        JLabel fridayLabel = new JLabel("Friday");
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 0;
        fridayLabel.setBorder(blackline);

        //Saturday
        JLabel saturdayLabel = new JLabel("Saturday");
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = 5;
        gridConstraints.gridy = 0;
        saturdayLabel.setBorder(blackline);

        //Sunday
        JLabel sundayLabel = new JLabel("Sunday");
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = 6;
        gridConstraints.gridy = 0;
        sundayLabel.setBorder(blackline);

        //Adding and showing all panels
        startPanel.add(mondayLabel);
        startPanel.add(tuesdayLabel);
        startPanel.add(wensdaLabel); //Ignore the spelling error
        startPanel.add(thursdayLabel);
        startPanel.add(fridayLabel);
        startPanel.add(saturdayLabel);
        startPanel.add(sundayLabel);
    }

    public void panelGridTemplate(JPanel startPanel, GridBagConstraints gridConstraints, int xGrid, int yGrid, String dayNumber, String additionalInfo) { //Creating a template for all the panels
        //Border maker
        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        //Creating the panel
        JPanel theDayPanel = new JPanel();

        //Creating & adding date label
        JLabel dateLabel = new JLabel(dayNumber);

        //Setting the location/constraints
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = xGrid;
        gridConstraints.gridy = yGrid;
        theDayPanel.setBorder(blackline);

        //Showing panel
        theDayPanel.add(dateLabel);
        startPanel.add(theDayPanel);
    }

    public void createButton(String name, int date, String event, String discription, String eventName, JPanel startPanel, GridBagConstraints gridConstraints, int xaxis, int yaxis){       
        //Creates button with name
        JButton buttontest = new JButton(name + "|" + eventName);
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.gridx = xaxis;
        gridConstraints.gridy = yaxis;

        // Showing the button
        startPanel.add(buttontest, gridConstraints);
        startPanel.validate();
        startPanel.repaint();
        buttontest.setVisible(true);
        startPanel.repaint();

        // TODO make it so it pops up in the right place

        // TODO Make it so when button clicked the event info pops up

    }

    public void dayData(String inname, String date, String inevent, String indiscription, String ineventname, JPanel startPanel, GridBagConstraints gridConstraints) { //Add days info into panel
        try { //Used to convert string date into int numberdate
            numberDate = Integer.parseInt(date);
        } catch (NumberFormatException e) { //Catches error and drops
            // TODO should probably add a popup saying try again
            e.printStackTrace();
        }

        //Pushing the parameters into a variable because it doesnt work if I dont?
        String name = inname;
        String event = inevent;
        String discription = indiscription;
        String eventname = ineventname;

        //Does the "math" to find the spefific day? Then creates a button on that day
        {
            int week = numberDate / 7 + 1;
            int dayOfWeek = numberDate % 7;

            createButton(name, numberDate, event, discription, eventname, startPanel, gridConstraints, dayOfWeek, week);
        }


        /*
        if (numberDate == 1) { //How to optimize this?
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 0, 1);
        } else if (numberDate == 2) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 1, 1);
        } else if (numberDate == 3) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 2, 1);
        } else if (numberDate == 4) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 3, 1);
        } else if (numberDate == 5) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 4, 1);
        } else if (numberDate == 6) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 5, 1);
        } else if (numberDate == 7) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 6, 1);

        } else if (numberDate == 8) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 0, 2);
        } else if (numberDate == 9) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 1, 2);
        } else if (numberDate == 10) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 2, 2);
        } else if (numberDate == 11) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 3, 2);
        } else if (numberDate == 12) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 4, 2);
        } else if (numberDate == 13) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 5, 2);
        } else if (numberDate == 14) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 6, 2);

        } else if (numberDate == 15) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 0, 3);
        } else if (numberDate == 16) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 1, 3);
        } else if (numberDate == 17) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 2, 3);
        } else if (numberDate == 18) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 3, 3);
        } else if (numberDate == 19) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 4, 3);
        } else if (numberDate == 20) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 5, 3);
        } else if (numberDate == 21) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 6, 3);

        } else if (numberDate == 22) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid,0, 4);
        } else if (numberDate == 23) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 1, 4);
        } else if (numberDate == 24) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 2, 4);
        } else if (numberDate == 25) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 3, 4);
        } else if (numberDate == 26) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 4, 4);
        } else if (numberDate == 27) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 5, 4);
        } else if (numberDate == 28) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 6, 4);

        } else if (numberDate == 29) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 0, 5);
        } else if (numberDate == 30) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 1, 5);
        } else if (numberDate == 31) {
            createButton(name, numberDate, event, discription, eventname, storePanel, storeGrid, 2, 5);
        }
        */
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
        // TODO change this to a dropdown menu to make it easier and reduce misinput
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

        //Blank
        JLabel blank = new JLabel();
        JLabel blank2 = new JLabel();
        JLabel blank3 = new JLabel();
        JLabel blank4 = new JLabel();

        //Adding items to the layout
        userInputInternalFrame.setLayout(new GridLayout(5,2,10,10));

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
        userConfirm.addActionListener(new ActionListener() {
            @Override // TODO What is this?
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //Get the info from the text fields
                String name = usersName.getText();
                String date = userDate.getText();
                String event = userEvent.getText();
                String discription = eventDiscription.getText();
                String eventname = eventDiscriptionLabel.getText();
                
                //Creates event
                dayData(name, date, event, discription, eventname, storePanel, storeGrid);

                // TODO Pushes into JSON folder

            }
        });
        
        //Showing all the items       
        userInputInternalFrame.add(userNameLabel);
        userInputInternalFrame.add(usersName);
        userInputInternalFrame.add(blank2);
        userInputInternalFrame.add(userDateLabel);
        userInputInternalFrame.add(userDate);
        userInputInternalFrame.add(blank);
        userInputInternalFrame.add(userTimeLabel);
        userInputInternalFrame.add(userTime);
        userInputInternalFrame.add(blank3);
        userInputInternalFrame.add(userEventLabel);
        userInputInternalFrame.add(userEvent);
        userInputInternalFrame.add(blank4);
        userInputInternalFrame.add(eventDiscriptionLabel);
        userInputInternalFrame.add(eventDiscription);

        userInputInternalFrame.add(userConfirm);

        // Adding to main and showing
        calenderFrame.add(userInputInternalFrame, BorderLayout.LINE_START);
        userInputInternalFrame.setVisible(true);
    }

    public void eventList() { //List of all events/ items + ability to delete events
        // TODO add a event list panel
        // .setBackround(Color.green) //sets backround to green; 
        // Probably addtional feature

        //Creating panel
        JPanel eventListPanel = new JPanel();

        //ADding panel on right side
        calenderFrame.add(eventListPanel, BorderLayout.WEST);
    }

    public void eventDelete() {
        // TODO add event delete
    }
}