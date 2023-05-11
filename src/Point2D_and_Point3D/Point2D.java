package Point2D_and_Point3D;

public class Point2D {
    protected float x ;
    protected float y ;
    public Point2D(){};
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }


    public float[] getXY(){
        float[] arrayXY = {this.x,this.y};
        return arrayXY;
    }

    public void setXY(float x, float y){
        this.x =x;
        this.y =y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
