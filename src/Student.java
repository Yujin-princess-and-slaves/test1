package src;

class Student {
    private String name;
    private int score;
    private boolean attendance;
    private int extraPoints;
    private String desiredMajor;
    private String universityName;
    private String residentregistration;
    public Student(String name, int score, boolean attendance, int extraPoints, String desiredMajor, String universityName, String residentregistration) {
        this.name = name;
        this.score = score;
        this.attendance = attendance;
        this.extraPoints = extraPoints;
        this.desiredMajor = desiredMajor;
        this.universityName = universityName;
        this.residentregistration = residentregistration;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean hasAttendance() {
        return attendance;
    }

    public int getExtraPoints() {
        return extraPoints;
    }

    public String getDesiredMajor() {
        return desiredMajor;
    }

    public String getUniversityName() {
        return universityName;
    }
    public String getResidentregistration(){
        return residentregistration;
    }
}
