package src;

import java.util.ArrayList;
import java.util.Collections;


public class School {

    private String name;

    private String departmentName;
    private ArrayList<Document> documents = new ArrayList<Document>();


    School(String name, String departmentName){
        this.name = name;
        this.departmentName = departmentName;
    }

    public void getDocument(Document document){
        documents.add(document);
    }

    public void readDocuments() {
        System.out.println("<" + name + " 원서 접수 현황>");
        System.out.println("========================");
        Collections.sort(documents, Collections.reverseOrder());
        for (Document document : documents) {
            System.out.printf("이름: %s\n성적: %d\n출결점수: %d\n가산점: %d\n희망학과: %s\n\n",
                    document.getName(), document.getGrade(), document.getAttendance(), document.getPlus(),
                    document.getWantDepartment());
        }
        System.out.println("========================");
    }

    public void passOrFail() {
        for (Document document : documents) {
            //합격기준: score + attendance + pluse >= 90    -> 합격
            if (document.getGrade() + document.getAttendance() + document.getPlus() >= 90) {
                document.setPass(true);
            }
        }
    }
}
