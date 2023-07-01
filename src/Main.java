package src;
public class Main {
    public static void main(String[] args) {
        /*대학교 데이터 생성*/
        School gyeongbuk = new School("경북대학교");
        School seoul = new School("서울대학교");
        School yonsei = new School("연세대학교");
        School korea = new School("고려대학교");
        School busan = new School("부산대학교");
        School konkuk = new School("건국대학교");
        School middle = new School("중앙대학교");
        School sungkyun = new School("성균관대학교");

        /*정홍섭과 전유진 학생의 데이터 생성*/
        Student honsub = new Student("정홍섭");
        Student yujin = new Student("전유진");

        /*학생 정홍섭의 대학교 6개의 원서작성*/
        honsub.writeDocument(250, 30, 20, "서울대학교", "");
        honsub.sendDocument(seoul);

        honsub.writeDocument(250, 30, 20, "연세대학교", "");
        honsub.sendDocument(yonsei);

        honsub.writeDocument(250, 30, 20, "고려대학교", "");
        honsub.sendDocument(korea);

        honsub.writeDocument(250, 30, 20, "부산대학교", "");
        honsub.sendDocument(busan);

        honsub.writeDocument(250, 30, 20, "경북대학교", "");
        honsub.sendDocument(gyeongbuk);

        honsub.writeDocument(250, 30, 20, "성균관대학교", "");
        honsub.sendDocument(sungkyun);

        /*학생 전유진의 대학교 6개의 원서작성*/
        yujin.writeDocument(350, 30, 15, "경북대학교", "");
        yujin.sendDocument(gyeongbuk);

        yujin.writeDocument(350, 30, 15, "연세대학교", "");
        yujin.sendDocument(yonsei);

        yujin.writeDocument(350, 30, 15, "고려대학교", "");
        yujin.sendDocument(korea);

        yujin.writeDocument(350, 30, 15, "중앙대학교", "");
        yujin.sendDocument(middle);

        yujin.writeDocument(350, 30, 15, "건국대학교", "");
        yujin.sendDocument(konkuk);

        yujin.writeDocument(350, 30, 15, "서울대학교", "");
        yujin.sendDocument(seoul);

        /*정홍섭의 학교 원서 재체출*/
        honsub.writeDocument(450, 30, 20, "서울대학교", "");
        honsub.sendDocument(seoul);

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
        seoul.passFail();
        gyeongbuk.passFail();
        yonsei.passFail();
        korea.passFail();
        busan.passFail();
        konkuk.passFail();
        middle.passFail();
        sungkyun.passFail();


    }
}