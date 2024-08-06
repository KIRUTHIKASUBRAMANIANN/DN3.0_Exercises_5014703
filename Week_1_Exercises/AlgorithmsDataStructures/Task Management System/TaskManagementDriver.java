package com.taskmanagement;

public class TaskManagementDriver {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task("T001", "Design Database", "In Progress"));
        taskList.addTask(new Task("T002", "Develop API", "Not Started"));
        taskList.addTask(new Task("T003", "Write Documentation", "Completed"));
        taskList.addTask(new Task("T004", "Test Application", "In Progress"));
        taskList.addTask(new Task("T005", "Deploy to Production", "Not Started"));

        // Traverse tasks
        System.out.println("Tasks in the system:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for task T003:");
        Task task = taskList.searchTask("T003");
        if (task != null) {
            System.out.println("Task found: " + task);
        } else {
            System.out.println("Task not found");
        }

        // Delete a task
        System.out.println("\nDeleting task T002:");
        boolean deleted = taskList.deleteTask("T002");
        if (deleted) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }

        // Traverse tasks after deletion
        System.out.println("\nTasks in the system after deletion:");
        taskList.traverseTasks();
    }
}
