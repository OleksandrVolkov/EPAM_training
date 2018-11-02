package task_5.task_5_1.services;

import task_5.task_5_1.model.Magazine;
import task_5.task_5_1.model.Record;

public class MagazineService {
    Magazine model;

    public MagazineService(Magazine model){
        this.model = model;
    }

    public void deleteRecordByName(String name){
        for(int i=0; i<model.getRecords().size(); i++)
            if(model.getRecords().get(i).getName().equals(name))
                model.getRecords().remove(i);
    }

    public void deleteRecordBySurname(String surname){
        for(int i=0; i<model.getRecords().size(); i++)
            if(model.getRecords().get(i).getSurname().equals(surname))
                model.getRecords().remove(i);
    }

    public void addRecord(Record record){
        model.getRecords().add(record);
    }


}
