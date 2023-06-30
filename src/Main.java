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

    }
}