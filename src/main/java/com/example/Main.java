package com.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Иван", "Иванов");
        Tester tester2 = new Tester("Петр", "Петров", 3);
        Tester tester3 = new Tester("Анна", "Сидорова", 5, "B2", 2000.0);




        tester1.increaseSalary(100);
        tester2.increaseSalary(10); // на 10%
        tester3.updateEnglishLevel("C1");
        tester3.updateEnglishLevel("C1", 300); // с бонусом

        tester1.printInfo();
        tester2.printInfo("Информация о тестировщике:");
        Tester.printTesterInfo(tester3);
    }
}