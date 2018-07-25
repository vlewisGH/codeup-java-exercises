import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bob bob = new Bob();
        boolean ender = true;
        do{
            System.out.println("Chat with Bob, type \"bye\" to end the conversation");
            String userIn = sc.nextLine();

            if(userIn.equals("bye")){
                ender = false;
            }else{
                System.out.println(bob.Response(userIn));
            }
        }while(ender);

    }

    private String Response(String input){
        if(input.equals("")){
            return "Fine. Be that way!";
        }
        if(input.endsWith("?")){
            return "Sure";
        }
        if(input.endsWith("!") || input.toUpperCase().equals(input)){
            return "Whoa, chill out!";
        }
        return "Whatever";
    }

}
