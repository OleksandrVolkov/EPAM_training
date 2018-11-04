package projects.project_1.model.base;

import java.util.Comparator;

public abstract class Appliance{
    private boolean isPlugged;
    private int powerConsumed;
    private Size size;

    public Appliance(int powerConsumed, Size size){
        this.powerConsumed = powerConsumed;
        this.size = size;
    }


    public boolean isPlugged() {
        return isPlugged;
    }

    public void setPlugged(boolean plugged) {
        isPlugged = plugged;
    }

    public int getPowerConsumed() {
        return powerConsumed;
    }



    public void setPowerConsumed(int powerConsumed) {
        this.powerConsumed = powerConsumed;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return ", powerConsumed=" + powerConsumed + ", isPlugged="+isPlugged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appliance appliance = (Appliance) o;

        if (isPlugged != appliance.isPlugged) return false;
        if (powerConsumed != appliance.powerConsumed) return false;
        return size != null ? size.equals(appliance.size) : appliance.size == null;
    }

    @Override
    public int hashCode() {
        int result = (isPlugged ? 1 : 0);
        result = 31 * result + powerConsumed;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}
