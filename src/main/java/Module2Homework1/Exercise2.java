package Module2Homework1;

public class Exercise2 {
    public static void main (String arg[])
    {
        int x1 = 3, x2 = 6, y1 = 3, y2 = 6;
        double dis;
        dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between "+"("+x1+","+y1+") and "+"("+x2+","+y2+") is "+dis);
    }
}
