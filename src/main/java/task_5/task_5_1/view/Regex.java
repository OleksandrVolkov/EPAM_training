package task_5.task_5_1.view;

public interface Regex {
    String NAME_REGEX = "[A-Z]{1,1}[a-z]{2,19}";
    String SURNAME_REGEX = "[A-Z]{1,1}[a-z]{2,19}";
    String PHONE_NUMBER_REGEX = "^\\+?(38)?\\(?050\\)?[0-9]{3}\\-?[0-9]{2}\\-?[0-9]{2}$";
    String ADDRESS_REGEX = "[A-Z]{1,1}[a-z]{2,19}";
    String DATE_REGEX = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
}
