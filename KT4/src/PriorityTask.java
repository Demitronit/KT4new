import java.io.IOException;
import java.util.Scanner;

public class PriorityTask extends Task implements Comparable<PriorityTask> {
    private String priority;

    public PriorityTask(String name, String description) throws IOException {
        super(name, description);
        this.setPriority();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority() throws IOException {
        System.out.printf("""
                Выберите приоритет задачи %s:
                1. Высокий
                2. Средний
                3. Низкий
                """, this.getName());
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        switch (input) {
            case "1":
                this.priority = Priority.HIGH.toString();
                System.out.printf("Задаче %s присвоен приоритет: Высокий \n", this.getName());
                break;
            case "2":
                this.priority = Priority.MEDIUM.toString();
                System.out.printf("Задаче %s присвоен приоритет: Средний \n", this.getName());
                break;
            case "3":
                this.priority = Priority.LOW.toString();
                System.out.printf("Задаче %s присвоен приоритет: Низкий \n", this.getName());
                break;
        }
    }

    @Override
    public int compareTo(PriorityTask t) {
        return priority.compareTo(t.getPriority());
    }
}
