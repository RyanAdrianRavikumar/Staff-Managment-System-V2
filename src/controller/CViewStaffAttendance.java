package controller;
import java.util.*;
import model.*;

public class CViewStaffAttendance {
    public List<MStaffAttendance> fetchAttendanceData(){
        MViewStaffAttendance viewAttendance = new MViewStaffAttendance();
        return viewAttendance.getAttendanceDetails();
    }
}
