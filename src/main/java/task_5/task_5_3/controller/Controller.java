package task_5.task_5_3.controller;

import task_5.task_5_3.data.Data;
import task_5.task_5_3.model.Dictionary;
import task_5.task_5_3.service.LexemProcessing;
import task_5.task_5_3.view.View;

public class Controller {
    View view;
    Dictionary dictionary;
    LexemProcessing service;

    public Controller(){
        view = new View();
        dictionary = new Dictionary(Data.getData());
        service = new LexemProcessing();
    }

    public void run(){
        //For example, "Hello, it is me"

        boolean val = true;
        while(val) {
            view.showMessage(View.MENU);
            switch (view.enterInt()) {
                case 1:
                    addWord();
                    break;
                case 2:
                    translate();
                    break;
                case 3:
                    val = false;
                default:
                    break;
            }
            view.showMessage(View.BLINK);
        }


    }

    public void addWord(){
        view.showMessage(View.ENTER_WORD_EN);
        String enWord = view.enterString();

        view.showMessage(View.ENTER_WORD_RUS);
        String rusWord = view.enterString();

        dictionary.add(enWord, rusWord);
    }


    public void translate(){
        view.showMessage(View.ENTER_PHRASE);
        String str = view.enterString();
        service.processString(str);
        view.showMessage(View.TRANSLATION);

        for(int i=0;i<service.getLexems().size(); i++) {
            if(dictionary.getDictionary().get(service.getLexems().get(i)) == null)
                view.showLexem(service.getLexems().get(i) + View.SPACE);
            else
                view.showLexem(dictionary.getDictionary().get(service.getLexems().get(i)) + View.SPACE);
        }
    }
}
