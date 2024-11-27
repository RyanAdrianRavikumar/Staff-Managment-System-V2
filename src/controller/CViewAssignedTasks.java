package controller;
import java.util.*;
import model.*;

public class CViewAssignedTasks {
    private final MViewAssignedTasks taskModel;

    public CViewAssignedTasks(){
        taskModel = new MViewAssignedTasks();
    }
        
    public List<MAssignedTasks> getAllTasks() {
        return taskModel.getAllAssignedTasks();
    }
}

