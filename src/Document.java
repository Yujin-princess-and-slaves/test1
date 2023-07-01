package src;

public class Document implements Comparable<Document>{
    private String name;

    private String birth;

    private int grade;

    private int attendance;

    private int plus;

    private String wantDepartment;

    private String wantSchool;

    private int total;

    private boolean pass;

    public void written(String name, int grade, int attendance, int plus, String wantDepartment, String wantSchool, String birth){
        this.name = name;
        this.grade = grade;
        this.attendance = attendance;
        this.plus = plus;
        this.wantSchool = wantSchool;
        this.wantDepartment = wantDepartment;
        this.birth = birth;
        this.total = grade + attendance + plus; //합불을 구하는 기준
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
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

    public boolean getPass(){
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public String getBirth(){
        return birth;
    }

    @Override
    public int compareTo(Document document){
        if(document.total<total){
            return 1;
        } else if (document.total > total){
            return -1;
        }
        return 0;
    }
}
