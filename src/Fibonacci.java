import java.util.Scanner;

public class Fibonacci {
    public static int fiborec(int num){
       if(num==0) return 0;
       if(num==1) return 1;
       return fiborec(num-1) +fiborec(num-2);

    }
    public static void main(String main[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
       fiborec(n);
      for(int i=0;i<n;i++)
      {
          System.out.print(fiborec(i)+" ");
      }


    }

}
