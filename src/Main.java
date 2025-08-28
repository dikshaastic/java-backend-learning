import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println("Enter the number you want to swap");
    Scanner scanner=new Scanner(System.in);
    int a =scanner.nextInt();
    int b=scanner.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;

    System.out.println("numbers are a="+ a + " b=" +b);


    }
}