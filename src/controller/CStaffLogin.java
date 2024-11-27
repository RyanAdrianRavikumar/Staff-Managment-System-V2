package controller;
import model.*;
import view.*;

public class CStaffLogin {
    private VStaffLogin loginView; 
    private MStaffLogin loginModel; 

    public CStaffLogin(VStaffLogin loginView, MStaffLogin loginModel){
        this.loginView = loginView;
        this.loginModel = loginModel;
    }

    public boolean handleLogin(String username, String password, String jobPosition) {
        //Use the model to verify credentials
        boolean isValid = loginModel.verifyCredentials(username, password, jobPosition);
        //Receive boolean return value from model
        return isValid;
    }
}
