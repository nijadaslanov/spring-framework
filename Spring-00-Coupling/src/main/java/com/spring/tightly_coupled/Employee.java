package com.spring.tightly_coupled;

public class Employee {
    PartTimeEmployee partTimeEmployee;
    FullTimeEmployee fullTimeEmployee;

    public Employee(PartTimeEmployee partTimeEmployee, FullTimeEmployee fullTimeEmployee) {
        this.partTimeEmployee = partTimeEmployee;
        this.fullTimeEmployee = fullTimeEmployee;
    }

    public void manageAccount(){
        this.fullTimeEmployee.createAccount();
        this.partTimeEmployee.createAccount();
    }
}
