import java.util.Scanner;
public class M4HW1_Gilbert {
    public static void main(String[] args)
    {
        // the sale price and base salary are constants
        final double SALE_PRICE = 4.79, BASE_SALARY = 2000;


        //use the scanner to get the widgets sold and widgets returned
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        int widgets_sold,widgets_returned,widgets_net;
        double commission_rate = 0,widget_sales,commission_amount,monthly_salary;
        String name;
        
        //ask for the widgets sold and returned and name of sales person
        System.out.println("What is the name of the Sales Personnel using this terminal? ");
        name = keyboard.nextLine();
        System.out.println("How many widgets did you sell this Quarter? ");
        widgets_sold = keyboard.nextInt();
        System.out.println("How many widgets sold were then returned this Quarter? ");
        widgets_returned = keyboard.nextInt();

        //how many widgets were sold and how much in sales was it
        widgets_net = widgets_sold - widgets_returned; 
        widget_sales = widgets_net * SALE_PRICE;
        

        //now the commission rate structure
        if (widgets_net <= 100)
        
            commission_rate = .1;
        
        else if (widgets_net <= 199)
            commission_rate = .15;

        else if (widgets_net <= 299)
            commission_rate = .2;
        
        else if (widgets_net >= 300)
            commission_rate = .25;
        else;
        
        //now use the commission rate for all the other calculations
        commission_amount = commission_rate * widget_sales;
        monthly_salary = commission_amount + BASE_SALARY;

        System.out.println("Sales Person:" + name);
        System.out.println("Net Widgets Sold: " + widgets_net);
        System.out.println("Widgets Sales Amount: $" + widget_sales);
        System.out.println("Commssion Amount: $" + commission_amount);
        System.out.println("Monthly Salary: $"  + monthly_salary);


        



        keyboard.close();
    }

}
