package src;

import java.util.ArrayList;
public class University {
    String school;
    String department;

    public University(String sc, String d){
            this.school=sc;
            this.department=d;
    }

    public String getSchool() {
        return school;
    }

    public String getDepartment() {
        return department;
    }
}
