package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<student> students = new ArrayList<student>();
        students.add(new student("김땡땡",100,100,10,"070311-3"));
        students.add(new student("이땡떙",90,90,5,"070312-1"));

        for(student item:students){
            System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n"),item.name,item.score,item.check,item.point,item.number));
        }
        System.out.println();

        ArrayList<University> universities = new ArrayList<University>();
        universities.add(new University("원대학교","컴퓨터공학과"));
        universities.add(new University("원대학교","컴퓨터과학과"));
        universities.add(new University("네모대학교","컴퓨터공학과"));
        universities.add(new University("네모대학교","컴퓨터과학과"));
        universities.add(new University("세모대학교","사회복지학과"));
        universities.add(new University("세모대학교","컴퓨터과학과"));

        for(student st:students) {
            for (University u : universities){
                System.out.println(String.format(("이름:%s\n성적:%d\n출결:%d\n가산점:%d\n주민등록번호:%s\n지원대학:%s\n지원학과:%s\n"),st.name,st.score,st.check,st.point,st.number,u.school, u.department));
                System.out.println(String.format(("지원대학:%s\n지원학과:%s\n"), u.school, u.department));
            }
        }
        System.out.println();
    }
}