package ru.mirea.Naumov.lab6;
import java.lang.*;

public class SortingStudentsByGPA{
    private int arraySize = 21;
    private final Student[] StudentsArray = new Student[arraySize];
    
    public SortingStudentsByGPA(){
        for (int i = 0; i < arraySize; ++i) {
            generateUniqueID(i);
            System.out.println(i+") Student's score: "+StudentsArray[i].score);
        }

        quickSort(0, arraySize - 1);
        System.out.println("########## Elements are sorted by Quick-Sort!");

        for (int i = 0; i < arraySize; ++i) System.out.println(i+") Student's  score: "+StudentsArray[i].score);

    }

    private void generateUniqueID (int i){
        StudentsArray[i] = new Student();
        StudentsArray[i].score = (int)(Math.random() * arraySize);

        for (int q = 0; q < i; ++q){
            if (StudentsArray[i].compare(StudentsArray[i],StudentsArray[q]) == 0) {
                StudentsArray[i].score = (int) (Math.random() *arraySize);
                q = 0;
            }
        }
    }

    private void quickSort(int low, int high) {
        int middle = low + (high - low) / 2;
        Student P = StudentsArray[middle];
        int i = low, j = high;
        while (i <= j) {
            while (StudentsArray[i].compare(StudentsArray[i], P) == 1) {
                i++;
            }

            while (StudentsArray[i].compare(StudentsArray[j], P) == -1) {
                j--;
            }

            if (i <= j) {
                Student temp = StudentsArray[i];
                StudentsArray[i] = StudentsArray[j];
                StudentsArray[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j);

        if (high > i)
            quickSort(i, high);
    }
}