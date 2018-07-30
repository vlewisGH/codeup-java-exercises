import java.util.Scanner;

public class helpful {

    public static void main(String[] args) {

    }

    public static boolean isBetween(int n, int lower, int upper){
        return (lower <= n) && (n <= upper);
    }

    public  static int getInteger(int min,int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number between "+min+" and "+max);
        int userIn = sc.nextInt();
        if(!isBetween(userIn,min,max)){
            getInteger(min,max);
        }
        return userIn;
    }

    public static int Factorial(int num){
        int ans = 1;

        for(int i = 1; i<=num;i++){
            ans *= i;
        }
        return ans;
    }


}
