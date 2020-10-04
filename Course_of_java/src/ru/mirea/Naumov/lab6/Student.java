package ru.mirea.Naumov.lab6;
import java.lang.*;
import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    public int idNumber;
    public int score = 0;

    public Student(){
        this.idNumber = 0;
    }

    public Student(int idNumber){
        this.idNumber = idNumber;
    }

    @Override
    public String toString(){
       return "ID number is: "+idNumber;
    }

    @Override
    public int compareTo(Student object) {
        if (this.idNumber < object.idNumber) return 1;
        else if (this.idNumber > object.idNumber) return -1;
        else return 0;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.score < o2.score) return 1;
        else if (o1.score > o2.score) return -1;
        else return 0;
    }
}
