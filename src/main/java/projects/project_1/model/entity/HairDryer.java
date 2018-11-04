package projects.project_1.model.entity;
import projects.project_1.model.base.Appliance;
import projects.project_1.model.base.Size;

public class HairDryer extends Appliance {
    private String mark;

    public HairDryer(int powerConsumed, Size size, String mark) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HairDryer hairDryer = (HairDryer) o;

        return mark.equals(hairDryer.mark);
    }

    @Override
    public int hashCode() {
        return mark.hashCode();
    }

    @Override
    public String toString() {
        return "HairDryer{" +
                "mark='" + mark + "'" + super.toString() +
                '}';
    }
}
