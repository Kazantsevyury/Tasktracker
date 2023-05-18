package Data;
public class Task {
    private int taskId;
    private String title;
    private String description;
    private String status;

    public Task(int taskId, String title, String description, String status) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}

