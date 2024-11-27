
package controller;
import model.*;
import java.util.List;

public class CViewStaffTable {
    // Method to retrieve all staff and pass it to the view (or further processing)
    public List<MStaff> getAllStaffDetails() {
        MViewStaffTable staffModel = new MViewStaffTable();
        return staffModel.getAllStaffDetails();  // Get all staff data from the model
    }
}
