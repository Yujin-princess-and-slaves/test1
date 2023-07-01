package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<student>();
        students.add(new student("김땡땡", 100, 100, 10, "070311-3"));

        ArrayList<University> universities = new ArrayList<University>();
        universities.add(new University("원대학교", "컴퓨터공학과"));
        universities.add(new University("원대학교", "컴퓨터과학과"));
        universities.add(new University("네모대학교", "컴퓨터공학과"));
        universities.add(new University("네모대학교", "컴퓨터과학과"));
        universities.add(new University("세모대학교", "사회복지학과"));
        universities.add(new University("세모대학교", "컴퓨터과학과"));

        ArrayList<student> students2 = new ArrayList<student>();
        students2.add(new student("이땡땡", 90, 80, 10, "070511-2"));

        ArrayList<University> universities2 = new ArrayList<University>();
        universities2.add(new University("원대학교", "경영학과"));
        universities2.add(new University("원대학교", "컴퓨터과학과"));
        universities2.add(new University("네모대학교", "컴퓨터공학과"));
        universities2.add(new University("네모대학교", "교육학과"));
        universities2.add(new University("세모대학교", "사회복지학과"));
        universities2.add(new University("세모대학교", "건축학과"));

        for (University uni : universities) {
            for (University uni2 : universities2) {
                if (uni.getSchool().equals(uni2.getSchool())) {
                    System.out.println(String.format(("지원대학:%s\n지원학과:%s\n"), uni.school, uni.department));
                    System.out.println(String.format(("지원대학:%s\n지원학과:%s\n"), uni2.school, uni2.department));
                    System.out.println();
                }
            }
        }
    }
}