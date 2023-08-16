package dev.lists;

import java.util.ArrayList;
import java.util.List;

record GroceryItem(String name, String type, int count) {

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Main {

    public static void main(String[] args) {
//        GroceryItem groceries = new GroceryItem("milk", "beverages", 4);
//        System.out.println(groceries);

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("apples", "produce", 3));
        groceryList.add(new GroceryItem("milk", "dairy", 4));
        groceryList.add(0, new GroceryItem("chocolate", "dairy", 2));

        System.out.println(groceryList);
        System.out.println("second item = " + groceryList.get(1));

        System.out.println(groceryList.get(1));

        List<String> list = List.of("cake", "pie", "donuts");
        System.out.println(list);
    }
}
