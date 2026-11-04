import java.util.Scanner;
class M6Methods_Gilbert
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
    while(keep_going.equalsIgnoreCase("yes"))
    
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
    System.out.println(); //give programs better names
    System.out.println("1) M6HW1: ");
    System.out.println("2) M6HW2: ");
    System.out.println("3) M6HW3: ");
    System.out.println("4) Exit: ");
    System.out.println();
    System.out.print("Selection: ");
    Scanner scan = new Scanner (System.in);
//changes the cases to reflect the programs being run
    switch(scan.nextInt())
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
//put the other methods here!
//second and third method structure will be the same as below for M6HW2 and M6HW3 so just copy and paste the code
//need to add code from M6HW1 in the method


public static void getM6HW1()
{
    System.out.println("");
    System.out.println("");
    System.out.println("you picked M6HW1");
    System.out.println("");
    //M6HW1 code goes here
}





}