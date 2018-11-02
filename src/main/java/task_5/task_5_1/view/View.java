package task_5.task_5_1.view;

import task_5.task_5_1.model.Address;
import task_5.task_5_1.model.Record;

import java.util.List;

public class View implements UserInterface, Regex{
    UserInput userInput = new UserInput();


    public void printMessage(String mes){
        System.out.println(mes);
    }

    public String enterName(){
        return userInput.enterName(NAME_REGEX, this);
    }
    public String enterSurname(){
        return userInput.enterSurname(SURNAME_REGEX, this);
    }
    public String enterDateOfBirth(){
        return userInput.enterDateOfBirth(DATE_REGEX, this);
    }
    public String enterPhoneNumber(){
        return userInput.enterPhoneNumber(PHONE_NUMBER_REGEX, this);
    }
    public Address enterAddress(){
        return userInput.enterAddress(ADDRESS_REGEX, this);
    }

    public int enterInt(){
        return userInput.enterIntValue(this);
    }

    public void displayMagazine(List<Record> magazine){
        if(magazine.size() == 0)
            System.out.println(EMPTY_MAGAZINE);
        else
            for(Record record: magazine)
                System.out.println(record);
    }

}
