package com.masaiQustion3;

public class Student {
    int roll;
    String name;
    String address;
    

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Student(){

    }
    void nit(){
        setName("raj");
        setAddress("abc");
        setRoll(1234);
    }
}
class main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.nit();
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());

    }
}
