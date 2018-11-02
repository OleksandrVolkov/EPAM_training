package task_5.task_5_3.model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary(HashMap<String, String> dictionary){
        this.dictionary = dictionary;
    }


    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void add(String en, String rus){
        dictionary.put(en, rus);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
