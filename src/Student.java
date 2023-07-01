package src;


public class Student {
    private String name;

    private Document document = new Document();

    private int submit = 6;

    Student(String name) {
        this.name = name;
    }

    public void writeDocument(int grade, int attendence, int plus, String wantSchool, String wantDepartment, String birth) {
        if (submit == 0) {
            return;
        }
        document.written(name, grade, attendence, plus, wantDepartment, wantSchool, birth);
    }

    Document newDocument = new Document();

    public void sendDocument(School school) {
        if (submit > 0) {
            newDocument.written(name, document.getGrade(), document.getAttendance(), document.getPlus(), document.getWantDepartment(), document.getWantSchool(), document.getBirth());
            school.getDocument(newDocument);
            System.out.println(name + "님의 원서가 " + newDocument.getWantSchool() + "에 제출되었습니다.");
            submit--;
            System.out.println();
        }else{
            System.out.println(newDocument.getWantSchool() + "에 이미 원서가 제출되었습니다.");
            System.out.println( name + "님 원서는 한 학교에 한 번만 제출할 수 있습니다.");
            System.out.println();
        }
    }

    public void checkPass() {
            System.out.println("<" + document.getWantSchool() + " 원서 접수 합격 여부>");
            if (document.getPass()) {
                System.out.println("축하드립니다! " + name + "님, " + document.getWantSchool() + "에 합격하셨습니다");
            } else {
                System.out.println(name + "님, 아쉽게도 " + document.getWantSchool() + "에 불합격하셨습니다");
            }
        }
}
