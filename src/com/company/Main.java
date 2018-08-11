package com.company;

public class Main {


    static int[] tab1 = new int[]{0, 10, 8, 8, 6, 4, 2, 1, 200, 300, 8, 15};
    static int[] tab2 = {42, 68, 32, 50, 1, 2, 400, 200, 1, 3, 8, 10, 15};
    static int[] tab3 = {20, 28, 0, 0, 1, 3, 5, 15, 18, 20, 17, 13, 14, 2, 9, 10};


    public static void quick(int[] tablica, int x, int y) {
        int left;
        int right;
        left = x;
        right = y;
        int m = tablica[(x + y) / 2];
        int tmp;
        do {
            while (tablica[left] < m)
                left++;
            while (m < tablica[right])
                right--;
            if (left <= right) {
                tmp = tablica[left];
                tablica[left] = tablica[right];
                tablica[right] = tmp;
                left++;
                right--;
            }
        }
        while (left <= right);
        if (x < right)
            quick(tablica, x, right);
        if (left < y)
            quick(tablica, left, y);


    }



/*
    public static void bubbles() {
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1.length - 1; j++) {
                if (tab1[j] > tab1[j + 1]) {
                    int a1 = tab1[j];
                    tab1[j] = tab1[j + 1];
                    tab1[j + 1] = a1;

                }
            }
        }
        for (int c : tab1) {
            System.out.println(c);
        }
    }
    */


    public static void main(String[] args) {

//        bubbles();
        quick(tab2, 0, 12);
        for (int a : tab2){
            System.out.println(a);
        }

        int c = 10;



    }
}

