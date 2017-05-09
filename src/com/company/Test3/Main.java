package com.company.Test3;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class WordCollection implements Iterable<String>{
    private List<String> words = new ArrayList<>();

    public void addWord(String word) {
        words.add(word);
    }


    @Override
    public void forEach(Consumer <? super String>  action) {

    }
//
    @Override
    public Iterator <String> iterator() {
        return words.iterator();
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        WordCollection someWords = new WordCollection();
        someWords.addWord("Display");
        someWords.addWord("these");
        someWords.addWord("words");
        someWords.addWord("using");
        someWords.addWord("a");
        someWords.addWord("for-each");
        someWords.addWord("loop.");

        for(String word: someWords) {
            System.out.println(word);
        }

    }

}
