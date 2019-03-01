public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color = "Blue";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " Radius is " + getRadius()
                + " and "
                + "A Cirle with color of " + getColor();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5,"Green");
        System.out.println(circle);
    }
}
