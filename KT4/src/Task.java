import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable {
    private String name;
    private String description;
    private String status = TaskStatus.UNFINISHED.toString();

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void changeStatus() {
        if (Objects.equals(this.status, "UNFINISHED")) {
            this.status = TaskStatus.FINISHED.toString();
            System.out.printf("Задаче %s присвоен статус: Завершена \n", this.getName());
        } else {
            this.status = TaskStatus.UNFINISHED.toString();
            System.out.printf("Задаче %s присвоен статус: Не завершена \n", this.getName());
        }
    }
}
