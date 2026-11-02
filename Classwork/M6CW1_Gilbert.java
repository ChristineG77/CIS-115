import java.util.Scanner;
class M6CW1_Gilbert
{
public static void main (String[] args)
{
    runProgram();
}    
public static void runProgram()
{
    System.out.println("Method Project");
    Scanner scan = new Scanner(System.in);
    String keep_going = "yes";
    while(keep_going.equalsIgnoreCase("yes"));
        {
            displayMenu();
            System.out.println();
            System.out.println("ou have exited the menu!");
            System.out.print("Do you want to see the menu again? Enter yes or no: ");
            keep_going = scan.next();
            System.out.println();
        }
    scan.close();
    System.out.println("Program has terminated");
    

}
public static void displayMenu()
    {
    System.out.println();
    System.out.println("Menu");
    System.out.println();
    System.out.println("1) M6HW1: ");
    System.out.println("2) M6HW2: ");
    System.out.println("3) M6HW3: ");
    System.out.println("4) Exit: ");
    System.out.println();
    System.out.print("Selection: ");
    Scanner scan = new Scanner (System.in);

    switch(scan.next())
        {
        case 1:
            getM6HW1();
            displayMenu();
            break;
        case 2:
            System.out.println("");
            System.out.println("You picked M6HW2");
            System.out.println("");
            displayMenu();
            break;
        case 3:
            System.out.println("");
            System.out.println("You picked M6HW3");
            System.out.println("");
            displayMenu();
            break;
        case 4:
            System.out.println("");
            System.out.println("Exiting te menu");
            break;
        default:
            System.out.println("");
            System.out.println("Unrecognized option...Try again");
            System.out.println("");
            displayMenu();
        }
}

public static void getMHW1()
{
    System.out.println("");
    System.out.println("");
    System.out.println("you picked M6HW1");
    System.out.println("");
}




}