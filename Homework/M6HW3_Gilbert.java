import java.util.Scanner;

public class M6HW3_Gilbert {
    
    public static void main(String[] args)
    {
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
