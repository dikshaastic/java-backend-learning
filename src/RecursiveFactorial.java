import java.util.Scanner;


public class RecursiveFactorial {

    public static int factorial(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*factorial(num-1);


    }

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
    }
}
