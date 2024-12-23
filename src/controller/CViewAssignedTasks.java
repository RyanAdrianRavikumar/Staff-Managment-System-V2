package controller;

import model.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class CViewAssignedTasks {
    private final MViewAssignedTasks taskModel;

    public CViewAssignedTasks() {
        this.taskModel = new MViewAssignedTasks();
    }

    // Fetches all assigned tasks and builds a DefaultTableModel
    public DefaultTableModel getTaskTableModel() {
        List<MAssignedTasks> taskList = taskModel.getAllAssignedTasks();

        // Create a DefaultTableModel and define column headers
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Task ID");
        model.addColumn("Staff ID");
        model.addColumn("Task Description");
        model.addColumn("Task Status");

        // Populate the model with task data
        for (MAssignedTasks task : taskList) {
            model.addRow(new Object[]{
                task.getTaskId(),
                task.getStaffId(),
                task.getTaskDescription(),
                task.getTaskStatus()
            });
        }

        return model;
    }
}
