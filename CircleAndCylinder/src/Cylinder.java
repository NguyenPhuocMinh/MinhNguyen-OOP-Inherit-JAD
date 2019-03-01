public class Cylinder extends Circle {
    private double height = 10;

    public Cylinder (){

    }
    public Cylinder(double radius, String color){
        super(radius,color);
    }

    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public double getR(){
        return getRadius();
    }

    @Override
    public void setRadius(double r){
        setRadius(r);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getRadius() * getRadius() * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Height of Cylinder is " + getHeight()
                + " and "
                + "Volume of Cylinder is " + getVolume()
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(12,"Black");
        System.out.println(cylinder);

        cylinder = new Cylinder(15,2,"Red");
        System.out.println(cylinder);
    }
}
