package projects.project_2.view;

import projects.project_2.model.Word;

import java.util.List;
import java.util.Set;

public class View implements UserInterface{
    public void printMessage(String str){
        System.out.println(str);
    }

    public void printWords(String mes, Set<Word> words){
        System.out.print(mes);
        int counter = 0;

        for(Word word: words){
            if(counter==words.size()-1)
                System.out.println(word.getWord());
            else
                System.out.print(word.getWord() + ", ");
            counter++;
        }
    }

}
