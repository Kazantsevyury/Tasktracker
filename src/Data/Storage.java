package Data;
import java.util.HashMap;

public class Storage {
    private HashMap<Integer, Task> tasks;
    private HashMap<Integer, SubTask> subTask;
    private HashMap<Integer, Epic> epic;

    private int nextTaskId;

    public Storage() {
        tasks = new HashMap<>();
        nextTaskId = 1;
    }

    public void addTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    public Task getTask(int taskId) {
        return tasks.get(taskId);
    }
}
