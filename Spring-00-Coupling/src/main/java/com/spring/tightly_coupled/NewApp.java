package com.spring.tightly_coupled;

public class NewApp {
    public static void main(String[] args) {

        Employee employee = new Employee(new PartTimeEmployee(), new FullTimeEmployee());
        employee.manageAccount();


    }
}
