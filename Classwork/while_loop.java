import java.util.Scanner;
public class while_loop
{//added the do while loop here to condense down on files
    public static void main (String[] args)
    {
        char choice = 'y';
        Scanner scan = new Scanner(System.in);
        while (choice == 'y') //equals ignore case is used to get around string errors when getting user input
        {
            int num, count = 1, total = 0, value = 0;
            System.out.println("how many numbers do you want to add?");
            System.out.println("Enter the number here ");
            num = scan.nextInt();
            do
            {   
            System.out.println("Enter number" + count + ":");
            value = scan.nextInt();
            total += value;
            count++;

            } while (count < num);

        System.out.println(total);
        System.out.println(count);
        System.out.println("Do you wanna go back and do this again?");
        choice = scan.next().charAt(0);

        }
        scan.close();

    }




}