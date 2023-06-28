package src;

import java.util.Scanner;

import static src.Student.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        score = sc.nextInt();
        check = sc.nextInt();
        Student.point = sc.nextInt();

        Student student = new Student(); // Student 객체 생성
        student.studentResult(name, score, check, point); // result 메서드 호출
    }
}
