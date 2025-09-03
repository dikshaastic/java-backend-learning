package encap;
import java.util.*;
public class Square extends Shape{
    public double side;

    public Square(String color, double side)
    {
        super(color);
        setSide(side);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if(side<=0){
            throw new IllegalArgumentException("side must be positive");
        }
        this.side=side;
    }
    @Override
    public double getArea(){
        return side*side;
    }

}
