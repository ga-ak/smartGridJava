package java190117.salary;

import java.util.ArrayList;

public class Employee_main {

    //

    public static void main(String[] args) {
        ArrayList<Employee> empArray = new ArrayList<>();

        Employee leeUnBee = new Constract("E001", "이은비", 5000, 6);
        Employee hwangHaeDo = new Permanent("E002", "황해도", 3000, 400);
        Employee parkByungKwan = new Part_time("E003", "박병관", 5, 10);
        Employee kimMiHy = new Part_time("E004", "김미희", 10, 20);

        empArray.add(leeUnBee);
        empArray.add(hwangHaeDo);
        empArray.add(parkByungKwan);
        empArray.add(kimMiHy);

        int sumSalary = 0;
        System.out.println("=============1월 월급 총 결산=============");
        for (int i = 0; i < empArray.size(); i++) {
            System.out.print(empArray.get(i).empNo+"\t");
            System.out.print(empArray.get(i).empName+"\t");
            System.out.print("1월 급여 : "+empArray.get(i).cal()+"만원");
            System.out.println();
            sumSalary += empArray.get(i).cal();
        }
        System.out.println("1월 총 급여 : "+sumSalary+"만원");
    }
}
