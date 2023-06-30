package src;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    private String name;

    private ArrayList<Document> documents = new ArrayList<Document>();

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
        for(Document document:documents){
            System.out.printf("이름: %s\n성적: %d\n출결점수: %d\n가산점: %d\n대학교:%s\n희망학과: %s\n",
                    document.getName(), document.getScore(), document.getAttendance(), document.getPlus(),
                    document.getWantSchool(), document.getWantDepartment());
        }
        System.out.println("========================");
        System.out.println("<대학교 원서 접수 합격 여부>");
    }
}
