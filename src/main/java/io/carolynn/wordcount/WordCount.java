package io.carolynn.wordcount;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WordCount {

    private Iterator<String> si;
    private HashMap<String, Integer> wordCount;

    public WordCount(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
        this.wordCount = new HashMap<>();
    }

    public WordCount(Iterator<String> si) {
        this.si = si;
    }

    public void createMap() {
        while (si.hasNext()) {
            si.hasNext();
            String input = si.next();
            String element = input.replaceAll("\\W+", "").toLowerCase();
            if(!wordCount.containsKey(element)) {
                wordCount.put(element, 1);
            } else if(wordCount.containsKey(element)) {
                wordCount.replace(element, wordCount.get(element)+1);
            }
        }
    }


    public StringBuilder printMap(){
        StringBuilder count = new StringBuilder();
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(wordCount.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(list);
        for(Map.Entry<String,Integer> entry: list){
            count.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return count;
    }
}
