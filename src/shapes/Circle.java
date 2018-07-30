package shapes;
import util.Constants;

public class Circle {
    public double pi = new Constants().pi;
    private double radius;

    public Circle(double radius){
            this.radius = radius;
    }

    public double getCircumference(){
        return (2 * pi * radius);
    }

    public double getArea(){
        return (pi * (radius * radius));
    }

}
