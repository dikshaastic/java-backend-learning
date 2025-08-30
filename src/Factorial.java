import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        long num=scanner.nextInt();
        long ans=1;
        for(int i=1;i<=num;i++){

            ans=ans*i;
        }
       System.out.println(ans);

    }

}
