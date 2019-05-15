package Module2Homework1;

public class Excercise1_1 {
        static int areaRectangle(int l, int L)
        {
            int area = l*L;
            return area;
        }
        static int perimeterRectangle(int l, int L)
        {
            int perimeter = 2*(l+L);
            return perimeter;
        }
        public static void main (String[] args)
        {
            int l = 2;
            int L = 9;
            System.out.println("Area = "+ areaRectangle(l, L));
            System.out.println("Perimeter = "+ perimeterRectangle(l, L));
        }
}
