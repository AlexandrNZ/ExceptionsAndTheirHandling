package org.example;

import java.util.Scanner;
// Занание 1
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
//падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

//public class Main {
//    public static void main(String[] args) {
//        float number = getFloatInput();
//        System.out.println("Введенное число: " + number);
//    }
//
//    public static float getFloatInput() {
//        Scanner scanner = new Scanner(System.in);
//        float number;
//        while (true) {
//            System.out.print("Введите дробное число: ");
//            if (scanner.hasNextFloat()) { // проверяем, является ли введенное значение float
//                number = scanner.nextFloat();
//                break;
//            } else {
//                System.out.println("Некорректный ввод! Попробуйте еще раз.");
//                scanner.next(); // пропускаем введенное значение
//            }
//        }
//        scanner.close();
//        return number;
//    }
//}

// Задание 4
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                throw new IllegalArgumentException("Пустые строки вводить нельзя");
            } else {
                System.out.println("Вы ввели: " + userInput);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

