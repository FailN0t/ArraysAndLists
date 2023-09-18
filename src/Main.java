import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> taskArrayList = new ArrayList<>() {{
            add(new Task("Купить молока", "5 пакетов"));
            add(new Task("Покормить кота", "новым кормом"));
            add(new Task("Сжечь секретное", "Особенно из синей сумки"));
        }};
        for (int i = 0; i < taskArrayList.size(); i++) {
            System.out.println(taskArrayList.get(i));
        }
        System.out.println();
        taskArrayList.add(0,new Task( "Очень срочная задача", ""));

        for (int i = 0; i < taskArrayList.size(); i++) {
            System.out.println(taskArrayList.get(i));
        }
        System.out.println();

        taskArrayList.remove(1);
        for (int i = 0; i < taskArrayList.size(); i++) {
            System.out.println(taskArrayList.get(i));
        }
        System.out.println();

        taskArrayList.set(1, new Task("Покормить лошадь","Тоже новым кормом"));
        for (int i = 0; i < taskArrayList.size(); i++) {
            System.out.println(taskArrayList.get(i));
        }
        System.out.println();

    }
}
