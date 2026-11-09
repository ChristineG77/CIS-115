import java.util.Scanner;

public class M6HW1_Gilbert {
//Employee Gross Pay Calculator
public static void main(String[] args)
{
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
scan.close();
}


}
