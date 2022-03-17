package com.factoriaf5.rps.application;

import java.util.Scanner;

import com.factoriaf5.rps.domain.contracts.Material;
import com.factoriaf5.rps.domain.models.MaterialFactory;

public class Game {

    public static void main(String[] args) {

        play();

    }

    public static String play() {

        MaterialFactory objectFactory = new MaterialFactory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("First object: insert R/P/S (Rock/Paper/Scissors)");
        String firstobject = scanner.nextLine();

        System.out.println("Second object: insert R/P/S (Rock/Paper/Scissors)");
        String secondobject = scanner.nextLine();

        scanner.close();

        Material object1 = objectFactory.createObject(firstobject);
        Material object2 = objectFactory.createObject(secondobject);

        String winner = checkWinner(object1, object2);
        return winner;      
    }

    public static String checkWinner(Material object1, Material object2) {
        
        String winner = object1.winsTo(object2);

        System.out.println(winner);
    
        return winner;

    }
}