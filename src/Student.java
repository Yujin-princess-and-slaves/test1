package src;

public class Student {
    public static String name;
    public static int score;
    public static int check;
    public static int point;

    public void studentResult(String name, int score, int check, int point){
        System.out.printf("이름: %s\n성적: %d\n출결: %d\n가산점: %d\n", name, score, check, point);
    }
}
