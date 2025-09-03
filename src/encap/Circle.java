package encap;

public class Circle extends Shape{
    private double radius;
    public Circle(String color, double radius){
        super(color);
        setRadius(radius);
    }

    public double getRadius(){
        return radius;

    }
    public void setRadius(double radius){
        if(radius<=0)
        {
            throw new IllegalArgumentException("radius should be a positive value");

        }
        this.radius=radius;
    }
    @Override
    public double getArea(){
            return Math.PI*radius*radius;
    }
}
