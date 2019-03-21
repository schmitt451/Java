/**
 * ITSW 2417 Chapter 6 Geometry Calculator
 * Geometry class
 * @author Gabby Schmitt
 * @version 1.0
 */

public class Geometry
{
    //getCircleArea method accepts radius of a circle and returns the area
    public static double getCircleArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    //getRectangleArea method accepts length and width of a rectangle and returns the area
    public static double getRectangleArea(double length, double width)
    {
        return length * width;
    }

    //getTriangleArea method accepts base and height of a triangle and returns the area
    public static double getTriangleArea(double base, double height)
    {
        return base * height * .5;
    }
}