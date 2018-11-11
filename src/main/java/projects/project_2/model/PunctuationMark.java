package projects.project_2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Character;

public class PunctuationMark {
    private Character mark;

    private static ArrayList<Character> endMarks = new ArrayList(Arrays.asList(
       '!','.','?'
    ));
    private static ArrayList<Character> separatorMarks = new ArrayList(Arrays.asList(
            ',','-',';',':'
    ));
    public PunctuationMark(Character mark) {
        this.mark = mark;
    }

    public Character getMark() {
        return mark;
    }

    public void setMark(Character mark) {
        this.mark = mark;
    }

    public static ArrayList<Character> getEndMarks() {
        return endMarks;
    }

    public static void setEndMarks(ArrayList<Character> endMarks) {
        PunctuationMark.endMarks = endMarks;
    }

    public static ArrayList<Character> getSeparatorMarks() {
        return separatorMarks;
    }

    public static void setSeparatorMarks(ArrayList<Character> separatorMarks) {
        PunctuationMark.separatorMarks = separatorMarks;
    }
}
