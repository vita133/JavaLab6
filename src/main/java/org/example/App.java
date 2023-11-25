package org.example;

import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Candy candy1 = new Candy("Mars", 0.05, 0.7);
        Jelly jelly1 = new Jelly("Fruit Jelly", 0.03, "Mixed Fruit");
        Cookie cookie1 = new Cookie("Chocolate Chip Cookie", 0.02, true);

        Gift<Sweet> gift = new Gift<>();
        gift.addSweet(candy1);
        gift.addSweet(jelly1);
        gift.addSweet(cookie1);
        gift.printGift();

        System.out.println("Gift Weight: " + gift.calculateWeight() + " kg");

        gift.sortSweets(Comparator.comparing(Sweet::getWeight));
        System.out.println("Gift Weight after sorting: ");
        gift.printGift();

        List<Candy> selectedCandies = gift.findCandyByChocolateContent(0.6, 0.8);
        System.out.println("Selected candies:");
        for (Candy candy : selectedCandies) {
            System.out.println(candy.name + " - Chocolate Content: " + candy.getChocolateContent());
        }
    }
}
