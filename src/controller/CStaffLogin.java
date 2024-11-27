package controller;
import model.*;
import view.*;

public class CStaffLogin {
    private VStaffLogin loginView; // View reference
    private MStaffLogin loginModel; // Model reference

    public CStaffLogin(VStaffLogin loginView, MStaffLogin loginModel){
        this.loginView = loginView;
        this.loginModel = loginModel;
    }

    public boolean handleLogin(String username, String password, String jobPosition) {
        // Use the model to verify credentials
        boolean isValid = loginModel.verifyCredentials(username, password, jobPosition);
        return isValid;
    }
}
