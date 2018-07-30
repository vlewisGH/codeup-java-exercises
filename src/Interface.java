import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Interface {
    public static Scanner sc = new Scanner(System.in);

    private static ArrayList<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        seedDb("user1","John","Doe","john.doe@mail");
        seedDb("user2","Jane","Doe","jane.doe@mail");
        mainMenu();
    }
    private static void mainMenu(){
        System.out.println("enter the number of the action you would like performed:");
        System.out.println("1: View Your profile");
        System.out.println("2: View all profiles");
        System.out.println("3: Add new profile");

        switch(sc.nextLine()){
            case "1":
                Profiles profile = new Profiles(userList.get(userList.size()-1));
                System.out.println(profile);
                sc.nextLine();
                mainMenu();
                break;
            case "2":
                ShowAll();
                break;
            case "3":
                User newUser = new newUsers().newUsers();
                userList.add(newUser);
                ShowAll();
        }

    }
    private static void seedDb(String user, String first, String last, String email){
        User seed = new newUsers().newUsers(user,first,last,email);
        userList.add(seed);
    }


    private static boolean userExist(String user){
        for(User search: userList){
            if(search.getUsername().equalsIgnoreCase(user)){
                return true;
            }
        }
        return false;
    }
    private static int returnIndex(String user){
        int index = 0;
        for(User search: userList){
            if(search.getUsername().equalsIgnoreCase(user)){
                break;
            }
            index++;
        }
        return index;
    }

    private static void ShowAll(){
        for(User username:userList){
            System.out.println(username.getUsername());
        }
        System.out.println("enter the username to view that profile or 'home' to return to main menu");
        String userInput = sc.nextLine();

        if(userInput.equalsIgnoreCase("home")){
            mainMenu();
        }else if(userExist(userInput)){
            Profiles profile = new Profiles(userList.get(returnIndex(userInput)));
            System.out.println(profile);
            System.out.println("Click any button to continue");
            sc.nextLine();
            ShowAll();
        }else{
            System.out.println("That user does not exist!");
            ShowAll();
        }
    }
}
