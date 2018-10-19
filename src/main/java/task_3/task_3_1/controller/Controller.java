package task_3.task_3_1.controller;

import task_3.task_3_1.DataSource;
import task_3.task_3_1.GameRoom;
import task_3.task_3_1.view.ToyView;
import task_3.task_3_1.model.base.Toy;

public class Controller {
    GameRoom<Toy> model = new GameRoom<Toy>();
    ToyView<Toy> view = new ToyView<Toy>();

    public Controller(){}

    public void run() {
        model.setToys(DataSource.getToys());

        view.printMessage(ToyView.INITIAL_GAMEROOM);

        view.showToys(model.getToys());

        view.printMessage(ToyView.BLINK_LINE);

        sortBySize();

        view.printMessage(ToyView.BLINK_LINE);

        getRangedValues();

        view.printMessage(ToyView.BLINK_LINE);

        view.printMessage(ToyView.TOTAL_PRICE + model.getTotalPrice());

    }

    public void sortBySize(){
        view.printMessage(ToyView.SORTING_BY_AREA);
        model.sortToysBySize();
        for(Toy i: model.getToys())
            view.showToy(i);
    }

    public void getRangedValues(){
        int [] indexes = model.getIndexesRangeOfPrice(999, 1600);
        int counter=0;
        view.printMessage(ToyView.PREDEFINED_RANGE + " (999;1600)");
        for(int i: indexes)
            view.showToy(model.getToys()[i]);
    }
}
