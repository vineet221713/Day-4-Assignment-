package com.masai;

public class Demo {
     int x = 25;
     String name = "shallu";
     String Add = "abc";

   public Demo(){
       int x = 45;
       String name = "shallu k papa";
       String Add = "abc";

       System.out.println("inside the construction");

    }
    public Demo(int x ,String name,String add){
       this.Add = add;
       this.name = name;
       this.x = x;

    }
    Demo(int i){

    }

    Demo(float f){

    }

    public void showdetails(){
//        System.out.println(add);
        System.out.println(name);
        System.out.println(x);
    }


}

 class Main2{
    public static void main(String[] args) {



        Demo d1 = new Demo();


        Demo d2 = new Demo(25,"abhishek","cvg");
        d2.showdetails();

        Demo d3 = new Demo(5);

        Demo d4 = new Demo(4f);

    }
}
