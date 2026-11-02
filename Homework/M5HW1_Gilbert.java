import java.util.Scanner;

/**
 * M5HW1_starter_file
 */
public class M5HW1_Gilbert
{

    public static void main(String[] args)
    {
        double average = 0, grades = 0,total=0;
        int i=0,loop,count=1;
        char grade, choice='y';
        
        Scanner k = new Scanner(System.in);
        while(choice == 'y')
        {
            System.out.println("How many grades would you like to put in to be averaged? ");
            loop = k.nextInt();
            do{
                System.out.println("Enter grade #" + count + ": ");
                grades = k.nextInt();
                while (grades < 0 || grades > 100)
                    {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                    System.out.println("Enter your grade: ");
                    grades = k.nextInt();
                    }
                total = total + grades;
                count++;
                i++;


                }while (i < loop);
                average = total/loop;
                if (average >= 90)
                    {
                        grade = 'A';
                    }
                else if (average >= 80)
                    {
                        grade = 'B';
                    }
                else if (average >= 70)
                    {
                        grade = 'C';
                    }
                else if (average >= 60)
                    {
                        grade = 'D';
                    }
                else
                    {
                        grade = 'F';
                    }
                System.out.println("Average: " + average);
                System.out.println("Grade: " + grade);
                System.out.println("Would you like to run the program again? (y/n): ");
                choice = k.next().charAt(0);
                }
                System.out.println("Program exited. Goodbye!");
            k.close();
    }
}