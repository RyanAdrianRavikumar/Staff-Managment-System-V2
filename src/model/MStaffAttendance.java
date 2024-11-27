package model;

public class MStaffAttendance {
    private int attendanceId;
    private String staffName;
    private String checkinTime;
    private String checkoutTime;
    private int totalHoursWorked;
    private int overtimeHours;
    private String date;

    // Constructor
    public MStaffAttendance(int attendanceId, String staffName, String checkinTime, String checkoutTime, int totalHoursWorked, int overtimeHours, String date) {
        this.attendanceId = attendanceId;
        this.staffName = staffName;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.totalHoursWorked = totalHoursWorked;
        this.overtimeHours = overtimeHours;
        this.date = date;
    }

    // Getters
    public int getAttendanceId(){ 
        return attendanceId;
    }
    
    public String getStaffName(){ 
        return staffName; 
    }
    
    public String getCheckinTime(){ 
        return checkinTime; 
    }
    
    public String getCheckoutTime(){ 
        return checkoutTime; 
    }
    public int getTotalHoursWorked(){ 
        return totalHoursWorked; 
    }
    public int getOvertimeHours(){ 
        return overtimeHours; 
    }
    public String getDate(){ 
        return date; 
    }
}
