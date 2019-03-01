public class Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;


    public Shape(){

    }

    public Shape(double side1, double side2, double side3 ){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return  (side1 + side2 + side3)/ 2;
    }

    public double getArea(){
        return Math.sqrt(getPerimeter()*(getPerimeter() - side1)*(getPerimeter() - side2)*(getPerimeter() - side3));
    }

    @Override
    public String toString() {
        return " Độ dài 3 cạnh tam giác là : " + getSide1()
                + " " + getSide2() + " " + getSide3()
                + " Diện tích Tam Giác là : " + getArea()
                + " Chu vi Tam Giác là : " + getPerimeter();
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());

        shape = new Shape(4,5,6);
        System.out.println(shape.toString());
    }
}
