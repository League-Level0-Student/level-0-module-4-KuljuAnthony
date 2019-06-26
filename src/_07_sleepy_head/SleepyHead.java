package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
          Ask the user for these values using a confirm dialog like the one below
          */
        isWeekday =  JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         
        System.out.println(isWeekday);
        isVacation = JOptionPane.showConfirmDialog(null, "are you on vacation?", "bob",JOptionPane.YES_NO_OPTION);
 
        System.out.println(isVacation);
        
        if(isVacation==0||isWeekday==1) {
        	       System.out.println("sleep in"); 	
        	
        }else if(isWeekday==0) {
        	if(isVacation==0) {
        		 System.out.println("sleep in"); 	
        	}else {
        		 System.out.println("get up lazy bones"); 	
        	}
        		
        }

       /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
