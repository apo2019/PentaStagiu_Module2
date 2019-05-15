package Module2Homework1;

public class Exercise3 {
    public static void main (String[] args)
    {
        String string = "StagiuPentalog", reverse = "";
        int length = string.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        System.out.println("The reverse of the string is " + reverse);
    }
}
