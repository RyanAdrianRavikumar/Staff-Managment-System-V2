package controller;
import model.*;

public class CAddAssignedTask {
     private MAddAssignedTask mAssignedTask;

    public CAddAssignedTask() {
        mAssignedTask = new MAddAssignedTask();
    }

    public int assignTaskToStaff(int staffId, String taskDescription) {
        return mAssignedTask.assignTask(staffId, taskDescription);
    }
}
