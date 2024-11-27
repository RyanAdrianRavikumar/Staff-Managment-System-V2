package model;

public class MAssignedTasks{
     private int taskId;
    private int staffId;
    private String taskDescription;
    private String taskStatus;

    // Constructor
    public MAssignedTasks(int taskId, int staffId, String taskDescription, String taskStatus) {
        this.taskId = taskId;
        this.staffId = staffId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    // Getters and Setters
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
