/**
 * Purpose : Refactored to perform mood analyser by declaring the message in constructor.
 *
 * @author: Samarth BM
 */
package com.bridgelabs;

public class MoodAnalyser {

    private String message;

    //Default Constructor
    public MoodAnalyser() {
    }

    //Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Purpose : Given a message, ability to analyse and respond HAPPY or SAD mood.
     * Condition: Handle NULLPOINTER Exception using try-catch block.
     *
     * @return : HAPPY or SAD
     */
    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            return "HAPPY";
        }
    }
}
