package org.example;

class Jelly extends Sweet {
    String flavor;

    // Конструктор
    public Jelly(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }

    // Метод для отримання смаку мармеладу
    public String getFlavor() {
        return flavor;
    }
}
