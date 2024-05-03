package UI;

import Data.DataManager;
import Models.User;

public class InstructorMenu extends Menu {
    public int displayMenu(User user) {
        System.out.println("Welcome " + user.getUsername());
        System.out.println("1. View Students");
        return getInput(1);
    }
    public String getLoginUserMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("----------------------------\n");
        menu.append("List of Students:\n");
        for(User student: DataManager.getUsers()){
            if(student.getType().equals("S")) menu.append("- ").append(student.getUsername()).append("\n");
        }
        menu.append("----------------------------");
        return menu.toString();
    }

}
