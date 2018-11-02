package task_5.task_5_1.services;

//import task_5.task_5_1.view.Regex;

import task_5.task_5_1.view.Regex;

public class Validator implements Regex{
    public boolean isValidName(String str){
        if(str.matches(NAME_REGEX))
            return true;
        return false;
    }
    public boolean isValidSurname(String str, String regex){
        if(str.matches(SURNAME_REGEX))
            return true;
        return false;
    }
    public boolean isValidDate(String str, String regex){
        if(str.matches(DATE_REGEX))
            return true;
        return false;
    }
    public boolean isValidPhoneNumber(String str){
        if(str.matches(PHONE_NUMBER_REGEX))
            return true;
        return false;
    }
    public boolean isValidStreet(String str, String regex){return true;}
}
