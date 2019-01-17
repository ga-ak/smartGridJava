package java190117.salary;

public class Permanent extends Employee {
    int bonus;

    public Permanent(String empNo, String empName, int empPay, int bonus) {
        super(empNo, empName, empPay);
        this.bonus = bonus;
    }

    @Override
    public double cal() {
        double result;
        result = ((double)this.empPay+this.bonus)/12;

        return result;
    }
}
