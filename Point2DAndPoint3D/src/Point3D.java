public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] xyz = {super.getX(), super.getY(), this.z};
        return xyz;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", super.getX(), super.getY(), this.z);
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D.toString());
    }
}