package com.courses.lesson12;

/**
 * Created by ibilous on 12.11.2015.
 */
public class StringStatistic {

    private Long length;
    private int wordCount;
    private String longestWord;

   /* public StringStatistic(Long length, int wordCount, String longestWord) {
        this.length = length;
        this.wordCount = wordCount;
        this.longestWord = longestWord;
    }*/

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }
}
