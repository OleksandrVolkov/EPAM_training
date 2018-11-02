package task_5.task_5_1.view;

import task_5.task_5_1.model.Address;
import task_5.task_5_1.services.Validator;

import java.util.Scanner;

public class UserInput {
    private Scanner scn;
    private Validator validator;

    public UserInput(){
        validator = new Validator();
    }

    public String enterName(String regex, View view){
        while(true) {
            view.printMessage(view.ENTER_NAME);
            String name = enterStringValue(view);
            if (validator.isValidName(name))
                return name;
            else
                view.printMessage(view.ERROR_VAL);
        }
    }

    public String enterSurname(String regex, View view){
        while(true){
            view.printMessage(view.ENTER_SURNAME);
            String name = enterStringValue(view);
            if (validator.isValidSurname(name, regex))
                return name;
            else
                view.printMessage(view.ERROR_VAL);
        }
    }

    public String enterDateOfBirth(String regex, View view){
        while(true){
            view.printMessage(view.ENTER_DATE_OF_BIRTH);
            String date = enterStringValue(view);

            if (validator.isValidDate(date, regex))
                return date;
            else
                view.printMessage(view.ERROR_VAL);
        }
    }


    public String enterPhoneNumber(String regex, View view){
        while(true){
            view.printMessage(view.ENTER_PHONE_NUMBER);
            String number = enterStringValue(view);

            if (validator.isValidPhoneNumber(number))
                return number;
            else
                view.printMessage(view.ERROR_VAL);
        }
    }

    public Address enterAddress(String regex, View view) {
            String street;

             while(true) {
                 view.printMessage(view.ENTER_STREET);
                 street = enterStringValue(view);
                 if (validator.isValidStreet(street, regex))
                    break;
                 else
                     view.printMessage(view.ERROR_VAL);
             }

             view.printMessage(view.ENTER_HOME_NUMBER);
             int homeNumber = enterIntValue(view);

             view.printMessage(view.ENTER_FLAT_NUMBER);
             int flatNumber = enterIntValue(view);

             return new Address(street, homeNumber, flatNumber);
    }





    public int enterIntValue(View view){
        scn = new Scanner(System.in);
        int val = 0;

        while(true){
            if(scn.hasNextInt()){
                val = scn.nextInt();

                if(val>0)
                    return val;
                else {
                    view.printMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }
            }else{
                view.printMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }
    public String enterStringValue(View view){
        scn = new Scanner(System.in);
        String val = "";

        while(true){
            if(scn.hasNextLine()){
                val = scn.nextLine();

                if(!val.equals("") || !val.equals(" "))
                    return val;
                else {
                    view.printMessage(view.ERROR_VAL);
                    scn = new Scanner(System.in);
                }
            }else{
                view.printMessage(view.ERROR_VAL);
                scn = new Scanner(System.in);
            }
        }
    }
}
