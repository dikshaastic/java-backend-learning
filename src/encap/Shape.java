package encap;

public abstract  class Shape {
   private String color;
   protected Shape(String color)
   {
       setColor(color);
   }
   public final String getColor()
   {
       return color;
   }
   public final void setColor(String color)
   {
       if(color==null || color.isBlank())
       {
           throw new IllegalArgumentException("color cannot be null");
       }
       this.color=color;
   }
   public abstract double getArea();

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "(color=" + getColor() + ", area=" + String.format("%.2f", getArea()) + ")";
    }


}
