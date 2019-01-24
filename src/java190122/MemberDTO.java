package java190122;

public class MemberDTO {
    private String id;
    private String pw;
    private int age;
    private String tel;

    public MemberDTO(String id, String pw, int age, String tel) {
        this.id = id;
        this.pw = pw;
        this.age = age;
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
