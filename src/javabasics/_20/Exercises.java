package javabasics._20;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(19, "Piero", "maschio", "A", "matematica");
        // qui ho voluto provare il metodo creando un array

        students.add(new Student(19, "Piero", "maschio", "A", "matematica"));
        //qui ho provato un altro metodo con .add


        student.setName("Maria");
        System.out.println(student.getName());
        student.setAge(13);
        System.out.println(student.getAge());
        student.setGender("girl");
        System.out.println(student.getGender());


        System.out.println(students.get(0).getAge() + " " +
                students.get(0).getName() + " " +
                students.get(0).getGender() + " " +
                students.get(0).getSection() + " " +
                students.get(0).getSubject());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     * <p>
     * Think about what reasonably constraints are?
     * <p>
     * Should a student be able to be a negative age?
     * <p>
     * Create a counter for one of the getters, try to think about
     * what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(19, "Piero", "man", "A", "math"));
        students.add(new Student(16, "Angelo", "man", "B", "math"));
        students.add(new Student(24, "Paolo", "man", "C", "math"));
        students.add(new Student(14, "Lu", "girl", "C", "math"));
        //ho un piccolo problema con il codice. Tutto funziona ma quando lo avvio lo studente di
        // nome Lu mi da null come valore, ma solo alla prima riga, perche??

        for (int i = 0; i < students.size(); i++) {          //ho preferito creare un for per far si che mi stampasse tutti gli studenti dell'array
            System.out.println(students.get(i).getAge() + " " +
                    students.get(i).getName() + " " +
                    students.get(i).getGender() + " " +
                    students.get(i).getSection() + " " +
                    students.get(i).getSubject());
        }
        System.out.println("the counter of the string name is " + students.get(0).getCounter(students));
    }

}
