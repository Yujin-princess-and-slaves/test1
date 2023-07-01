package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<student>();
        students.add(new student("김땡땡", 70, 100, 10, "070311-3"));

        ArrayList<University> universities = new ArrayList<University>();
        universities.add(new University("원대학교", "컴퓨터공학과"));
        universities.add(new University("원대학교", "컴퓨터과학과"));
        universities.add(new University("네모대학교", "컴퓨터공학과"));
        universities.add(new University("네모대학교", "컴퓨터과학과"));
        universities.add(new University("세모대학교", "사회복지학과"));
        universities.add(new University("세모대학교", "컴퓨터과학과"));

        ArrayList<student> students2 = new ArrayList<student>();
        students2.add(new student("이땡땡", 100, 80, 10, "070511-2"));

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
                    if (uni.getDepartment().equals(uni2.getDepartment())) {
                        System.out.println(String.format(("지원대학:%s\n지원학과:%s\n"), uni.school, uni.department));
                        for(student st : students) {
                            for(student st2 : students2) {
                                if(st.getScore()>st2.getScore()){
                                    System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n"), st.name,st.score,st.check,st.point,st.number));
                                    System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n"), st2.name,st2.score,st2.check,st2.point,st2.number));
                                    System.out.println();
                                }
                                else{
                                    System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n"), st2.name,st2.score,st2.check,st2.point,st2.number));
                                    System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n"), st.name,st.score,st.check,st.point,st.number));
                                    System.out.println();
                                }
                            }
                        }
                    }
                    else if (uni.getDepartment()!=(uni2.getDepartment())) {
                        boolean foundInUni2 = false;

                        for (University univ2 : universities2) {
                            if (univ2.getDepartment().equals(uni.getDepartment())) {
                                foundInUni2 = true;
                                break;
                            }
                        }

                        if (!foundInUni2) {
                            System.out.println(String.format(("지원대학:%s\n지원학과:%s\n"), uni.school, uni.department));

                            for (student stu : students) {
                                System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n"), stu.getName(), stu.getScore(), stu.getCheck(), stu.getPoint(), stu.getNumber()));
                            }
                        }
                        else{
                            System.out.println(String.format(("지원대학:%s\n지원학과:%s\n"), uni2.school, uni2.department));

                            for (student stu2 : students2) {
                                System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n"), stu2.getName(), stu2.getScore(), stu2.getCheck(), stu2.getPoint(), stu2.getNumber()));
                            }
                        }
                    }
                }
            }
        }
    }
}