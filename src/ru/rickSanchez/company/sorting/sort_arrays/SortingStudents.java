package ru.rickSanchez.company.sorting.sort_arrays;

import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks = {5,2,7,33,1,8,0};
        String[] students = {"Alex", "Andrew", "Sonya", "Luck"};

        Arrays.sort(marks);
        Arrays.sort(students);

        for(int tmp : marks){
            System.out.print(tmp + " ");
        }
        System.out.println();

        for(String str : students) {
            System.out.print(str + " ");
        }
    }
}
