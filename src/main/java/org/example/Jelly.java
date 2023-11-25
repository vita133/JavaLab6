package org.example;

/**
 * The Jelly class represents a type of sweet with additional information about its flavor.
 * It extends the Sweet class and inherits its properties such as name and weight.
 */
class Jelly extends Sweet {

    /**
     * The flavor of the jelly, representing its taste.
     */
    private String flavor;

    /**
     * Constructs a Jelly object with the specified name, weight, and flavor.
     *
     * @param name   The name of the jelly.
     * @param weight The weight of the jelly, measured in some unit.
     * @param flavor The flavor of the jelly, representing its taste.
     */
    public Jelly(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }

    /**
     * Gets the flavor of the jelly.
     *
     * @return The flavor of the jelly, representing its taste.
     */
    public String getFlavor() {
        return flavor;
    }
}
