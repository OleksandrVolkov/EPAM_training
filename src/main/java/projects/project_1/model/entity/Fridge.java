package projects.project_1.model.entity;
import projects.project_1.model.base.Appliance;
import projects.project_1.model.base.Size;

public class Fridge extends Appliance{
    private String mark;


    public Fridge(int powerConsumed, Size size, String mark) {
        super(powerConsumed, size);
        this.mark = mark;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "mark='" + mark + "'"+ super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fridge fridge = (Fridge) o;

        return mark.equals(fridge.mark);
    }

    @Override
    public int hashCode() {
        return mark.hashCode();
    }
}
