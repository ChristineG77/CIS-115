package Other;
/** This program will show you how to get input from the user and then print the input out
*Assume we are getting the length and wicth to calculate the area of a square
*
*/
import java.util.Scanner;
class M3_Get_Input 
{
    public static void main(String[] args)
    {
    //create scanner variable to get input from the keyboard
    Scanner keyboard = new Scanner(System.in);
    //variable: are, length, width
    //Real type is. double in java
    double area, length, width;
    //input 
    //get length and width from the user
    System.out.print("Enter the length: ");
    length = keyboard.nextDouble(); //parse the input to a double; true false operation
    System.out.print("Enter the width: ");
    width = keyboard.nextDouble();
    area = length * width;
    System.out.println(area);
    keyboard.close();
    }
    
}