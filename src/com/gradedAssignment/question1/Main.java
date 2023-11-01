package com.weekTwo.gradedAssignment.question1;
public class Main {
    public static void main(String[] args) {
        Admin adminDept1 = new Admin();
        Hr hrDept1 = new Hr();
        Tech techDept1 = new Tech();
        System.out.println("Welcome to " + adminDept1.departmentName());
        System.out.println(adminDept1.getTodaysWork());
        System.out.println(adminDept1.getWorkDeadline());
        System.out.println(adminDept1.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to " + hrDept1.departmentName());
        System.out.println(hrDept1.doActivity());
        System.out.println(hrDept1.getTodaysWork());
        System.out.println(hrDept1.getWorkDeadline());
        System.out.println(hrDept1.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to " + techDept1.departmentName());
        System.out.println(techDept1.getTodaysWork());
        System.out.println(techDept1.getWorkDeadline());
        System.out.println(techDept1.getTechStackInformation());
        System.out.println(techDept1.isTodayAHoliday());

    }
}
