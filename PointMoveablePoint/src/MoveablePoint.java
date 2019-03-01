public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] xySpeed = {this.xSpeed, this.ySpeed};
        return xySpeed;
    }

    public MoveablePoint move(){
        super.setX(super.getX() + this.getXSpeed());
        super.setY(super.getY() + this.getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f),Speed=(%f,%f)",super.getX(),super.getY(),this.xSpeed,this.ySpeed);
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint.toString());

        moveablePoint = new MoveablePoint(10,10);
        System.out.println(moveablePoint.toString());

        moveablePoint = new MoveablePoint(5,5,10,10);
        System.out.println(moveablePoint.move().toString());
    }
}
