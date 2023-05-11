package TriangleOfShape;

public class Shape2 {

    protected String color = "green";
    protected boolean filled = true;
    public Shape2(){};
    public Shape2(String color, boolean filled){
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
        return  " class hình học tỏng quát với màu : "
                + getColor()
                + " và "
                + (isFilled() ? "filled" : "not filled");
    }
}
