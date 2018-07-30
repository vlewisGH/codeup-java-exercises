import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("please enter a string:\n");
        input.getString();
        System.out.println("yes or no?\n");
        System.out.println(input.yesNo());
        System.out.println("please enter a integer:\n");
        input.getInt();
        input.getInt(1,10);
        System.out.println("please enter a double:\n");
        input.getDouble();
        input.getDouble(1,10);

    }
}
