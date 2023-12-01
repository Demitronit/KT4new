import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskManager implements Serializable {
    private List<PriorityTask> taskList = new ArrayList<PriorityTask>();

    public void add(PriorityTask newTask) {
        taskList.add(newTask);
    }

    public void delete(String name) {
        taskList.removeIf(t -> Objects.equals(t.getName(), name));
        System.out.println("Задача успешно удалена.");
    }

    public void changeStatus(String name) {
        for (PriorityTask t : taskList) {
            if (Objects.equals(t.getName(), name)) t.changeStatus();
        }
    }
}
