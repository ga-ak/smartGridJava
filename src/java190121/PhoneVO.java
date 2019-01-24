package java190121;

public class PhoneVO {

    // 필드로 이름과 나이, 전화번호를 입력받는다
    private String name;
    private String phoneNum;
    private int age;

    public PhoneVO(String name, String phoneNum, int age) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
