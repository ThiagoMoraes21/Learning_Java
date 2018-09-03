package com.methods;

/*
 * Create a 2an method called calculateHighScorePosition
 * It should be sent on argument only, the player score
 * it should return a int
 * the return data should be
 * 1 if the score is > 1000
 * 2 if the score is >500 and <1000
 * 3 if the score is >100 and <500
 * 4
 * */

public class HighScorePosition {
    public int displayPositon(String name, int score){
        System.out.println();

           if(score >= 1000) {
            return 1;

           } else if (score >= 500) {
               return 2;

           } else if (score >= 100) {
                return 3;

           } else {
               return 4;
           }
    }
}
