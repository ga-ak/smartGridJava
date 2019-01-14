package jdbc190114;

public class Student {

    private String name;
    private String studentNum;
    private int javaScore;
    private int dbScore;
    private int iotScoer;

    public Student(String name, String studentNum, int javaScore, int dbScore, int iotScoer) {
        this.name = name;
        this.studentNum = studentNum;
        this.javaScore = javaScore;
        this.dbScore = dbScore;
        this.iotScoer = iotScoer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }

    public int getDbScore() {
        return dbScore;
    }

    public void setDbScore(int dbScore) {
        this.dbScore = dbScore;
    }

    public int getIotScoer() {
        return iotScoer;
    }

    public void setIotScoer(int iotScoer) {
        this.iotScoer = iotScoer;
    }
}
