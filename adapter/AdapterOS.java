package adapter;

import java.util.Scanner;

public class AdapterOS {
    public void AdapterOS() {
        Scanner scan = new Scanner(System.in);
        String text;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("\nPlease enter your operating system");
            text = scan.next();

            if (text.equalsIgnoreCase("iOS")) {
                IOS musicplayer = new IOS();
                System.out.println("iOS ");
                musicplayer.DolbyAtmos();
                musicplayer.DigitalSound();
                validInput = true;
            } else if (text.equalsIgnoreCase("Android")) {
                IOS musicplayer = new IOS();
                Android musicplayer2 = new AndroidOS();
                Android adapt = new AndroidAdapt(musicplayer);
                musicplayer2.LosslessFunction();
                adapt.LosslessFunction();
                validInput = true;
            } else {
                System.out.println("Error: Please choose between Android or iOS only.");
            }
        }
    }
}




