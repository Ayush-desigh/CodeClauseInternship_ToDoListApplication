

import java.util.*;




class Task {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return taskName;
    }
}
public class toDoListApplication {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- To-Do List Application ---");
            System.out.println("1. Add New Task");
            System.out.println("2. Display All Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Remove Task");
          
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
          

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String newTask = sc.nextLine();
                    tasks.add(new Task(newTask));
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\n--- Your Tasks ---");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                    case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to update.");
                    } else {
                        System.out.println("\n--- Your Tasks ---");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter the task number to update: ");
                        int taskNumber = sc.nextInt();
                        sc.nextLine(); 

                        if (taskNumber < 1 || taskNumber > tasks.size()) {
                            System.out.println("Invalid task number.");
                        } else {
                            System.out.print("Enter the new task: ");
                            String updatedTask = sc.nextLine();
                            tasks.get(taskNumber - 1).setTaskName(updatedTask);
                            System.out.println("Task updated successfully!");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to delete.");
                    } else {
                        System.out.println("\n--- Your Tasks ---");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter the task number to delete: ");
                        int taskNumber = sc.nextInt();
                        sc.nextLine(); 

                        if (taskNumber < 1 || taskNumber > tasks.size()) {
                            System.out.println("Invalid task number.");
                        } else {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task deleted successfully!");
                        }
                    }
                    break;

                

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
