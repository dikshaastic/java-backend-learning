import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int reversenum=0;
        while(num!=0)
        {
            int digit=num%10;
            reversenum=reversenum*10+digit;
            num=num/10;
        }
        System.out.println("Reversed number :"+ reversenum);
    }

}
