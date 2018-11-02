package task_5.task_5_1.model;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<Record> records;

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Magazine(){
        records = new ArrayList<>();
    }

}
