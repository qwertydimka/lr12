package com.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "B1", 1000.0);
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
        System.out.println("Зарплата увеличена на $" + amount + ". Текущая зарплата: $" + salary);
    }

    public void increaseSalary(int percent) {
        double increase = salary * percent / 100;
        this.salary += increase;
        System.out.println("Зарплата увеличена на " + percent + "%. Текущая зарплата: $" + salary);
    }

    public void updateEnglishLevel(String newLevel) {
        this.englishLevel = newLevel;
        System.out.println(name + " " + surname + ": новый уровень английского - " + newLevel);
    }

    public void updateEnglishLevel(String newLevel, double bonus) {
        this.englishLevel = newLevel;
        this.salary += bonus;
        System.out.println(name + " " + surname + ": новый уровень английского - " + newLevel +
                ", бонус $" + bonus + ". Текущая зарплата: $" + salary);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public void printInfo(String message) {
        System.out.println(message);
        System.out.println(this);
    }

    public static void printTesterInfo(Tester tester) {
        System.out.println("=== Информация о тестировщике ===");
        System.out.println("Имя: " + tester.name);
        System.out.println("Фамилия: " + tester.surname);
        System.out.println("Опыт работы: " + tester.experienceInYears + " лет");
        System.out.println("Уровень английского: " + tester.englishLevel);
        System.out.println("Зарплата: $" + tester.salary);
        System.out.println("===============================");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getExperienceInYears() {
        return experienceInYears;
    }
    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
    public String getEnglishLevel() {
        return englishLevel;
    }
    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experienceInYears=" + experienceInYears +
                ", englishLevel='" + englishLevel + '\'' +
                ", salary=$" + salary +
                '}';
    }
}