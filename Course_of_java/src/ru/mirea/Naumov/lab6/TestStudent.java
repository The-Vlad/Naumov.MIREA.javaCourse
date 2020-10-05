package ru.mirea.Naumov.lab6;
import java.lang.*;

public class TestStudent {
    private int arraySize = 21;
    private final Student[] IDNumbers = new Student[arraySize];

    public TestStudent(){
        for (int i = 0; i < arraySize; ++i) {
            generateUniqueID(i);
            System.out.println(i+") Student's "+IDNumbers[i].toString());
        }

        sortByInserts();
        System.out.println("########## Elements are sorted by Algorithm with Inserts!");

        for (int i = 0; i < arraySize; ++i) System.out.println(i+") Student's "+IDNumbers[i].toString());
    }

    private void generateUniqueID (int i){
        IDNumbers[i] = new Student((int) (Math.random() * arraySize));

        for (int q = 0; q < i; ++q){
            if (IDNumbers[i].compareTo(IDNumbers[q]) == 0) {
                IDNumbers[i].idNumber = (int) (Math.random() *arraySize);
                q = 0;
            }
        }
    }

    private void sortByInserts(){
        Student temp;

        for (int i = 1; i < arraySize; i++){
            temp = IDNumbers[i];
            int q = i - 1;

            while (q >= 0 && IDNumbers[q].compareTo(temp) < 0){
                IDNumbers[q + 1] = IDNumbers[q];
                q--;
            }

            IDNumbers[q + 1] = temp;
        }
    }

    public static void main(String[] str){
        System.out.println("\nУпражнение 1 (Sorting by Algorithm with inserts):");
        new TestStudent();

        System.out.println("\n\nУпражнение 2 (Sorting by Quick Sort Algorithm)");
        new SortingStudentsByGPA();

        System.out.println("\n\nУпражнение 3 (Sorting by Merge Sort Algorithm");
        new SortingStudentsByMerge();
    }
}
