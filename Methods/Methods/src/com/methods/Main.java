package com.methods;


/*
* CODE CHALLENG
*
* Create a method called displayHighScorePositon
* It should take a players name as a parameter, and 2nd parameter as a position in the high score
* You should display the players name along with a message like " managed to get in position"
* and the position they got a further message " on the high score table"
*
*
* Create a 2an method called calculateHighScorePosition
* It should be sent on argument only, the player score
* it should return a int
* the return data should be
* 1 if the score is > 1000
* 2 if the score is >500 and <1000
* 3 if the score is >100 and <500
* 4 in all other cases
*
* call both methods and display the results of the following
* a score of 1500, 900, 400 and 50*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.next();

        System.out.println("Score?");
        int score = input.nextInt();

        HighScorePosition showResults = new HighScorePosition();
        System.out.printf("%dº place!", showResults.displayPositon(name, score));
    }
}
