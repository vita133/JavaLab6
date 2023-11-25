package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Gift {
    List<Sweet> sweetsList = new ArrayList<>();

    public void addSweet(Sweet sweet) {
        sweetsList.add(sweet);
    }

    public double calculateWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweetsList) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public void sortSweets(Comparator<Sweet> comparator) {
        Collections.sort(sweetsList, comparator);
    }

    public List<Candy> findCandyByChocolateContent(double min, double max) {
        List<Candy> result = new ArrayList<>();
        for (Sweet sweet : sweetsList) {
            if (sweet instanceof Candy) {
                Candy candy = (Candy) sweet;
                if (candy.getChocolateContent() >= min && candy.getChocolateContent() <= max) {
                    result.add(candy);
                }
            }
        }
        return result;
    }
}
