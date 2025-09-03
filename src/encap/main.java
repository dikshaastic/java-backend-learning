package encap;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Square square = new Square("Blue", 4);

        // basic usage (encapsulation in action)
        System.out.println(circle); // uses toString()
        System.out.println(square);
    }
}
