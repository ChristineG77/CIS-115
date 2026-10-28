import java.util.Scanner;
public class M5CW2_Gilbert {
    
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the price for your items below!");
        //while (price >=0 and price <=10000) {
        int item=1;
        float price,total=0,ave;
            do
            {
                System.out.println("Enter the price for item #" + (item) + ":");
                price = scan.nextInt();
                while (price < 0 || price > 10000)
                {
                    System.out.println("Invalid price. Please tner a value between 0 and 10,000");
                    System.out.println("Enter the price for item #" + (item) + ":");
                    price = scan.nextInt();
                }
            total = price + total;
            item++;


            } while (item <= 5);
            ave = total / item;
        System.out.println("All prices entered successfully!");
        System.out.println("The total cost is: $" + total);
        System.out.println("The avergae price is: $" + ave);
            //}

        scan.close();
    }
    
}
