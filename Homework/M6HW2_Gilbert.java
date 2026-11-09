import java.util.Scanner;
public class M6HW2_Gilbert {

public static void main(String[] args)

{   final double BASE_FEE = 50;
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
    scan.close();





}

}
