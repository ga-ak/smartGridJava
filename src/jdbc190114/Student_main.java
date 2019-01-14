package jdbc190114;

import java.util.Scanner;

public class Student_main {

    // 학생의 점수를 넣을 수 있는 프로그램
    // 이름, 학번, java점수, db점수, iot점수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("학번 : ");
        String studentNum = sc.next();
        System.out.print("자바 점수 : ");
        int javaScore = sc.nextInt();
        System.out.print("디비 점수 : ");
        int dbScore = sc.nextInt();
        System.out.print("아이오티 점수 : ");
        int iotScore = sc.nextInt();
        Student stu = new Student(name, studentNum,javaScore,dbScore,iotScore);

//        stu.setName(name);
//        stu.setStudentNum(studentNum);
//        stu.setJavaScore(javaScore);
//        stu.setDbScore(dbScore);
//        stu.setIotScoer(iotScore);

        System.out.println(stu.getName()+"님");
        System.out.println("학번 : "+ stu.getStudentNum());
        System.out.println("java 점수 : "+stu.getJavaScore());
        System.out.println("db 점수 : "+ stu.getDbScore());
        System.out.println("iot 점수 : "+stu.getIotScoer());


        System.out.print("이름 : ");
        String name2 = sc.next();
        System.out.print("학번 : ");
        String studentNum2= sc.next();
        System.out.print("자바 점수 : ");
        int javaScore2 = sc.nextInt();
        System.out.print("디비 점수 : ");
        int dbScore2 = sc.nextInt();
        System.out.print("아이오티 점수 : ");
        int iotScore2 = sc.nextInt();
        Student stu2 = new Student(name2,studentNum2,javaScore2,dbScore2,iotScore2);

//        stu2.setName(name2);
//        stu2.setStudentNum(studentNum2);
//        stu2.setJavaScore(javaScore2);
//        stu2.setDbScore(dbScore2);
//        stu2.setIotScoer(iotScore2);

        System.out.println(stu2.getName()+"님");
        System.out.println("학번 : "+ stu2.getStudentNum());
        System.out.println("java 점수 : "+stu2.getJavaScore());
        System.out.println("db 점수 : "+ stu2.getDbScore());
        System.out.println("iot 점수 : "+stu2.getIotScoer());
    }
}
