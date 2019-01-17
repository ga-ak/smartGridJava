package java190117.salary;

public class Constract extends Employee {
    int workTerm;

    public Constract(String empNo, String empName, int empPay, int workTerm) {
        super(empNo, empName, empPay);
        this.workTerm = workTerm;
    }

    @Override
    public double cal() {
        double result;
        result = (double)this.empPay/this.workTerm;

        return result;
    }
}
