//CircleDemo.java
//A simple program to calculate area, circumference, and diameter of a circle


public class M3HW_Gilbert
{
    public static void main(String[] args)
    {
        //Declare and assign a radius
        double radius = 5.0;
        //Perform Calculations
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        //Diplay results
        System.out.println("Circle with radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }






}