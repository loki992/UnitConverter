import gui.Frame;
import model.*;

import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame();
            }
        });



        boolean test = true;

        System.out.println("Co chcesz obliczyc?");
        System.out.println("Długość - 1");
        System.out.println("Powierzchnia - 2");
        System.out.println("Rozmiarówki - 3");
        System.out.println("Pojemność - 4");
        System.out.println("Waga - 5");
        System.out.println("Inne jednostki fizyczne - 6");
        Scanner scanner = new Scanner(System.in);

        int chooseMenu = scanner.nextInt();
        scanner.nextLine();

        while (test) {
            switch (chooseMenu) {
                case 1:
                    lengthConverter.menu();
                    test = false;
                    break;
                case 2:
                    areaConverter.menu();
                    test = false;
                    break;
                case 3:
                    sizeConverter.menu();
                    test = false;
                    break;
                case 4:
                    volumeConverter.menu();
                    test = false;
                    break;
                case 5:
                    weightConverter.menu();
                    test = false;
                    break;
                case 6:
                    physicsConverter.menu();
                    test = false;
                    break;
                default:
                    System.out.println("Błedny input");

            }
        }
    }
}
