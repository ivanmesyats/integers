package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
/*1.Написати програму яка видаляє з колекції цілих чисел всі дублікати, якщо вони є.
Початкову колекцію з 100 елементів потрібно заповнити випадковими числами (ліміт 50).
На екран потрібно вивести обидві колекції та кількість видалених дублікатів.
(За бажанням можна вирішити декількома способами та порівняти, який з них швидше)
 */

    public static void main(java.lang.String[] args) {

        Random random = new Random();

        int size = 20;
        int count = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();


        for (int i = 0; i < size; i++) {

            numbers.add(random.nextInt(10));
        }

        List<Integer> numbers2 = numbers.stream().distinct().collect(Collectors.toList());

        for (int var : numbers) {

            System.out.print(var + "  ");

        }

        System.out.println("");

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size() && i < numbers.size(); j++) {

                if (numbers.get(i) == numbers.get(j)) {
                    count++;
                    //numbers.remove(j);
                    numbers.remove(i);
                    j = i;

                }

            }
        }



            System.out.println(numbers + "Counted dublicates " + count);

            System.out.println(numbers2);


        }

    }








