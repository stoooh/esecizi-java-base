package javabasics._20;

import java.util.ArrayList;

public class Student {
    private int age;
    private String name;
    private String gender;
    private String section;
    private String subject;

    private int counter = 0;

    public Student(int age, String name, String gender, String section, String subject) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSection(section);
        setSubject(subject);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getSection() {
        return section;
    }

    public String getSubject() {
        return subject;
    }

    public void setAge(int age) {
        if (age < 15) {
            System.out.println(name + " can't access in this class because is too young");
            this.age = age; //ho lasciato this anche qui in modo che mi stampasse lo stesso il valore
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (name.length() <= 2) {
            System.out.println( name + " can't access in this class because her/his name is too short");
            this.name = name;    //ho lasciato this anche qui in modo che mi stampasse lo stesso il valore
        } else {
            this.name = name;
        }
        counter += 1;
    }

    public void setGender(String gender) {
        if (gender.equals("girl")) {
            System.out.println(name + " can't access in this class because is a girl");
            this.gender = gender;  //ho lasciato this anche qui in modo che mi stampasse lo stesso il valore
        } else {
            this.gender = gender;
        }
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCounter(ArrayList array) {
        counter = array.size();
        return counter;
    }
}
