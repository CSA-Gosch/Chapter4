package Debugging;

public class DebuggingTwo {
    public static void main(String args[])
    {
        double radius = 12.6;
        System.out.println("Circle statistics");
        double area = (Math.PI * radius) * radius;
        System.out.println("area is " + area);
        double diameter = 2 * radius;
        System.out.println("diameter is " + diameter);
    }
}
