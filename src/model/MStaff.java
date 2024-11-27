
package model;

public class MStaff {
    private int staffId;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String jobPosition;
    private int monthlySalary;
    private String username;
    private String password;

    // Constructor, getters and setters
    public MStaff(int staffId, String firstName, String lastName, String address, String phone, String jobPosition, int monthlySalary, String username, String password) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.jobPosition = jobPosition;
        this.monthlySalary = monthlySalary;
        this.username = username;
        this.password = password;
    }
    
    public int getStaffId() {
        return staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
