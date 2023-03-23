package javabasics._19;

public class Student {
    int age;
    String name;

    Student(String name, int age){
        System.out.println("constructing!");
        this.age = age;
        this.name = name;
        System.out.println("constructed!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    Student(String name){
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
    Student(){

    }
}
