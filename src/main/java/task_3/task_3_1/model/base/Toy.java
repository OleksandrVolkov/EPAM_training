package task_3.task_3_1.model.base;

public class Toy {
    private String color;
    private Size size;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Toy(String color, Size size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Toy(){}

    @Override
    public String toString() {
        return "Toy{" +
                "color='" + color + '\'' +
                ", " + size +
                ", price=" + price +
                '}';
        //return String.format("...");
    }
}
