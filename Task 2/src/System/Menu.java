package System;

import System.Items.Addition;
import System.Items.Burger;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static Menu instance;
    private final List<Item> menuItems;
    private final List<Addition> additions;
    private Menu() {
        this.menuItems = new ArrayList<>();
        this.additions = new ArrayList<>();
        initializeMenu();
    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    private void initializeMenu() {
        addMenuItem(new Burger("Beef Burger", 20.00));
        addMenuItem(new Burger("Chicken Burger", 30.00));
        addMenuItem(new Burger("Cheese Burger", 15.00));

        addAddition(new Addition("Catchup", 2.50));
        addAddition(new Addition("Mayonnaise", 5.00));
        addAddition(new Addition("Tomatoes", 4.75));
        addAddition(new Addition("Cheese", 10.00));
    }


    public void addMenuItem(Item menuItem) {
        menuItems.add(menuItem);
    }

    public void removeMenuItem(Item menuItem) {
        menuItems.remove(menuItem);
    }

    public void addAddition(Addition addition) {
        additions.add(addition);
    }

    public void removeAddition(Addition addition) {
        additions.remove(addition);
    }

    public List<Item> getMenuItems() {
        return menuItems;
    }

    public List<Addition> getAdditions() {
        return additions;
    }

    public void displayMenu() {
        System.out.println("Menu Items:");
        int i = 1;
        for (Item menuItem : menuItems) {
            System.out.println(" " +  i + " " +menuItem.getName() + " - $" + menuItem.getCost());
            i++;
        }
    }
    public void displayAdditions() {
        System.out.println("Additions:");
        int i = 1;
        for (Addition addition : additions) {
            System.out.println(" " +  i + " " + addition.getName() + " - $" + addition.getCost());
            i++;
        }
    }
}

