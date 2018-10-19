package task_3.task_3_2.model;

import java.util.Arrays;
import java.util.Comparator;

public class Store {
    private String name;
    Stores stores = new Stores();


    public Store(){}

    public class Department {
        private String name;
        private String kindOfGoods;
        private String place;



        public Department(String name, String kindOfGoods, String place) {
            this.name = name;
            this.kindOfGoods = kindOfGoods;
            this.place = place;
        }
        public Department(){}

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getKindOfGoods() {
            return kindOfGoods;
        }
        public void setKindOfGoods(String kindOfGoods) {
            this.kindOfGoods = kindOfGoods;
        }
        public String getPlace() {
            return place;
        }
        public void setPlace(String place) {
            this.place = place;
        }


        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", kindOfGoods='" + kindOfGoods + '\'' +
                    ", place='" + place + '\'' +
                    '}';
        }

    }

    public Department getNewDepartment(String name, String kindOfGoods, String place){
        return new Department(name, kindOfGoods, place);
    }

    public void createNewDepartment(String name, String kindOfGoods, String place){
        stores.createNewDepartment(name, kindOfGoods, place);
    }

    public void sortByName(){
        stores.sortByName();
    }

    public void deleteDepartmentByName(String name){
        stores.deleteDepartmentByName(name);
    }

    public Department createDepartment(){
        return new Department();
    }

    public Department[] getDepartments() {
        return stores.getDepartments();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
