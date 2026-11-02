import java.util.Scanner;
public class M5HW2_Gilbert {
    public static void main(String[] args)
    {
        // the sale price and base salary are constants
        final double SALE_PRICE = 4.79, BASE_SALARY = 2000;


        //use the scanner to get the widgets sold and widgets returned
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        int widgets_sold,netwidgets_sold=0,widgets_returned,netwidgets_returned=0,widgets_month,month;
        double commission_rate = 0,widget_sales,commission_amount,monthly_salary;
        String name;
        char choice='y';
        while (choice == 'y'|| choice == 'Y')
        {
            month = 1;
            //ask for the widgets sold and returned and name of sales person
            System.out.println("What is the name of the Sales Personnel using this terminal? ");
            name = keyboard.nextLine();
            for (int week = 1;week<5;week++)
            {
                System.out.println("How many widgets did you sell during week "+ week +"? ");
                widgets_sold = keyboard.nextInt();
                netwidgets_sold = widgets_sold + netwidgets_sold;
            }
            for (int week = 1;week<5;week++)
            {
                System.out.println("How many widgets were returned during week "+ week +"? ");
                widgets_returned = keyboard.nextInt();
                netwidgets_returned = widgets_returned + netwidgets_returned;
            }

            //how many widgets were sold and how much in sales was it
            widgets_month = netwidgets_sold - netwidgets_returned;
            widget_sales = widgets_month * SALE_PRICE;
            

            //now the commission rate structure
            if (widgets_month <= 100)
            
                commission_rate = .1;
            
            else if (widgets_month <= 199)
                commission_rate = .15;

            else if (widgets_month <= 299)
                commission_rate = .2;
            
            else if (widgets_month >= 300)
                commission_rate = .25;
            else;
            
            //now use the commission rate for all the other calculations
            commission_amount = commission_rate * widget_sales;
            monthly_salary = commission_amount + BASE_SALARY;

            System.out.println("Sales Person:" + name);
            System.out.print("Month #"+month);
            System.out.println("Widgets Sold: " + netwidgets_sold);
            System.out.println("Widgets Returned: " + netwidgets_returned);
            System.out.println("Net Widgets Sold: " + widgets_month);
            System.out.println("Widgets Sales Amount: $" + widget_sales);
            System.out.println("Commssion Amount: $" + commission_amount);
            System.out.println("Monthly Salary: $"  + monthly_salary);
            System.out.println("Would you like to use the program again? (y/n):");
            choice = keyboard.next().charAt(0);
            month++;

        }
        System.out.println("Exiting Program. Goodbye!");


        keyboard.close();
    }

}
