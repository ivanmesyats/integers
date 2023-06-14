package org.example;

import java.util.*;

public class Main {
/*1.Написати програму яка видаляє з колекції цілих чисел всі дублікати, якщо вони є.
Початкову колекцію з 100 елементів потрібно заповнити випадковими числами (ліміт 50).
На екран потрібно вивести обидві колекції та кількість видалених дублікатів.
(За бажанням можна вирішити декількома способами та порівняти, який з них швидше)
 */

    public static void main(java.lang.String[] args) {

        Random random = new Random();

        int size = 100;
        int count = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {

            numbers.add(random.nextInt(50));
        }


        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {

            numbers2.add(random.nextInt(50));

        }


        for (int var : numbers) {

            System.out.print(var + "  ");

        }

        System.out.println();

        for (int var2 : numbers2) {

            System.out.print(var2 + "  ");

        }

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers2.size() && i < numbers.size(); j++) {

                if (numbers.get(i) == numbers2.get(j)) {
                    count++;
                    numbers.remove(i);
                    numbers2.remove(j);
                }

            }

        }

        System.out.println("Count " + count);

        if (count > 0) {

            for (int var : numbers) {

                System.out.print(var + "  ");

            }

            System.out.println();

            for (int var2 : numbers2) {

                System.out.print(var2 + "  ");

            }
        }

    }

}





