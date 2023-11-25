package org.example;

class Cookie extends Sweet {
    boolean glutenFree;

    // Конструктор
    public Cookie(String name, double weight, boolean glutenFree) {
        super(name, weight);
        this.glutenFree = glutenFree;
    }

    // Метод для перевірки наявності глютену
    public boolean isGlutenFree() {
        return glutenFree;
    }
}
