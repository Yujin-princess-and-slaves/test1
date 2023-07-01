package src;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Student jaehyeon = new Student("배재현", "070106-3", 420, 20, 5);
        Student yujin = new Student("전유진", "070605-4", 365, 20, 1);
        Student hongsub = new Student("정홍섭", "070125-4", 100, 15, 0);

        College snu = new College("서울대학교");
        snu.addDepartment("컴퓨터공학과", "의예과", "건축학과");

        College yonsei = new College("연세대학교");
        yonsei.addDepartment("신소재공학과", "시스템반도체공학과", "경영학과");

        College korea = new College("고려대학교");
        korea.addDepartment("국어국문학과", "화학과", "기계공학과");

        jaehyeon.writeApplication(snu, "컴퓨터공학과");
        jaehyeon.writeApplication(snu, "의예과");
        jaehyeon.writeApplication(snu, "건축학과");
        jaehyeon.writeApplication(yonsei, "신소재공학과");
        jaehyeon.writeApplication(yonsei, "시스템반도체공학과");
        jaehyeon.writeApplication(yonsei, "경영학과");
        jaehyeon.writeApplication(korea, "기계공학과");

        yujin.writeApplication(snu, "컴퓨터공학과");
        yujin.writeApplication(snu, "의예과");
        yujin.writeApplication(snu, "건축학과");
        yujin.writeApplication(yonsei, "신소재공학과");
        yujin.writeApplication(yonsei, "시스템반도체공학과");
        yujin.writeApplication(yonsei, "경영학과");
        yujin.writeApplication(korea, "기계공학과");

//        hongsub.writeApplication(yonsei, "시스템반도체공학과");
//        yujin.writeApplication(snu, "컴퓨터공학과");
//        jaehyeon.writeApplication(snu, "의예과");

        snu.viewApplication();
        yonsei.viewApplication();
        korea.viewApplication();

//        jaehyeon.checkPass();
    }
}
