package UI;

public class MenuFactory {
    static public Menu createMenu(String menuType) {
        if (menuType.equals("I")) {
            return new InstructorMenu();
        } else if (menuType.equals("S")) {
            return new StudentMenu();
        }
        return null;
    }
}
