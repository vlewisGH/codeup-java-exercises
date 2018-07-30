import shapes.Circle;
import util.Input;

public class CircleApp {
    public static Input input = new Input();

    public static void main(String[] args) {
        do {
            System.out.println("Please enter a radius to get the circumference and area of its circle:");
            Circle circ = new Circle(input.getDouble());
            System.out.println(circ.getCircumference());
            System.out.println(circ.getArea()+"\n");
            System.out.println("would you like to enter another radius?");
            System.out.println(input.getString());
        }while(input.yesNo());
    }
}
