package Module2Homework1;

public class Exercise4 {
    public static void main (String args[])
    {
        int n = 100;
        System.out.print("The odd numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}