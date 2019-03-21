/*
 * ITSW 2417 Chapter 6 Geometry Calculator
 * GeometryDemo class
 * @author Gabby Schmitt
 * @version 1.0
 */

import java.util.Scanner;

public class GeometryDemo
{
    public static void main (String[] args)
    {
        //Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Define variables
        int choice;
        double radius, length, width, base, height;

        //Loop to display choice menu
        while(true)
        {
            //Display choice menu
            System.out.println("\nGeometry Calculator");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");

            //Get user's choice
            System.out.print("Enter your choice (1-4): ");
            choice = keyboard.nextInt();

            //Space for clarity
            System.out.println();

            //Process user's choice
            if (choice == 1)
            {
                //Get radius
                System.out.print("Enter the radius of the circle: ");
                radius = keyboard.nextDouble();

                //Ensure radius isn't negative then display area
                if (radius < 0)
                    System.out.println("Do not enter negative numbers.");
                else
                    System.out.println("The area of the circle is " +
                            Geometry.getCircleArea(radius) + ".");
            }
            else if (choice == 2)
            {
                //Get length
                System.out.print("Enter the length of the rectangle: ");
                length = keyboard.nextDouble();

                //Get width
                System.out.print("Enter the width of the rectangle: ");
                width = keyboard.nextDouble();

                //Ensure length and width aren't negative then display area
                if (length < 0 || width < 0)
                    System.out.println("Do not enter negative numbers.");
                else
                    System.out.println("The area of the rectangle is " +
                            Geometry.getRectangleArea(length, width)
                            + ".");
            }
            else if (choice == 3)
            {
                //Get base
                System.out.print("Enter the base length of the triangle: ");
                base = keyboard.nextDouble();

                //Get height
                System.out.print("Enter the height of the triangle: ");
                height = keyboard.nextDouble();

                //Ensure base and height aren't negative then display area
                if (base < 0 || height < 0)
                    System.out.println("Do not enter negative numbers.");
                else
                    System.out.println("The area of the triangle is " +
                            Geometry.getTriangleArea(base, height)
                            + ".");
            }
            else if (choice == 4)
            {
                System.out.print("You have quit the calculator.");
                System.exit(0);
            }
            else
                System.out.println("Please enter 1, 2, 3, or 4.");

            System.out.println();
        }
    }
}