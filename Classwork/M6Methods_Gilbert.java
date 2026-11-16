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
        System.out.println("You have exited the menu!");
        System.out.print("Do you want to see the menu again? Enter yes or no: ");
        keep_going = scan.nextLine();
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
        System.out.println("1) Employee Pay Calculator: ");
        System.out.println("2) Monthly Meter Calculator: ");
        System.out.println("3) Widget Pay and Commission Calculator: ");
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
            getM6HW2();
            displayMenu();
            break;
        case 3:
            getM6HW3();
            displayMenu();
            break;
        case 4:
            System.out.println("");
            System.out.println("Exiting the menu");
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
    System.out.println("You picked Employee Pay Calculator");
    System.out.println("");
    //M6HW1 code goes here
    double pay_rate,gross_pay;
    int hours_worked;
    String name;
    Scanner scan = new Scanner(System.in);
    //input user name
    System.out.print("Employee Name: ");
    name = scan.nextLine();
    //input pay rate
    System.out.print("Employee Pay Rate: ");
    pay_rate = scan.nextDouble();
    //input hours worked
    System.out.print("Employee Hours: ");
    hours_worked = scan.nextInt();
    //calcualte gross pay gross = rate x hours
    gross_pay = pay_rate * hours_worked;
    //display employee name
    System.out.println("Employee Name: "+name);
    //pay rate
    System.out.println("Employee Pay Rate: $"+pay_rate);
    //hours worked
    System.out.println("Employee Hours Worked: "+hours_worked);
    //gross pay
    System.out.println("Employee Gross Pay: $"+gross_pay);
    
    
    }

public static void getM6HW2()
{
    System.out.println("");
    System.out.println("");
    System.out.println("You picked Monthly Meter Calculator");
    System.out.println("");
    //your code goes here
    final double BASE_FEE = 50;
    double prev_month,cur_month,usage,charge;
    String name;
    Scanner scan = new Scanner(System.in);
    //input homeowner name
    System.out.println("What is the homeowner's name: ");
    name = scan.nextLine();
    //input previous month meter reading
    System.out.println("What was the previous month's meter reading: ");
    prev_month = scan.nextDouble();
    //input current month meter reading
    System.out.println("What is the current month's meter reading: ");
    cur_month = scan.nextDouble();
    //calculate usage = current - previous
    usage = cur_month - prev_month;
    //cacualte charge = (usage * 0.20)+ 50 base fee
    charge = (usage * .20) + BASE_FEE;
    //display homeowner name
    System.out.println("Homeowner name: "+name);
    //display previous reading
    System.out.println("Previous Month Meter: "+prev_month);
    //display current reading
    System.out.println("Current Month Meter: "+cur_month);
    //display total charge
    System.out.println("Total Charge: $"+charge);
    
}
public static void getM6HW3()
{
    System.out.println("");
    System.out.println("");
    System.out.println("You picked Widget Pay and Commission Calculator");
    System.out.println("");
    final double BASE_SALARY = 500;
    String name;
    double wid_sold,wid_ret,wid_net,comm;
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the employee name: ");
    name = scan.nextLine();
    System.out.println("How many widgets were sold this month: ");
    wid_sold = scan.nextDouble();
    System.out.println("How many widgets were returned this month: ");
    wid_ret = scan.nextDouble();
    wid_net = wid_sold - wid_ret;
    comm = BASE_SALARY + (wid_net*.10);
    System.out.println("Employee: "+name);
    System.out.println("Net Widgets Sold this month: "+wid_net);
    System.out.println("Total Commission: $"+comm);
    
}



}