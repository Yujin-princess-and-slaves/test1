package src;

public class student {
    String name;
    int score;
    int check;
    int point;
    String number;

    public student(String n, int s, int c, int p, String num){
        name=n;
        score=s;
        check=c;
        point=p;
        number=num;
    }
    public void setName(String n){
        name=n;
    }
    public void setScore(int s){
        score=s;
    }
    public void setCheck(int c){
        check=c;
    }
    public void setPoint(int p){
        point=p;
    }
    public void setNumber(String num){
        number=num;
    }
}