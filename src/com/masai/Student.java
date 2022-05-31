package com.masai;

public class Student {
    private int rool;
    private String name;
    private int age ;
    private int mark;

    Student(){

    }

    public int getRool() {
        return rool;
    }

    public void setRool(int rool) {
        this.rool = rool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}

  class Main{
      public static void main(String[] args) {
          Student s1 = new Student();
          s1.setAge(22);
          s1.setMark(550);
          s1.setName("vishu");
          s1.setRool(1234);
          System.out.println(s1.getName());
          System.out.println(s1.getAge());
          System.out.println(s1.getRool());
          System.out.println(s1.getMark());
      }
  }
