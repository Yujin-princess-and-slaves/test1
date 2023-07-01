package src;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    private String name;
    private ArrayList<Document> documents = new ArrayList<>();

    School(String name){
        this.name = name;
    }

    public void getDocument(Document document){
        documents.add(document);
    }

    public void readDocuments(){
        System.out.println("<대학교 원서 접수 현황>");
        System.out.println("========================");
        Collections.sort(documents, Collections.reverseOrder());
        for(Document document : documents){
            System.out.printf("이름: %s\n성적: %d\n출결점수: %d\n가산점: %d\n대학교: %s\n희망학과: %s\n",
                    document.getName(), document.getScore(), document.getAttendance(), document.getPlus(),
                    document.getWantSchool(), document.getWantDepartment());
            System.out.println();
        }
        System.out.println("========================");
        System.out.println("<대학교 원서 접수 합격 여부>");
    }

    public void passFail() {
        for (Document document : documents) {
            int total = document.getScore() + document.getAttendance() + document.getPlus();
            String wantSchool = document.getWantSchool();

            // 서울대학교의 합격 기준: total이 490 이상
            if (wantSchool.equals("서울대학교")) {
                if (total >= 490) {
                    document.setPass(true);
                } else {
                    document.setPass(false);
                }
            }
            // 고려대학교와 연세대학교의 합격 기준: total이 450 이상
            else if (wantSchool.equals("고려대학교") || wantSchool.equals("연세대학교")) {
                if (total >= 450) {
                    document.setPass(true);
                } else {
                    document.setPass(false);
                }
            }
            // 건국대학교와 중앙대학교의 합격 기준: total이 400 이상
            else if (wantSchool.equals("건국대학교") || wantSchool.equals("중앙대학교")) {
                if (total >= 400) {
                    document.setPass(true);
                } else {
                    document.setPass(false);
                }
            }
            // 성균관대학교의 합격 기준: total이 420 이상
            else if (wantSchool.equals("성균관대학교")) {
                if (total >= 420) {
                    document.setPass(true);
                } else {
                    document.setPass(false);
                }
            }
            // 경북대학교와 부산대학교의 합격 기준: total이 380 이상
            else if (wantSchool.equals("경북대학교") || wantSchool.equals("부산대학교")) {
                if (total >= 380) {
                    document.setPass(true);
                } else {
                    document.setPass(false);
                }
            }
        }
    }
}
