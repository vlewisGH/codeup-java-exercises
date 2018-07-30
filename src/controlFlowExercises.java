import java.util.Scanner;
import java.io.*;

public class controlFlowExercises {
    Scanner sc = new Scanner(System.in);


    private void whileLoop(int n){
        while(n <= 15){
            System.out.println(n++);
        }
    }

     private void plus2(int n){
        for(;n<100;){
            System.out.println(n);
            n+=2;
        }
        System.out.println(n);
    }

     private void backToZero(int n){
      for(;n>0;){
          System.out.println(n);
          n-=5;
      }
         System.out.println(n);
    }

    private void squares(long n){
        for(;n<1000000;){
            System.out.println(n);
            n=n*n;
        }
    }

    private void FizzBuzz(){
        for(int i=1;i<101;i++){
            if((i%3==0) || (i%5==0)){
                if (i % 3 == 0) {
                    System.out.print("Fizz ");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
                System.out.print("\n");
            }else {
                System.out.println(i);
            }
        }
    }
    private String Spacer(int n){
        if(isBetween(n,0,9)){
            return "        ";
        }
        if(isBetween(n,10,99)){
            return "       ";
        }
        if(isBetween(n,101,999)){
            return "      ";
        }
        if(isBetween(n,1000,9999)){
            return "     ";
        }
        if(isBetween(n,10000,99999)){
            return "    ";
        }
        if(isBetween(n,100000,999999)){
            return "       ";
        }
        return"";
    }
    private void TableOfPowers(){
        System.out.print("What number would you like to go up to?: ");
        long input = sc.nextLong();
        System.out.println("number   | squared | cubed");
        System.out.println("-----    | ------- | -----");
        for(int i = 1;i<input;i++) {
            System.out.printf("%-9d",i);
            System.out.print("|" );
            System.out.printf("%-9d",(i * i ));
            System.out.print("|");
            System.out.printf("%-9d",(i * i * i));
            System.out.print("\n");
        }
    }

    private boolean isBetween(int n, int lower, int upper){
        return (lower <= n) && (n <= upper);
    }

    private void Converter(){
        System.out.print("please enter your grade: ");
        int input = sc.nextInt();
        if(isBetween(input,88,100)){
            System.out.println("Your grade an A");
        }
        if(isBetween(input,80,87)){
            System.out.println("Your grade a B");
        }
        if(isBetween(input,67,79)){
            System.out.println("Your grade a C");
        }
        if(isBetween(input,60,66)){
            System.out.println("Your grade a D");
        }
        if(isBetween(input,0,59)){
            System.out.println("Your grade an F");
        }
    }

    public static void main(String[] args) {
        int i = 5;
        int num = 0;
        Scanner in = new Scanner(System.in);

        controlFlowExercises thisObj = new controlFlowExercises();

//        System.out.println("\nFirst While loop: ");
//
//        thisObj.whileLoop(i);
//
//        System.out.println("\nFirst Do While loop: ");
//
//        thisObj.plus2(num);

//        System.out.println("\nSecond do While loop: ");
//        thisObj.backToZero(100);

//        System.out.println("\nSquares:");
//        thisObj.squares(2);

//        thisObj.FizzBuzz();
        String cont = "y";
        do {
            thisObj.TableOfPowers();
            System.out.print("Would you to use another number? y or n:");
            cont = in.next();
        }while(cont.equals("y"));

        String cont2 = "y";
        do {
            thisObj.Converter();
            System.out.print("Would you to use another grade? y or n:");
            cont2 = in.next();
        }while(cont2.equals("y"));
//
    }
}
