
package controller;
import model.*;
import java.util.List;

public class CViewStaffTable {
    
    private MViewStaffTable staffModel;

    public List<MStaff> getAllStaffDetails() {
        staffModel = new MViewStaffTable();
        return staffModel.getAllStaffDetails();  //Return List of MViewStaffTable objects from model
    }
}
