import java.util.ArrayList;
import java.util.HashMap;

public class Profiles {



    public Profiles(User user){
        System.out.println("User id:"+user.getId());
        System.out.println("Username: "+user.getUsername());
        System.out.println("\n");
        System.out.println("Name: "+user.getFirstName()+" "+user.getLastName());
        System.out.println("Email: "+user.getEmail());
        System.out.println("\n");
    }


}
