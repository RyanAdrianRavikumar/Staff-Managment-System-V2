package controller;
import model.*;

public class CDeleteStaffRecord {
    private final MDeleteStaffRecord model;

    public CDeleteStaffRecord() {
        model = new MDeleteStaffRecord();
    }

    public int deleteStaffById(int staffId) {
        return model.deleteStaffById(staffId);
    }
}
