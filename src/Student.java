package src;

public class Student {
    private String name;

    private Document document = new Document();

    private int submit = 6;

    Student(String name){
        this.name = name;
    }

    public void writeDocument(int grade, int attendence, int plus, String wantSchool, String wantDepartment){
        if(submit==0){
            return;
        }
        document.written(name, grade, attendence, plus,wantDepartment, wantSchool);
    }

    public void sendDocument(School school){
        if(submit>0){
            school.getDocument(document);
            System.out.println(name + "님의 원서가 " + document.getWantSchool() + "에 제출 되었습니다.");
            submit--;
        }
        else{
            System.out.println("이미 원서가 제출된 상태입니다.");
            System.out.println(name + "원서는 한번만 제출이 가능합니다.");
            System.out.println();
        }
    }
}
