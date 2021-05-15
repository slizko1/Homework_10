package com.samoylenko;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        //task1();
        task2();
    }

    //        1) Завершить пример с фруктуами: напечатать стоимость чека по 4 позициям с окрулением до копеек.
//        Данные вес/стоимость за Кг:
//        Зеленое яблоко 346 / 21.95
//        Красное яблоко 230 / 19.95
//        Банан 220 / 32.85
//        Лимон 88 / 34.95
    public static void task1() {
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, 346, 21.95);
        Fruit redApple = new Fruit(Fruit.Type.APPLE, 230, 19.95);
        Fruit banana = new Fruit(Fruit.Type.BANANA, 220, 32.85);
        Fruit lemon = new Fruit(Fruit.Type.LEMON, 88, 34.95);
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(greenApple);
        fruits.add(redApple);
        fruits.add(banana);
        fruits.add(lemon);
        System.out.println(fruits);
        System.out.printf("Bill price = %.2f", calculateBill(fruits));
    }

    public static double calculateBill(List<Fruit> fruits) {
        double result = 0;
        for (Fruit fruit : fruits) {
            result += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        return result;
    }

    //        2*) Реализовать метод который сортирует массив целых чисел быстрой сортировкой
    public static void task2() {
        int[] arr = new int[20];
        int lo = 0;
        int hi = arr.length - 1;
        fillTheArray(arr);
        System.out.println(Arrays.toString(arr));
        quickSort(arr, lo, hi);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(20);
        }
    }
}


