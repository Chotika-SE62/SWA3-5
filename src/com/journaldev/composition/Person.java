package com.journaldev.composition;

public class Person {

    //composition has-a relationship
    private Job job;
   
    public Person(){
        this.job=new Job();
        job.setSalary(1000L); //L -> �纵���Ţ�����long
    }
    public long getSalary() {
        return job.getSalary();
    }

}