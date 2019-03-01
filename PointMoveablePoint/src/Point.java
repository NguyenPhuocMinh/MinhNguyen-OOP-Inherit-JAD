public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){

    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] xy = {this.x,this.y};
        return xy;
    }

    @Override
    public String toString() {
        return "X is : " + getX()
                + " and "
                + " Y is : " + getY()
                + "XY is : " + getXY()[0] + getXY()[1];
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());

        point = new Point(5,5);
        System.out.println(point.toString());
    }
}
