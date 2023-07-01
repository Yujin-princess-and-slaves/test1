package src;
public class Main {
    public static void main(String[] args) {
        /*대학교 데이터 생성*/
        //경북대학교
        School gyeongbuk = new School("경북대학교", "삼성모바일공학과");

        //서울대학교
        School seoul = new School("서울대학교", "의예과");

        //연세대학교
        School yonsei = new School("연세대학교", "시스템반도체공학과");

        //고려대학교
        School korea = new School("고려대학교", "경영학과");

        //부산대학교
        School busan = new School("부산대학교", "수의학과");

        //건국대학교
        School konkuk = new School("건국대학교", "미디어커뮤니케이션학과");

        //중앙대학교
        School middle = new School("중앙대학교", "컴퓨터공학과");

        //성균관대학교
        School sungkyun = new School("성균관대학교", "소프트웨어학과");


        /*정홍섭과 전유진 학생의 데이터 생성*/
        Student honsub = new Student("정홍섭");
        Student yujin = new Student("전유진");

        /*학생 정홍섭의 대학교 6개의 원서작성*/
        //성적 만점: 60, 출결 만점: 30, 가산점 만점: 10
        honsub.writeDocument(60, 30, 5, "서울대학교", "의예과", "070125-3");
        honsub.sendDocument(seoul);

        honsub.writeDocument(60, 30, 5, "연세대학교", "시스템반도체공학과", "070125-3");
        honsub.sendDocument(yonsei);

        honsub.writeDocument(60, 30, 5, "고려대학교", "경영학과", "070125-3");
        honsub.sendDocument(korea);

        honsub.writeDocument(60, 30, 5, "부산대학교", "수의학과", "070125-3");
        honsub.sendDocument(busan);

        honsub.writeDocument(60, 30, 5, "경북대학교", "삼성모바일공학과", "070125-3");
        honsub.sendDocument(gyeongbuk);

        honsub.writeDocument(60, 30, 5, "성균관대학교", "소프트웨어학과 ", "070125-3");
        honsub.sendDocument(sungkyun);

        /*학생 전유진의 대학교 6개의 원서작성*/
        //성적 만점: 60, 출결 만점: 30, 가산점 만점: 10
        yujin.writeDocument(40, 30, 10, "경북대학교", "삼성모바일공학과", "070605-3");
        yujin.sendDocument(gyeongbuk);

        yujin.writeDocument(40, 30, 10, "연세대학교", "시스템반도체공학과", "070605-3");
        yujin.sendDocument(yonsei);

        yujin.writeDocument(40, 30, 10, "고려대학교", "경영학과", "070605-3");
        yujin.sendDocument(korea);

        yujin.writeDocument(40, 30, 10, "중앙대학교", "컴퓨터공학과", "070605-3");
        yujin.sendDocument(middle);

        yujin.writeDocument(40, 30, 10, "건국대학교", "미디어커뮤니케이션학과", "070605-3");
        yujin.sendDocument(konkuk);

        yujin.writeDocument(40, 30, 10, "서울대학교", "의예과", "070605-3");
        yujin.sendDocument(seoul);

        /*정홍섭의 학교 원서 재체출*/
        honsub.writeDocument(60, 30, 10 , "성균관대학교", "소프트웨어학과", "070125-3");
        honsub.sendDocument(sungkyun);

        /*원서 조회*/
        seoul.readDocuments();
        gyeongbuk.readDocuments();
        yonsei.readDocuments();
        korea.readDocuments();
        busan.readDocuments();
        konkuk.readDocuments();
        middle.readDocuments();
        sungkyun.readDocuments();


        /*합불여부*/
        seoul.passOrFail();
        gyeongbuk.passOrFail();
        yonsei.passOrFail();
        korea.passOrFail();
        busan.passOrFail();
        konkuk.passOrFail();
        middle.passOrFail();
        sungkyun.passOrFail();

        /*학생이 자신의 원서 상태 조회*/
        honsub.checkPass();
        yujin.checkPass();
    }
}