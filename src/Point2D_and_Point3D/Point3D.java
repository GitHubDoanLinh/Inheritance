package Point2D_and_Point3D;

public class Point3D extends Point2D
{

    private float z ;
    public Point3D(){};
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arrayXYZ = {this.getX(),this.getY(),this.z};
        return arrayXYZ;
    }

    public void setXYZ(float x, float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;


    }
    public String toString(){
        return "("+x+","+y+","+z+")";
    }
}
