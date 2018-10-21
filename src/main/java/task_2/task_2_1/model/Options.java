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
}
