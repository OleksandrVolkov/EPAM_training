package task_5.task_5_2.controller;

import task_5.task_5_2.model.Generator;
import task_5.task_5_2.model.Range;
import task_5.task_5_2.view.UserInput;
import task_5.task_5_2.view.View;

public class Controller {
    Generator model;
    View view;

    public Controller(){
        view = new View();
    }
    public void run(){
        view.printMessage(View.GENERATING);

        model = Generator.getInstance();

        view.printMessage(View.ENTERING_LIST);
        view.printMessage(View.FIRST_RANGE);
        int rangeList1 = view.getIntVal();
        view.printMessage(View.SECOND_RANGE);
        int rangeList2 = view.getIntVal();
        view.printMessage(View.AMOUNT_OF_ELEMENTS);
        int amountList = view.getIntVal();
        model.generateListValues(new Range(rangeList1,rangeList2), amountList);
        view.printMessage(View.BLINK);

        while(true) {
            view.printMessage(View.ENTERING_SET);
            view.printMessage(View.FIRST_RANGE);
            int rangeSet1 = view.getIntVal();
            view.printMessage(View.SECOND_RANGE);
            int rangeSet2 = view.getIntVal();
            view.printMessage(View.AMOUNT_OF_ELEMENTS);
            int amountSet = view.getIntVal();
            model.generateSetValues(new Range(rangeSet1, rangeSet2), amountSet);
            if(rangeSet2-rangeSet1<amountSet)
                view.printMessage(View.INVALID_HASH_VAL);
            else
                break;
        }

        view.printMessage(View.BLINK);
        view.printMessage(View.LIST);
        view.printCollection(model.getList());

        view.printMessage(View.SET);
        view.printCollection(model.getSet());
    }

}
