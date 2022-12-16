// The main file

package com.soc;

import javax.swing.*;
import java.awt.*;

public class SOCMain {
    public static void main(String args[]) {

        /*
        test  gridLayoutExample = new test();
        gridLayoutExample.showGridLayoutDemo();
        */

        //Showing calender
        SOCCal calenderGraphics = new SOCCal();
        calenderGraphics.calenderUi();
    }
}