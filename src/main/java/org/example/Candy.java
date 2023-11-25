package org.example;

/**
 * The Candy class represents a type of sweet with additional information about its chocolate content.
 * It extends the Sweet class and inherits its properties such as name and weight.
 */
public class Candy extends Sweet {

    /**
     * The chocolate content of the candy, measured in some unit.
     */
    private double chocolateContent;

    /**
     * Constructs a Candy object with the specified name, weight, and chocolate content.
     *
     * @param name             The name of the candy.
     * @param weight           The weight of the candy, measured in some unit.
     * @param chocolateContent The chocolate content of the candy, measured in some unit.
     */
    public Candy(String name, double weight, double chocolateContent) {
        super(name, weight);
        this.chocolateContent = chocolateContent;
    }

    /**
     * Gets the chocolate content of the candy.
     *
     * @return The chocolate content of the candy, measured in some unit.
     */
    public double getChocolateContent() {
        return chocolateContent;
    }
}
