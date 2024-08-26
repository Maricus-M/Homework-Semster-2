/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classactivity14aug;

/**
 *
 * @author colle
 */
public class ClassActivity15Aug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Polymorphism Example:");
        Shape[] shapes = {new Rectangle(5, 7), new Circle(3.5)};
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }

        System.out.println("\nInheritance Example:");
        Car car = new Car("Toyota", "Corolla", 4);
        car.displayInfo();

        System.out.println("\nEncapsulation Example:");
        BankAccount account = new BankAccount("123456", 1000.00);
        account.deposit(500.00);
        account.withdraw(200.00);
        System.out.println("Balance: " + account.checkBalance());

        System.out.println("\nConstructors and Methods Example:");
        Book book = new Book("Effective Java", "Maricus Marais", 850.00);
        book.displayDetails();
        book.applyDiscount(10);
    }
}

class Shape {

    public double area() {
        return 0;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Vehicle {

    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: R" + price);
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= (price * (percentage / 100));
            System.out.println("Discount applied. New price: R" + price);
        } else {
            System.out.println("Invalid discount percentage");
        }
    }
}
