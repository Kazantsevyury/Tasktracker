import Data.Storage;
import Data.Task;

import java.util.Scanner;

public class AppController {
    private Storage storage;
    private int nextTaskId;

    public AppController() {
        storage = new Storage();
        nextTaskId = 1;
    }

    public void createTask(String title, String description, String assignee) {
        Task task = new Task(nextTaskId, title, description, assignee);
        storage.addTask(task);
        System.out.println("Задача создана и добавлена в хранилище.");
        nextTaskId++;
    }

    public Task getTask(int taskId) {
        return storage.getTask(taskId);
    }
}
