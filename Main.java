/*
테스트 케이스 이유는 모르지만 복붙이 안됩니다 하나하나 적으세용 ^^...
김예진 070312-4 1.0 100 의예과 서울대학교
김예빈 081209-4 4.0 100 심리학과 고려대학교
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m; // 학생 수, 원서 수
        System.out.print("학생 수와 제출할 원서의 수를 입력하세요: ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();

        if (m < 6) {
            System.out.println("원서 작성을 시작합니다.");
            System.out.println("이름, 주민등록번호(xxxxxx-x), 성적, 출결, 가산점, 원하는 과, 대학교 이름을 순서대로 입력해주세요.");

            Student[] students = new Student[n];
            University[] universities = new University[n];

            for (int i = 0; i < n; i++) {
                Student student = new Student();
                University university = new University();

                String input = scanner.nextLine();
                String[] tokens = input.split(" ");

                student.name = tokens[0];
                student.citizen = tokens[1];
                student.score = Float.valueOf(tokens[2]);
                student.attend = Integer.parseInt(tokens[3]);
                student.plus = Integer.parseInt(tokens[4]);
                university.major = tokens[5];
                university.uniname = tokens[6];

                students[i] = student;
                universities[i] = university;
            }

            for (int j = 0; j < n; j++) {
                if (students[j].score < 3.0) {
                    System.out.printf("%s님은 합격입니다.\n", students[j].name);
                } else {
                    System.out.printf("%s님은 불합격입니다.\n", students[j].name);
                }
            }
        } else {
            System.out.println("원서 작성이 불가능합니다.");
        }

        scanner.close();
    }
}
