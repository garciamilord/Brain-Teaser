package com.company;

import javax.swing.*;

public class EdQuestion {
    private int personChoice;
    private String[] option;
    private ImageIcon wrong= new ImageIcon("src/wrong.gif");

    public void Q1() {
        option = new String[]{"Bank", "Money", "Toy"};
        ImageIcon money = new ImageIcon("src/money.gif");
        personChoice = JOptionPane.showOptionDialog(null,
                "People make me, save me, change me, raise me. What am I?", "Question 1", 0,
                JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        if (personChoice == 0) {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Money.", "correct",
                    JOptionPane.INFORMATION_MESSAGE);


        } else if (personChoice == 1) {
            JOptionPane.showMessageDialog(null, "", "correct",
                    JOptionPane.INFORMATION_MESSAGE, money);


        } else {
            JOptionPane.showMessageDialog(null, "Wrong.", "", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Money", "correct",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Q2() {
        option = new String[]{"Clock", "Person", "Head"};
        ImageIcon clock = new ImageIcon("src/clock.gif");
        personChoice = JOptionPane.showOptionDialog(null,
                " What has a face and two hands but no arms or legs?", "Question 2", 0,
                JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        if (personChoice == 0) {
            JOptionPane.showMessageDialog(null, "", "correct",
                    JOptionPane.INFORMATION_MESSAGE, clock);


        } else if (personChoice == 1) {

            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Clock", "correct",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Clock", "correct",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Q3() {
        option = new String[]{"Basketball", "Football", "Cold"};
        ImageIcon cold = new ImageIcon("src/cold.gif");
        personChoice = JOptionPane.showOptionDialog(null, "What can one catch that is not thrown?"
                , "Question 3", 0, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        if (personChoice == 0) {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Cold", "correct",
                    JOptionPane.INFORMATION_MESSAGE);


        } else if (personChoice == 1) {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE,
                    wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Cold", "correct",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "", "correct",
                    JOptionPane.INFORMATION_MESSAGE, cold);
        }

    }

    public void Q4() {
        option = new String[]{"Lunch and Dinner", "Dinner", "Lunch"};
        ImageIcon lunchNdinner = new ImageIcon("src/lunchanddinner.gif");
        personChoice = JOptionPane.showOptionDialog(null,
                "What are two things you can never eat for breakfast?", "Question 4",
                0, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        if (personChoice == 0) {

            JOptionPane.showMessageDialog(null, "", "correct",
                    JOptionPane.INFORMATION_MESSAGE, lunchNdinner);


        } else if (personChoice == 1) {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Lunch and Dinner",
                    "correct", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Lunch and Dinner",
                    "correct", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Q5() {
        option = new String[]{"Pending", "Tomorrow", "Schedule"};
        ImageIcon day = new ImageIcon("src/tomorrow.gif");
        personChoice = JOptionPane.showOptionDialog(null,
                "What is always coming but never arrives? ", "Question 5",
                0, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        if (personChoice == 0) {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Tomorrow", "correct",
                    JOptionPane.INFORMATION_MESSAGE);


        } else if (personChoice == 1) {
            JOptionPane.showMessageDialog(null, "", "correct",
                    JOptionPane.INFORMATION_MESSAGE, day);


        } else {
            JOptionPane.showMessageDialog(null, "", "Wrong", JOptionPane.INFORMATION_MESSAGE
                    , wrong);
            JOptionPane.showMessageDialog(null, "Correct answer is Tomorrow", "correct",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
