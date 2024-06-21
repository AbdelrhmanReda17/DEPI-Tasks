package UI;

import Models.User;

import static UI.ConsoleInputs.getInput;

public abstract class Menu {
    abstract public int displayMenu(User user);

    abstract public String getLoginUserMenu();

    static public int startMenu() {
        System.out.println("1. Register");
        System.out.println("2. Login");
        return getInput(2);
    }
}
