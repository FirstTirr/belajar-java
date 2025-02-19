package com.belajar;

public class karyawan extends orang {
    
    String name = "ALFA CUY!";
    int age = 23;
    float salary = 4000f;
      
    public karyawan(String string, int i, float f) {
        //TODO Auto-generated constructor stub
    }

    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $ " + salary);
    }
}

