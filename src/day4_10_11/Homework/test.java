package day4_10_11.Homework;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        String str= "This is a sample fllantopic rallopatetic nanollutic sentence.";
        String[] words = str.split("(\\w+.l{2}(?!o)\\w+)");
        for(int i=0;i<words.length;i++)
            System.out.print(words[i]+" ");
    }
}
