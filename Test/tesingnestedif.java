package Test;
import java.util.Scanner;
public class tesingnestedif {
    public static void main(String[] args)
    {
        String code = "";
        Integer height;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is Code?:");
        code = scan.nextLine();
        System.out.println("Whats is your height?");
        height  = scan.nextInt();

        if (code.equals("R"))
           if (height <= 20)
                System.out.println("Situation Normal");
            else
                System.out.println("Brava");
        else
            System.out.println("Bravo!");
        scan.close();
    }
}
