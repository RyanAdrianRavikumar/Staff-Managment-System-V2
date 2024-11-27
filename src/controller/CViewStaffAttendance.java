package controller;
import java.util.*;
import model.*;

public class CViewStaffAttendance {
    
    private MViewStaffAttendance viewAttendance;
    
    public List<MStaffAttendance> fetchAttendanceData(){
        
        viewAttendance = new MViewStaffAttendance();
        return viewAttendance.getAttendanceDetails(); //Return List of MStaffAttendance objects from model
    }
}
