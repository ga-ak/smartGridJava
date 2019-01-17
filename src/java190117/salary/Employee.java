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
}
