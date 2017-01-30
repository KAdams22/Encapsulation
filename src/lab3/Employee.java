package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    
    public final String COMPANY_NAME = "Acme";
    
    private String firstName;
    private String lastName;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty())
        this.lastName = lastName;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }
    
    
    
    
    
    
    
}


    