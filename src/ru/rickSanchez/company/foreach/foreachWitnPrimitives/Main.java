package ru.rickSanchez.company.foreach.foreachWitnPrimitives;

public class Main {
    public static void main(String[] args) {
        int[] x = {2,5,6,7,8,9};
//        for(int i = 0; i < x.length; i++) {
//            System.out.print(x[i]+" ");
//        }
//        System.out.println();

//        for(int tmp : x) {
//            System.out.print(tmp + " ");
//        }
//        System.out.println();

        for(int tmp: x){
            ++tmp;
            System.out.print(tmp + " ");
        }
        System.out.println();

        for(int tmp : x) {
            System.out.print(tmp + " ");
        }
    }
}
