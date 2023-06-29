package src;

import java.util.ArrayList;
import java.util.Collections;

public class College {
    String collegeName;
    ArrayList<String> department = new ArrayList<>();

    College (String collegeName){
        this.collegeName = collegeName;
    }

    public void addDepartment(String... departments){
        Collections.addAll(this.department, departments);
    }
}
