package geometry;

public class Shape {
    protected String color = "green";
    protected boolean filled = true;
     public Shape(){};
     public Shape(String color, boolean filled){
         this.color = color;
         this.filled = filled;
     }
/*---------------------------------------------------*/
     public String getColor(){
         return this.color;
     }
     public boolean getFilled(){
         return this.filled;
     }
     public void setColor(String color){
         this.color = color;
     }
     public void setFilled(boolean filled){
         this.filled = filled;
     }
     public  boolean isFilled(){
         return filled;
     }
     
     public String toString(){
         return  " is a shape with color of "
                 + getColor()
                 + " and "
                 + (isFilled() ? "filled" : "not filled");
     }
}
