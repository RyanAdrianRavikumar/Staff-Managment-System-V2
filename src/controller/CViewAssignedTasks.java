package controller;
import java.util.*;
import model.*;

public class CViewAssignedTasks {
    private MViewAssignedTasks taskModel;
  
    public List<MAssignedTasks> getAllTasks() {
        taskModel = new MViewAssignedTasks();
        return taskModel.getAllAssignedTasks(); //Return List of MViewAssignedTasks objects from model
    }
}

