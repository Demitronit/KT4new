import java.io.*;

public class Serializer {
    public Serializer() {
        File dir = new File(".\\data");
        if (!dir.exists()) {
            dir.mkdir();
        }

    }

    public void tasksToDat(TaskManager taskList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(".\\data\\tasks.dat"))) {
            oos.writeObject(taskList);
            System.out.println("Файл успешно записан.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public TaskManager readTasksDat(TaskManager taskList) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\data\\tasks.dat"))) {
            taskList = (TaskManager) ois.readObject();
            System.out.println("Файл успешно считан.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return taskList;
    }
}
