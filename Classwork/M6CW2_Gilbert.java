import java.util.Scanner;
public class M6CW2_Gilbert {
    //all methods will be void methods

public static void main(String[] args)
{
    displayGreeting();
    calculateArea();
    displayClosing();


}
//greet the user
public static void displayGreeting()
{
    System.out.println("Welcome to the Area Calculator!");
}
//get the input from the user for the length and width and return the area of the rectangle
public static void calculateArea()
{Scanner scan = new Scanner(System.in);
double length,width,area;
    System.out.println("Enter the length: ");
    length = scan.nextDouble();
    System.out.println("Enter the width: ");
    width = scan.nextDouble();
    area = length * width;
    System.out.println("The area of the rectangle is: "+area+".");
    scan.close();
}
//say farewell to the user
public static void displayClosing()
{
    System.out.print("Thank you for using this program!");
}




}
