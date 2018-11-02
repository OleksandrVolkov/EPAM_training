package task_5.task_5_1.model;

public class Address {
    private String street;
    private int homeNumber;
    private int flatNumber;

    public Address(String street, int homeNumber, int flatNumber) {
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }





    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }
}
