package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class College {
    String collegeName;
    ArrayList<String> departments = new ArrayList<>();
    ArrayList<Application> applications = new ArrayList<>();

    College(String collegeName){ this.collegeName = collegeName; }

    public void getApplication(Application application){ applications.add(application); }

    public void addDepartment(String... departments){
        Collections.addAll(this.departments, departments);
    }

    public void viewApplication(){
        System.out.println("----------" + collegeName + " 원서 조회----------\n");
        applications.sort(Collections.reverseOrder());
        for(Application a : applications){
            System.out.printf("이름: %s\n주민등록번호: %s\n수능 표준점수: %d\n출결 점수: %d\n가산점: %d\n총점: %d\n지원한 과: %s\n"
            , a.getName(), a.getResidentRegistrationNumber(), a.getStandardScore(), a.getAttendence(), a.getExtraPoint(), a.getTotal(), a.getDepartment_applied());
            System.out.println("--------------------------");
        }
        System.out.println();
    }

    public void setPass(){
        for(Application application : applications){
            application.setPass(application.total >= 350);
        }
    }
}