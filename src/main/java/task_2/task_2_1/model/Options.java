package task_2.task_2_1.model;

public enum Options {
    SEARCH_BY_AUTHOR(1),
    GET_BOOKS_AFTER_PERIOD(2),
    GET_BOOKS_BY_PUBLISHER(3),
    SORT_BY_PUBLISHERS(4),
    ERROR_VAL(5);

    private int option;
    Options(int option){
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    public static Options searchForOption(int i){
        switch (i){
            case 1:
                return SEARCH_BY_AUTHOR;
            case 2:
                return GET_BOOKS_AFTER_PERIOD;
            case 3:
                return GET_BOOKS_BY_PUBLISHER;
            case 4:
                return SORT_BY_PUBLISHERS;
            case 5:
                return ERROR_VAL;
        }

        return null;
    }
}
