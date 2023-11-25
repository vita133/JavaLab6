package org.example;

public class Candy extends Sweet {
    double chocolateContent;

    // Конструктор
    public Candy(String name, double weight, double chocolateContent) {
        super(name, weight);
        this.chocolateContent = chocolateContent;
    }

    // Метод для отримання вмісту шоколаду в цукерці
    public double getChocolateContent() {
        return chocolateContent;
    }
}
