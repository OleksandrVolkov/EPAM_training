package task_5.task_5_2.model;

import java.util.*;

public class Generator {
    private List<Integer> list;
    private Set<Integer> set;
    private static Generator instance = new Generator();


    private Generator(){ }

    public static Generator getInstance(){
        if(instance == null)
            return instance = new Generator();
        return instance;
    }



    public void generateListValues(Range range, int amount){
        list = new ArrayList<>();
        int generatedValue;
        for(int i = 0; i<amount; i++){
            generatedValue = (int)((Math.random()*(range.getNumb2()-range.getNumb1()+1))+range.getNumb1());
            list.add(generatedValue);
        }
    }

    public boolean generateSetValues(Range range, int amount){
        if(range.getNumb2()-range.getNumb1()<0||range.getNumb2()-range.getNumb1()<amount)
            return false;

        set = new HashSet<>();
        int generatedValue;
        for(int i = 0;i<amount; i++){
            generatedValue = (int)((Math.random()*(range.getNumb2()-range.getNumb1()+1))+range.getNumb1());
            if(set.contains(generatedValue)){
                i--;
                continue;
            }
            set.add(generatedValue);
        }
        return true;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }
}
