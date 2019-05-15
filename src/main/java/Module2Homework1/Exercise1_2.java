package Module2Homework1;

public class Exercise1_2 {
    static double hexagonArea(double l)
    {
        double area = (3*Math.sqrt(3)*(l*l))/2;
        return area;
    }
    static double hexagonPerimeter(double l)
    {
        double perimeter = 6*l;
        return perimeter;
    }
    public static void main (String[] args)
    {
        double l = 7;
        System.out.println("Area: " + hexagonArea(l));
        System.out.println("Perimeter: " + hexagonPerimeter(l));
    }
}
