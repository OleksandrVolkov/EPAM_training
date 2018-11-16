package task_7.task_7_1;

import java.lang.reflect.Field;

public class Runner {
    public void run() throws NoSuchFieldException, IllegalAccessException {

//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter string:");
//      String string = sc.nextLine();

        String string = "Hello";
        System.out.println(string);
        Class<?> clazz = string.getClass();
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        field.set(string, "New string".toCharArray());
        System.out.println("new->" + string);
        System.out.println("Hello".equals("New string"));
    }
}
