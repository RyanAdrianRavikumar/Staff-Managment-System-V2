package controller;
import javax.swing.JOptionPane;
import model.*;

public class CRegisterStaff {
    public void staffRegistration(String firstName, String LastName, String Address, String phone, String jobPosition, double monthlySalary, String username, String password){
        MRegisterStaff register_staff = new MRegisterStaff();
        int rowCount = register_staff.staffRegistration(firstName, LastName, Address, phone, jobPosition, monthlySalary, username, password);  
        
        if(rowCount > 0){
            JOptionPane.showMessageDialog(null, "Number of Records Inserted: " + rowCount, "Records Added", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}

