import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;

    public User(){}

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



//    private void GetName(String first,String last){
//        this.firstName = first;
//        this.lastName = last;
//    }
//    private void GetId(long newID){
//        this.id = newID;
//    }
//    private void GetPhn(String number){
//        this.phnNumber = number;
//    }
//    private void GetEmail(String newEmail){
//        this.email = newEmail;
//    }



}
