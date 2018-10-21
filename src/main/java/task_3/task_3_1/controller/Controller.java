package task_3.task_3_1.controller;

import task_3.task_3_1.data.DataSource;
import task_3.task_3_1.model.base.GameRoom;
import task_3.task_3_1.services.GameRoomService;
import task_3.task_3_1.view.ToyView;
import task_3.task_3_1.model.base.Toy;

public class Controller {
    GameRoom<Toy> model = new GameRoom<Toy>();
    ToyView<Toy> view = new ToyView<Toy>();
    GameRoomService gameRoomService;


    public Controller(){}

    public void run() {
        model.setToys(DataSource.getToys());
        gameRoomService = new GameRoomService(model, model.getToys());

        view.printMessage(ToyView.INITIAL_GAMEROOM);

        view.showToys(model.getToys());

        view.printMessage(ToyView.BLINK_LINE);

        view.printMessage(ToyView.SORTING_BY_AREA);
        gameRoomService.sortToysBySize();
        view.showToys(model.getToys());

        view.printMessage(ToyView.BLINK_LINE);


        view.printMessage(ToyView.PREDEFINED_RANGE + " (999;1600)");
        view.showByIndexes(gameRoomService.getIndexesRangeOfPrice(999, 1600), model);



        view.printMessage(ToyView.BLINK_LINE);

        view.printMessage(ToyView.TOTAL_PRICE + gameRoomService.getTotalPrice());

    }

}



