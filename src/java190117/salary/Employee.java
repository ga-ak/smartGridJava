package java190117.salary;

public abstract class Employee {
    String empNo;
    String empName;
    int empPay;

    public Employee(String empNo, String empName, int empPay) {
        this.empNo = empNo;
        this.empName = empName;
        this.empPay = empPay;
    }

    public abstract double cal();

    @Override
    public String toString() {
        String result = this.empNo + "\t" + this.empName + "\t" + "1월 급여 : " + this.cal() + "만원";
        return result;
    }
}
