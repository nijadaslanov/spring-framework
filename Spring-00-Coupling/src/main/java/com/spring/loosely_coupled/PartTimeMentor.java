package com.spring.loosely_coupled;

public class PartTimeMentor implements Mentor{
    @Override
    public void createAccount() {
        System.out.println("Part time account created");
    }
}
