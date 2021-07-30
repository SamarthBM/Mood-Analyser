/**
 * Purpose : To perform mood analyser test cases.
 *
 * @author: Samarth BM
 */
package com.bridgelabs;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    /**
     * Purpose : analyse mood
     * Input message : This is a sad message.
     * @return : SAD
     */
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Purpose : analyse mood
     * Input message: Iam in any mood.
     * @return : HAPPY
     */
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Im in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    /**
     * Purpose : Handle Exception if User Provides Invalid Mood
     * Input message: null
     * @return : HAPPY
     */

    @Test
    public void testMoodAnalysis_whenMoodIsNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY" , mood);
    }

}


