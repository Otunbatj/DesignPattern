package builder.meal;

import builder.items.Item;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float getCost() {
        float sum = 0f;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }

    public void showItems() {
        items.forEach(item -> System.out.printf("Item: %s\tPacking: %s\tPrice: %f%n", item.name(), item.packing().packing(), item.price()));
    }
}
