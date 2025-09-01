import java.util.Scanner;
class calci{
    calci() {
        System.out.println("Calculator ready!");
    }
  int add(int a, int b)
  {
      return a+b;
  }
  int sub(int a ,int b)
  {
      return a-b;
  }
  int multiply(int a, int b)
  {
      return a*b;
  }
  int div(int a,int b)
  {
      return a/b;
  }




}
public class Calculator {

    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        calci calc=new calci();
        int sum=calc.add(x,y);
        System.out.println("the sum is :"+ sum);
        int diff=calc.sub(x,y);
        System.out.println("the difference is: " + diff);

    }

}
