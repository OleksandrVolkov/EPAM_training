package task_7.tasks_7_345;

@FunctionalInterface
public interface ConvertString {
    String convert(String str);

    default boolean isNull(String string){
        return string == null || string.trim().equals("");
    }
}
