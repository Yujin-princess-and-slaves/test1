package src;

public class Main {
    public static void main(String[] args) {
        University university = new University("서울 대학교", "컴퓨터 공학");
        University university2 = new University("고려 대학교", "철학");
        University university3 = new University("연세 대학교", "컴퓨터 과학");

        Student student1 = new Student("동현", 85, true,5, "컴퓨터 공학", "서울 대학교", "070228-3");
        Student student2 = new Student("아무개", 78, true, 2, "철학", "고려 대학교", "321231-1");
        Student student3 = new Student("이무개", 92, true, 8, "컴퓨터 과학", "연세 대학교", "123421-5");
        Student student4 = new Student("재현", 95, true, 5, "컴퓨터 공학", "서울 대학교", "123321-4");
        Student student5 = new Student("유진", 95, true, 5, "컴퓨터 공학", "서울 대학교", "222222-2");

        university.submitApplication(student1);
        university.submitApplication(student4);
        university.submitApplication(student5);
        university2.submitApplication(student2);
        university3.submitApplication(student3);

        university.displayApplications();
        university2.displayApplications();
        university3.displayApplications();

        university.reviewApplications();
        university2.reviewApplications();
        university3.reviewApplications();
    }
}