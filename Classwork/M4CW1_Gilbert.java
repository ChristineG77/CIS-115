import java.util.Scanner;
public class M4CW1_Gilbert
{
    public static void main(String[] args)
    {
        //Variables, (Int Majors,nonmajors),(Real total,pMajors,pnonmajors
        int Major,nonMajor;
        float pMajor,pnonMajor,total;
        Scanner keyboard = new Scanner(System.in);
        //Get number of majors
        System.out.println("Enter the number of students majoring in CS:");
        Major = keyboard.nextInt();
        //Get number of nonmajors
        System.out.println("Enter the number of non-computer science students:");
        nonMajor = keyboard.nextInt();
        //Calculate the total number of students
        total = Major + nonMajor;
        //Calculate the percentage of majors
        pMajor = (Major/total)*100;
    
        //Calculate the percentage of nonmajors
        pnonMajor = (nonMajor/total)*100;
        //Display the percentage of majors then nonmajors
        System.out.println("Major: "+ pMajor + "%");
        System.out.println("NonMajors: " + pnonMajor + "%");
        keyboard.close(); 

    }


}