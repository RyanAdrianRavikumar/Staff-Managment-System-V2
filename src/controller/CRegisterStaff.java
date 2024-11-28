package controller;
import javax.swing.JOptionPane;
import model.*;

public class CRegisterStaff {
    public int staffRegistration(String firstName, String LastName, String Address, String phone, String jobPosition, double monthlySalary, String username, String password){
        MRegisterStaff register_staff = new MRegisterStaff();
        int rowCount = register_staff.staffRegistration(firstName, LastName, Address, phone, jobPosition, monthlySalary, username, password);  
        
        return rowCount;
        
    }
}

