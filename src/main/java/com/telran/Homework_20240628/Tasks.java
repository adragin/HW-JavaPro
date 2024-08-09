package org.demo.summary06_20240628.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Tasks {
    public static void main(String[] args) {
        String[] strings = new String[]{"This", "is", "something", "like", "a lot of", "strings"};

        List<String> newStrings = process(strings, e -> e.length() >= 5);
        System.out.println("Task1: " + newStrings);

        System.out.println("*********************");

        int[] numbers = {2, 4, 5, 7};

        System.out.print("Task2: ");
        process2(numbers, number -> System.out.print(number + " -> " + (number * number) + "  "));
        System.out.println();

        System.out.println("*********************");

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Task4: " + process3(numbers3, e -> e + 10));

    }


    /*  1. Напишите метод, который принимает список строк и предикат, и возвращает новый список,
     *   содержащий только те строки, которые удовлетворяют условию предиката.
     *   Например, отфильтровать все строки длиннее 5 символов.
     * */

    public static List<String> process(String[] a, Predicate<String> predicate) {
        return Arrays.stream(a)
                .filter(predicate)
                .toList();
    }

    /* 2. Создайте метод, который принимает список чисел и void-метод, отвечающий за логику.
     *     Метод должен применять переданный void-метод к каждому элементу списка.
     *     Например, вывести на экран квадрат каждого числа.
     * */

    public static void process2(int[] a, Consumer<Integer> action) {
        for (Integer number : a) {
            action.accept(number);
        }
    }

    /*  4. Реализуйте метод, который принимает список чисел и унарный оператор, а возвращает новый список,
     *  где каждый элемент преобразован с помощью переданного оператора.
     *  Например, увеличить каждое число на 1.
     * */
    public static List<Integer> process3(List<Integer> numbers, UnaryOperator<Integer> operator) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(operator.apply(number));
        }
        return result;
    }
}