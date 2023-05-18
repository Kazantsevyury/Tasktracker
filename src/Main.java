import Data.Task;

public class Main {
    public static void main(String[] args) {
        AppController appController = new AppController();

        appController.createTask("Задача 1", "Описание задачи 1", "Исполнитель 1" );
        appController.createTask("Задача 2", "Описание задачи 2", "Исполнитель 2");

        Task task = appController.getTask(1);
        if (task != null) {
            System.out.println("Номер задачи: " + task.getTaskId());
            System.out.println("Название задачи: " + task.getTitle());
            System.out.println("Описание задачи: " + task.getDescription());
            System.out.println("Исполнитель задачи: " + task.getStatus());
        } else {
            System.out.println("Задача не найдена.");
        }
    }
}