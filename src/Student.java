package src;

public class Student {
    String name, residentRegistrationNumber;
    int standardScore, attendence, extraPoint, chance = 6;

    public Student(String name, String residentRegistrationNumber, int standardScore, int attendence, int extraPoint) {
        this.name = name;
        this.residentRegistrationNumber = residentRegistrationNumber;
        this.standardScore = standardScore;
        this.attendence = attendence;
        this.extraPoint = extraPoint;
    }

    public void writeApplication(College college, String department_applied){
        if(this.chance > 0) {
/*            if(department_applied.contains((CharSequence) college.departments))*/
            Application application = new Application();
            application.saveApplication(name, residentRegistrationNumber, standardScore, attendence, extraPoint, college, department_applied);
            college.getApplication(application);
            System.out.println(name + "님, 원서가 성공적으로 접수되었습니다.");
            chance--;
        }
        else {
            System.out.println(name + "님, 원서 제출한도를 초과하였습니다. 원서는 최대 6개까지 제출할 수 있습니다.");
        }
    }
}
