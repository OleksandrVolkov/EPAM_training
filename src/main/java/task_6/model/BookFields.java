package task_6.model;

public enum BookFields {
    PUBLISHER, AUTHOR,  NAME, YEAR, PRICE, PAGES;

    public static BookFields getBookField(int counter){
        switch (counter){
            case 1:
                return AUTHOR;
            case 2:
                return PUBLISHER;
            case 3:
                return NAME;
            case 4:
                return YEAR;
            case 5:
                return PAGES;
            case 6:
                return PRICE;
            default:
                return null;
        }
    }
}
