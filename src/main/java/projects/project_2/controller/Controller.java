package projects.project_2.controller;

import projects.project_2.data.Text;
import projects.project_2.model.Word;
import projects.project_2.service.Service;
import projects.project_2.view.View;

import java.util.ArrayList;

public class Controller {
    private Service service = new Service();
    private View view = new View();

    public void run(){
        service.processText(Text.getText());
        service.processUniqueWords();

        view.printMessage(View.PROCESSING_STRING + View.BLINK + View.TABL + Text.getText());

        ArrayList<Word> words = service.getUniqueWords();
        if(words.isEmpty())
            view.printMessage(View.NO_UNIQUE_WORDS);
        else
            view.printWords(View.UNIQUE_WORDS, service.getUniqueWords());
    }

}
