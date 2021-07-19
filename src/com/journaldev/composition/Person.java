package com.journaldev.composition;

public class Person {

    //composition has-a relationship
    private Job job;
   
    public Person(){
        this.job=new Job();
        job.setSalary(1000L); //L -> เก็บตัวเลขที่เป็นlong
    }
    public long getSalary() {
        return job.getSalary();
    }

}