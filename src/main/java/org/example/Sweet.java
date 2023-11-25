package org.example;

/**
 * The Sweet class represents a generic type of sweet with basic information such as name and weight.
 */
class Sweet {

    /**
     * The name of the sweet.
     */
    String name;

    /**
     * The weight of the sweet, measured in some unit.
     */
    double weight;

    /**
     * Constructs a Sweet object with the specified name and weight.
     *
     * @param name   The name of the sweet.
     * @param weight The weight of the sweet, measured in some unit.
     */
    public Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Gets the weight of the sweet.
     *
     * @return The weight of the sweet, measured in some unit.
     */
    public double getWeight() {
        return weight;
    }
}
