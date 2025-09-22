public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    // constructor
    public Circle(double rad){
        this.radius = rad;
    }

    //setter
    public void setRadius(double rad){
        this.radius = rad;
    }

    //getter
    public double getRadius(){
        return this.radius;
    }

    //calculate area
    public double area(){
        return this.radius * this.radius * PI;
    }

    //calculate circumference
    public double circumference(){
        return 2 * this.radius * PI;
    }

    //print area
    public void printArea(){
        System.out.println(this.area());
    }

    //print circumference
    public void printCircumference(){
        System.out.println(this.circumference());
    }
}
