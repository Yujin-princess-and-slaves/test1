package src;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Student jaehyeon = new Student();
        Student yujin = new Student();
        Student hongsub = new Student();

        College snu = new College("서울대학교");
        snu.addDepartment("컴퓨터공학과", "의예과", "건축학과");

        College yonsei = new College("연세대학교");
        yonsei.addDepartment("신소재공학과", "시스템반도체공학과", "경영학과");

        College korea = new College("고려대학교");
        korea.addDepartment("국어국문학과", "화학과", "기계공학과");

        System.out.println("서울대학교: " + snu.department);
        System.out.println("연세대학교: " + yonsei.department);
        System.out.println("고려대학교: " + korea.department);

        korea.addDepartment("간호학과");
        System.out.println("고려대학교: " + korea.department.get(3));
    }
}
