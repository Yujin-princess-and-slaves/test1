package src;

public class Student {
    private String name;

    private Document document = new Document();

    private int submit = 6;

    Student(String name) {
        this.name = name;
    }

    public void writeDocument(int grade, int attendence, int plus, String wantSchool, String wantDepartment) {
        if (submit == 0) {
            return;
        }
        document.written(name, grade, attendence, plus, wantDepartment, wantSchool);
    }

    Document newDocument = new Document();

    public void sendDocument(School school) {
        if (submit > 0) {
            Document newDocument = new Document();
            newDocument.written(name, document.getScore(), document.getAttendance(), document.getPlus(), document.getWantDepartment(), document.getWantSchool());
            school.getDocument(newDocument);
            System.out.println(name + "님의 원서가 " + newDocument.getWantSchool() + "의 " + newDocument.getWantDepartment() + "에 제출되었습니다.");
            submit--;
            System.out.println();
        }
    }

        public void checkingPass() {
            if (document.getPass()) {
                System.out.println(name + "님" + document.getWantSchool() + "에 합격하셨습니다");
            } else {
                System.out.println(name + "님 아쉽게도" + document.getWantSchool() + "에 불합격하셨습니다");
            }
        }
}
