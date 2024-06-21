package UI;

import Data.DataManager;
import Models.User;

public class StudentMenu extends Menu {
    public int displayMenu(User user) {
        System.out.println("Welcome " + user.getUsername());
        System.out.println("1. View Courses");
        return ConsoleInputs.getInput(1);
    }
    public String getLoginUserMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("----------------------------\n");
        menu.append("List of Courses:\n");
        for(String course: DataManager.getCourses()){
            menu.append("- ").append(course).append("\n");
        }
        menu.append("----------------------------");
        return menu.toString();
    }
}
