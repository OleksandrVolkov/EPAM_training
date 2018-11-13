package task_3.task_3_3.model;

public class Season extends Enum {
    public final static Season WINTER = new Season("Winter");
    public final static Season SUMMER = new Season("Summer");
    public final static Season SPRING = new Season("Spring");
    public final static Season AUTUMN = new Season("Autumn");


    Season(String name){
        super(name);
    }


    public static Enum valueOf(String str){
      return Enum.valueOf(str, new Season[]{WINTER, SUMMER, SPRING, AUTUMN});
    }

    public static final Season[] values(){
        return new Season[]{WINTER, SUMMER, SPRING, AUTUMN};
    }

    @Override
    public String toString() {
        return super.getName();
    }


}
