package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static private ArrayList counterList = new ArrayList();

    static private int randomNumber() {
        Random r = new Random();
        int num1 = r.nextInt(10);
        return num1;
    }

    static private String randomColour() {
        int num1 = randomNumber();
        String colour;
        if (num1 <= 3) {
           colour = "red";
        }else if ((num1 < 7) && (num1 > 3))  {
            colour = "blue";
        }else {
            colour = "green";
        }
        return colour;
    }

    static private void generateCounter(){
        for (int i = 0; i < 10; i++) {
            String colour;
            colour = randomColour();
            Counter counter = new Counter(colour);
            counterList.add(counter);
        }
    }

    static private void generateLastCounter() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        generateCounter();
        System.out.println(counterList);
        System.out.println("Please guess the next colour.");
        String userGuess = input.nextLine();
        
    }
}
