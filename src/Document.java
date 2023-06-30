package src;

public class Document {
    private String name;

    private int grade;

    private int attendance;

    private int plus;

    private String wantDepartment;

    private String wantSchool;

    private int total;

    private boolean pass;

    public void written(String name, int grade, int attendance, int plus, String wantDepartment, String wantSchool){
        this.name = name;
        this.grade = grade;
        this.attendance = attendance;
        this.plus = plus;
        this.wantSchool = wantSchool;
        this.wantDepartment = wantDepartment;
        this.total = grade + attendance + plus;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return grade;
    }

    public int getAttendance(){
        return attendance;
    }

    public int getPlus(){
        return plus;
    }

    public String getWantSchool(){
        return wantSchool;
    }

    public String getWantDepartment(){
        return wantDepartment;
    }
}
