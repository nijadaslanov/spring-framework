package com.spring.loosely_coupled;

public class FullTimeMentor implements Mentor{
    @Override
    public void createAccount() {
        System.out.println("Ful time account created");
    }
}
