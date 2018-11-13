package task_3.task_3_3.model;

public class Enum<T extends Object> {
    public Enum(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Enum(String name){
        this.name = name;
    }

    protected static Enum valueOf(String string, Enum[] enums) {
        int counter = 0;
        for (Enum e : enums){
            if (string.equalsIgnoreCase(e.getClass().getFields()[counter].getName()))
                return e;
                counter++;
        }
        return null;
    }

}
