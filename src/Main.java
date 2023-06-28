package src;

import java.util.Scanner;

import static src.Student.*;
import static src.University.department;
import static src.University.universityName;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        universityName = sc.next();
        University.department = sc.next();
        name = sc.next();
        score = sc.nextInt();
        check = sc.nextInt();
        Student.point = sc.nextInt();

        University university = new University(); // university 객체 생성
        university.universityResult(universityName, department); // universityResult 메서드 호출
        Student student = new Student(); // Student 객체 생성
        student.studentResult(name, score, check, point); // studentResult 메서드 호출
    }
}
