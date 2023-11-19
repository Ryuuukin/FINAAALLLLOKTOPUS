package observer;

import java.util.Scanner;

public class Begin {
    public void begin(){
        Scanner scan = new Scanner(System.in);
        String username;
        System.out.println("Hello, we are ASAMusic.\nWe need some information about you.\nPlease enter your user name ");
        username=scan.next();
        User user = new User(username); //observer beginning
        Artists OliviaRodrigo = new Artists();
        Artists BrunoMars = new Artists();

        OliviaRodrigo.register(user);
        BrunoMars.register(user);

        OliviaRodrigo.addNews("Olivia Rodrigo will release new album tonight at 7pm. Are you ready for this?!!");

        BrunoMars.addNews("Bruno Mars will release new album tomorrow at 2pm.");
    }
}
