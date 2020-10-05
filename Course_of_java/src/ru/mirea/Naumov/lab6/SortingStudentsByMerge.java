package ru.mirea.Naumov.lab6;
import java.lang.*;

public class SortingStudentsByMerge {
    private int arraySize1 = 21;
    private int arraySize2 = 20;
    private int arraySizeFull = arraySize1 + arraySize2;

    private final Student[] IDNumbers1 = new Student[arraySize1];
    private final Student[] IDNumbers2 = new Student[arraySize2];
    private final Student[] IDNumbersFull = new Student[arraySizeFull];

    public SortingStudentsByMerge(){
        if (arraySize1 < arraySize2) {
            int temp = arraySize1;
            arraySize1 = arraySize2;
            arraySize2 = temp;
        }

        for (int i = 0; i < arraySize1; i++) {
            generateUniqueID(i, true);
            System.out.println(i+") Student's "+IDNumbers1[i].toString()+". 1st array");
        }

        for (int i = 0; i < arraySize2; i++){
            generateUniqueID(i, false);
            System.out.println(i+") Student's "+IDNumbers2[i].toString()+". 2nd array");
        }

        mergeSort(IDNumbers1, arraySize1);
        mergeSort(IDNumbers2, arraySize2);
        merge(IDNumbersFull, IDNumbers1, IDNumbers2, arraySize1, arraySize2);
        System.out.println("########## Elements are sorted by Merge Sort Algorithm!");

        for (int i = 0; i < arraySizeFull; i++) {
            System.out.println(i+") Student's "+IDNumbersFull[i].toString());
        }
    }

    private void generateUniqueID (int i, boolean generationMode){
        if (generationMode){
            IDNumbers1[i] = new Student((int) (Math.random() * arraySizeFull));

            for (int q = 0; q < i; ++q) {
                if (IDNumbers1[i].compareTo(IDNumbers1[q]) == 0) {
                    IDNumbers1[i].idNumber = (int) (Math.random() * arraySizeFull);
                    q = 0;
                }
            }
        }
        else  {
            IDNumbers2[i] = new Student((int) (Math.random() * arraySizeFull));

            for (int q = 0; q < arraySize1; ++q) {
                if (q < i){
                    if (IDNumbers2[i].compareTo(IDNumbers1[q]) == 0 || IDNumbers2[i].compareTo(IDNumbers2[q]) == 0) {
                        IDNumbers2[i].idNumber = (int) (Math.random() * arraySizeFull);
                        q = 0;
                    }
                }
                else {
                    if (IDNumbers2[i].compareTo(IDNumbers1[q]) == 0) {
                        IDNumbers2[i].idNumber = (int) (Math.random() * arraySizeFull);
                        q = 0;
                    }
                }
            }
        }
    }

    private void mergeSort(Student[] arr, int length){
        if(length < 2) return;

        int mid = length / 2;
        Student[] leftArr = new Student[mid];
        Student[] rightArr = new Student[length - mid];

        for(int i = 0; i < mid; i++) leftArr[i] = arr[i];
        for(int i = mid; i < length; i++) rightArr[i - mid] = arr[i];

        mergeSort(leftArr, mid);
        mergeSort(rightArr, length - mid);

        merge(arr, leftArr, rightArr, mid, length - mid);
    }

    private void merge(Student[] arr, Student[] leftArr, Student[] rightArr, int left, int right){
        int i = 0, j = 0, q = 0;

        while (i < left && j < right){
            if(leftArr[i].compareTo(rightArr[j]) == 1 || leftArr[i].compareTo(rightArr[j]) == 0){
                arr[q++] = leftArr[i++];
            }
            else arr[q++] = rightArr[j++];
        }

        while (i < left){
            arr[q++] = leftArr[i++];
        }
        while (j < right){
            arr[q++] = rightArr[j++];
        }
    }
}
