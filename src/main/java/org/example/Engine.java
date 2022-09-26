package org.example;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    Scanner scanner = new Scanner(System.in);

    //String operation = scanner.next();
    String choice = scanner.nextLine();


    public void game() {
        System.out.println("Welcome to this game!");
        switch (choice) {
            case "Go South","S","South" -> System.out.println("Going South");
            case "Go North","N","North" -> System.out.println("Going North");

        }

    }


}
