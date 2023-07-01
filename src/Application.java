package src;

public class Application implements Comparable<Application>{
    String name, residentRegistrationNumber, department_applied;
    int standardScore, attendence, extraPoint, total;
    boolean pass;

    public void saveApplication(String name, String residentRegistrationNumber, int standardScore, int attendence, int extraPoint, College college, String department_applied){
        this.name = name;
        this.residentRegistrationNumber = residentRegistrationNumber;
        this.standardScore = standardScore;
        this.attendence = attendence;
        this.extraPoint = extraPoint;
        this.department_applied = department_applied;
        this.total = standardScore + attendence + extraPoint;
    }

    public String getName() {
        return name;
    }

    public String getResidentRegistrationNumber() {
        return residentRegistrationNumber;
    }

    public String getDepartment_applied() {
        return department_applied;
    }

    public int getStandardScore() {
        return standardScore;
    }

    public int getAttendence() {
        return attendence;
    }

    public int getExtraPoint() {
        return extraPoint;
    }

    public int getTotal() {
        return total;
    }

    public void setPass(boolean pass) { this.pass = pass; }

    public boolean isPass() { return pass; }

    @Override
    public int compareTo(Application o) {
        if(o.total < total) return 1;
        else if (o.total > total) return -1;
        return 0;
    }
}
