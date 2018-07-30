package util;

import java.util.Scanner;

public class Input {
    public Scanner sc = new Scanner(System.in);

    public Input(){

    }

    public String getString(){
        return sc.nextLine();
    }

    public boolean yesNo(){
        String input = getString();
        if(input.equalsIgnoreCase("y")){
            return true;
        }else if(input.equalsIgnoreCase("yes")){
           return true;
        }
        return false;
    }

    public int getInt(int min, int max){
        int input;
        do {
            System.out.println("Please enter a number between " + min + " and " + max);
            input = sc.nextInt();
        }while(min <= input && input >= max);
        return input;
    }

    public int getInt(){
        return sc.nextInt();
    }

    public double getDouble(double min, double max){
        double input;
        do {
            System.out.println("Please enter a number between " + min + " and " + max);
            input= sc.nextDouble();
        }while(min <= input && input >= max);
        return input;
    }

    public double getDouble(){
        return sc.nextDouble();
    }
}
