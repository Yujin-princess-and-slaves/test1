package src;
public class student {
    String name;
    int score;
    int check;
    int point;
    String number;
    public student(String n, int s, int c, int p, String num){
        this.name=n;
        this.score=s;
        this.check=c;
        this.point=p;
        this.number=num;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public int getCheck() {
        return check;
    }
    public int getPoint() {
        return point;
    }
    public String getNumber() {
        return number;
    }

}
