import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        TaskManager taskManager = new TaskManager();
        taskManager.add(new PriorityTask("Сдать проект", "Скоро дедлайн"));
        taskManager.add(new PriorityTask("Сделать кт по Java", "Хочу 90 баллов"));
        taskManager.add(new PriorityTask("Сделать кт со складом", "Сложно..."));
        taskManager.changeStatus("Сдать проект");
        taskManager.delete("Сдать проект");
        Serializer serializer = new Serializer();
        serializer.tasksToDat(taskManager);
        taskManager = serializer.readTasksDat(taskManager);
        taskManager.delete("Сдать проект");
    }
}