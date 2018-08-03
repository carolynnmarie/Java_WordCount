package io.carolynn.wordcount;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestWordCount {

    @Test
    public void createMapTest() {
        //Given
        WordCount wordCount = new WordCount(WordCount.class.getResource("/test.txt").getFile());
        //When
        wordCount.createMap();
        //Then
        StringBuilder counts = wordCount.printMap();
        System.out.println(counts);
    }

}
