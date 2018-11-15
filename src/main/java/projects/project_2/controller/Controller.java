package projects.project_2.controller;
import projects.project_2.service.FileHandler;
import projects.project_2.service.Service;
import projects.project_2.view.View;
import java.io.FileNotFoundException;

public class Controller {
    private Service service = new Service();
    private View view = new View();
    private FileHandler fileHandler = new FileHandler();

    public void run() throws FileNotFoundException {
        String text = fileHandler.getText("static/Text.txt");

        service.processText(text);
        service.processUniqueWords();

        view.printMessage(View.PROCESSING_STRING + View.BLINK + View.TABL + text);

        if(service.getUniqueWords().isEmpty())
            view.printMessage(View.NO_UNIQUE_WORDS);
        else
            view.printWords(View.UNIQUE_WORDS, service.getUniqueWords());
    }

}
