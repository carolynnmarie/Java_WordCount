package io.carolynn.wordcount;

import org.junit.Test;

public class TestWordCount {

    @Test
    public void createMapTest() {
        //Given
        WordCount wordCount = new WordCount(WordCount.class.getResource("/244-0.txt").getFile());
        //When
        wordCount.createMap();
        //Then
        StringBuilder counts = wordCount.printMap();
        System.out.println(counts);
    }

}
