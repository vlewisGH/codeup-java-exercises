import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ConsoleExercises {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


//        System.out.println("Please enter an integer:");
//        int inputInt = in.nextInt();
//
//        System.out.println("enter three words:");
//        String word1 = in.next();
//        String word2 = in.next();
//        String word3 = in.next();
//
//        System.out.print(word1+"\n"+word2+"\n"+word3+"\n");
//        in.nextLine();
//        System.out.println("please enter a sentence");
//        String sentence = in.nextLine();
//
//        System.out.println(sentence);
//
//        System.out.println("this program will calculate the perimeter of the classroom");
//        System.out.println("please enter the classroom's width:");
//        String width = in.nextLine();
//        System.out.println("please enter the classroom's length:");
//        String length = in.nextLine();
//        System.out.println("The classroom's area is: " + ((Float.parseFloat(width))*(Float.parseFloat(length)));
//        System.out.println("The classroom's perimeter is: "+((Float.parseFloat(width)*2)+(Float.parseFloat(length)*2)));

        ArrayList<String> userInputs = new ArrayList<>();
        System.out.println("What's new?");
        boolean inputTest = false;
        do{
            userInputs.add(in.next());
            System.out.println("top input test: "+ inputTest);
            System.out.println(userInputs);

//            if(!in.hasNext()) {
//                inputTest = false;
//                in.close();
//            }
            inputTest = in.hasNext();
            System.out.println("bottom input test: "+inputTest);
        }while(inputTest);

        for(String input: userInputs){
            System.out.println("loop: "+input);
        }
    }


}
