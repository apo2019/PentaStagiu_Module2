package Module2Homework1;

public class Exercise7 {
    public static void main (String args[])
    {
        int r, sum=0, temp;
        int n = 1221;
        temp = n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp == sum)
            System.out.println("The number " + temp + " is a palindrome");
        else
            System.out.println("The number " + temp + " is not a palindrome");
    }
}
