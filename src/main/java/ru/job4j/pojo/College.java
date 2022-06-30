package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vladimir V");
        student.setGroup(22);
        student.setAdmission(new Date());
        System.out.println(student.getName() + " entered in " + student.getGroup() + " group in" + student.getAdmission());
    }

}
