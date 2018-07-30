import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class newUsers{
   
    Scanner sc = new Scanner(System.in);

    public User newUsers(){
        User user = new User();
        System.out.println("Username:");
        user.setUsername(sc.nextLine());

        System.out.println("First name:");
        user.setFirstName(sc.nextLine());

        System.out.println("Last name:");
        user.setLastName(sc.nextLine());

        System.out.println("Your email:");
        user.setEmail(sc.nextLine());
        Random randoId = new Random();

        user.setId(randoId.nextLong());
        return user;
    }

    public User newUsers(String username, String firstname, String lastname, String email){
        User user = new User();
        user.setUsername(username);
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setEmail(email);
        Random randoId = new Random();
        user.setId(randoId.nextLong());
        return user;
    }

}
