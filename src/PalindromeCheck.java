import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int revnum=0;
        int originalnum=num;
        if(num<0)
        {
            System.out.println("Negative numbers cannot be palindromes");
            return;
        }
        while(num!=0)
        {
            int digit=num%10;
            revnum=revnum*10+digit;
            num=num/10;

        }
        if(revnum==originalnum)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
