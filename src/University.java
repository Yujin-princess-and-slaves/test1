package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class University {
    private String name;
    private String major;
    private List<Student> applications;

    public University(String name, String major) {
        this.name = name;
        this.major = major;
        this.applications = new ArrayList<>();
    }

    public void submitApplication(Student student) {
        // 원서 제출 기능 구현
        if (applications.size() < 6) {
            applications.add(student);
            System.out.println("원서가 성공적으로 제출되었습니다.");
        } else {
            System.out.println("최대 지원자 수에 도달하였습니다.");
        }
    }

    public void displayApplications() {
        // 성적 순으로 정렬
        if (applications.isEmpty()) {
            System.out.println("원서가 없습니다.");
        } else {
            //성적 기준 오름차순
            Collections.sort(applications, Comparator.comparingInt(Student::getScore));

            for (Student student : applications) {
                System.out.println("이름: " + student.getName() + "\n성적: " + student.getScore() + "\n주민등록 번호:" + student.getResidentregistration() + "\n출결: " + (student.hasAttendance()? "참여":"불참")
                        + "\n가산점:" + student.getExtraPoints() + "\n대학교:" + student.getUniversityName() + "\n원하는 과:" + student.getDesiredMajor());
                System.out.println();
            }
        }
    }

    public void reviewApplications() {
        if (applications.isEmpty()) {
            System.out.println("원서가 없습니다.");
        } else {
            for (Student student : applications) {
                // 입학 기준에 따라 입학 허가 또는 불허 결정
                if (student.getScore() >= 80 && student.hasAttendance()) {
                    System.out.println(student.getName() + "님은 입학이 허가되었습니다.");
                } else {
                    System.out.println(student.getName() + "님은 입학이 거절되었습니다.");
                }
            }
        }
    }
}