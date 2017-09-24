package oop1;

import java.util.Scanner;

public class StudentScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of students :");

        Integer total = sc.nextInt();

        Student[] students = new Student[total];

        for (Integer i = 0; i < total; i++) {

            Integer student_counter = i + 1;

            System.out.println("Student " + student_counter.toString() + " information");

            Student student = new Student();

            System.out.println("Enter Registration Number :");

            student.registration_no = sc.next();

            sc.nextLine();

            System.out.println("Enter Student Name :");

            student.name = sc.nextLine();

            System.out.println("Enter CGPA :");

            student.cgpa = sc.nextFloat();

            System.out.println("Programme Name :");

            student.programme_name = sc.next();

            sc.nextLine();

            System.out.println("School Name :");

            student.school_name = sc.nextLine();

            System.out.println("Proctor Name :");

            student.proctor_name = sc.nextLine();

            students[i] = student;

            System.out.println("Student information saved successfully !! \n");
        }

        sc.close();

        System.out.println("Thank you for the information.");

        for (Integer i = 0; i < total; i++) {

            System.out.println("\n" + students[i].name + " information \n");

            System.out.println("Registration No :" + students[i].registration_no);

            System.out.println("Student Name :" + students[i].name);

            System.out.println("CGPA :" + students[i].cgpa);

            System.out.println("Programme Name :" + students[i].programme_name);

            System.out.println("School Name :" + students[i].school_name);

            System.out.println("Proctor Name :" + students[i].proctor_name);
        }
    }
}


class Student {
    String registration_no;
    String name;
    Float cgpa;
    String programme_name;
    String school_name;
    String proctor_name;
}