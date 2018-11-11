package projects.project_2.view;

import projects.project_2.model.Word;

import java.util.List;

public class View implements UserInterface{
    public void printMessage(String str){
        System.out.println(str);
    }

    public void printWords(String mes, List<Word> words){
        System.out.print(mes);

        for(int i=0;i<words.size();i++){
            if(i==words.size()-1)
                System.out.println(words.get(i).getWord());
            else
                System.out.print(words.get(i).getWord() + ", ");
        }
    }

}
