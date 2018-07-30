import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class MethodExercises extends helpful{


    public static void main(String[] args) {
        MethodExercises thisClass = new MethodExercises();
        Scanner sc = new Scanner(System.in);
        String cont;

//        System.out.println(thisClass.Addition(5,8));
//        System.out.println(thisClass.Subtraction(8,5));
//        System.out.println(thisClass.Multiplication(3,5));
//        System.out.println(thisClass.Division(15,5));
//        System.out.println(thisClass.Modulus(8,3));

//        int userInput = getInteger(1,10);
//        System.out.println("your number is "+userInput+" would you like to continue? enter 'y' to continue, anything else to exit");
//        String cont = sc.next();
//        if(cont.equals("y")) {
//            System.out.println("!" + userInput + " is: " + Factorial(userInput));
////        }
//        System.out.println("want to play a game of dice? enter 'y' to continue, anything else to exit");
//        cont = sc.next();
//        int sides;
//        if(cont.equals("y")) {
//            do {
//                System.out.println("How many sides should the die have?");
//                sides = sc.nextInt();
//                Dice(sides);
//                System.out.println("would you like to play again? enter 'y' for yes, anything else to exit");
//                cont = sc.next();
//            }while(cont.equals("y"));
//        }

        GussingGame();

    }


    public static void GussingGame(){
        Scanner sc = new Scanner(System.in);
        Random rando = new java.util.Random();
        int guess;
        int randomNum = rando.nextInt(99)+1;
        boolean notYet = true;
        do{
            guess = getInteger(1,100);

            if(guess == randomNum){
                System.out.println("GOOD GUESS!");
                notYet = false;
            }else if(guess > randomNum){
                System.out.println("LOWER");
            }else{
                System.out.println("HIGHER");
            }
        }while(notYet);

    }


    public static void Dice(int sides){

        Random rando = new java.util.Random();
        ArrayList<Integer> rollResults= new ArrayList<>();
        for(int i = 1;i <= 2;i++){
            rollResults.add(rando.nextInt(sides-1)+1);
        }
        System.out.println("you have rolled"+rollResults);
    }

    public static int Factorial(int num){
        int ans = 1;

        for(int i = 1; i<=num;i++){
            ans *= i;
        }
        return ans;
    }

//    public  static int getInteger(int min,int max){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter number between "+min+" and"+max);
//        int userIn = sc.nextInt();
//        if(!isBetween(userIn,min,max)){
//            getInteger(min,max);
//        }
//        return userIn;
//    }

    private double Addition(double x, double y){
        return x+y;
    }
    private double Subtraction(double x, double y){
        return x-y;
    }
    private double Multiplication(double x, double y){
        double ans=0;
        for(int i = 0;i < y; i++){
            ans+=x;
        }
        return ans;
    }
    private double Division(double x, double y){
        return x/y;
    }
    private double Modulus(double x, double y){
        return x%y;
    }


}
