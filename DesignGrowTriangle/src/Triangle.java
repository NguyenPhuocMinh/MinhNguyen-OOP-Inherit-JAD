import java.util.Scanner;

public class Triangle extends Shape {
    private String color;

    public Triangle(double side1, double side2, double side3, String color){
        super(side1,side2,side3);
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }

    @Override
    public double getArea(){
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Color of Triangle is : " + getColor()
                + " Area is : " + getArea()
                + " Perimeter is : " + getPerimeter();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 side");

        System.out.print("Input a color you want? ");
        String color = input.nextLine();

        System.out.print("Input side 1 : ");
        double side1 = input.nextDouble();

        System.out.print("Input side 2 : ");
        double side2 = input.nextDouble();

        System.out.print("Input side 3 : ");
        double side3 = input.nextDouble();



        Triangle triangle = new Triangle(side1,side2,side3,color);
        System.out.println(triangle.toString());
    }
}
