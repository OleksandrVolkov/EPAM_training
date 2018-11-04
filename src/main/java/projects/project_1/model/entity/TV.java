package projects.project_1.model.entity;
import projects.project_1.model.base.Appliance;
import projects.project_1.model.base.Size;

public class TV extends Appliance{
    private String mark;

    public TV(int powerConsumed, Size size, String mark) {
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

        TV tv = (TV) o;

        return mark != null ? mark.equals(tv.mark) : tv.mark == null;
    }

    @Override
    public int hashCode() {
        return mark != null ? mark.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "TV{" +
                "mark='" + mark + "'" + super.toString() +
                '}';
    }
}
