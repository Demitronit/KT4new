import java.io.Serializable;

public class ImmutableTask implements Serializable {
    private final String name;
    private final String description;
    private final String status = TaskStatus.UNFINISHED.toString();

    public ImmutableTask(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
