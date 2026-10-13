/**
 * Christine Gilbert
 * M4HW2
 * 10/11/2026
 * Writing a code to determine if a person can vote or not
 */

import java.util.Scanner;
public class M4HW2_Gilbert {
    

    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String citizenship,county,legal;
        Integer days_lived,age;

        System.out.println("Are you a US citizen? (yes/no) ");
        citizenship = keyboard.nextLine();
        System.out.println("Do you live in the county you're registering in? (yes/no) ");
        county = keyboard.nextLine();
        System.out.println("Are you currently serving a felony sentence or on probation? (yes/no) ");
        legal = keyboard.nextLine();
        System.out.println("How many days have you lived in the county? ");
        days_lived = keyboard.nextInt();
        System.out.println("How old will you be by the general election? ");
        age = keyboard.nextInt();
       

        if (age >= 18 && citizenship.equals("yes"))
        
        {   if (days_lived>=30 && county.equals("yes") && legal.equals("no"))
            
              System.out.println("You are eligible to vote.");
    
            else
                System.out.println("Not eligible to vote.");
            
        }
            
        else
            System.out.println("Not eligible to vote.");
        
        
        keyboard.close();

    }
}
