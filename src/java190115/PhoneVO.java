package java190115;

public class PhoneVO {
    private String name;
    private int age;
    private String phoneNum;

    public PhoneVO(String name, int age, String phoneNum) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    // 생성자 오버로딩 매개변수가 없더라도 PhoneVO객체를 생성할 수 있다.
    public PhoneVO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
