import Models.User;
import UI.Menu;
import UI.MenuFactory;

public class ApplicationManager {
    User dummyUser;
    Menu menu;
    public void startApplication() {
        while(true) {
            int choice = Menu.startMenu();
            switch (choice) {
                case 1:
                    dummyUser = Authentication.Register();
                    break;
                case 2:
                    dummyUser = Authentication.Login();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
            }
            if(dummyUser == null) continue;
            menu = MenuFactory.createMenu(dummyUser.getType());
            displayUserMenu();
        }
    }

    public void displayUserMenu(){
        while (true) {
            int choice = menu.displayMenu(dummyUser);
            if(choice == 0) break;
            if (choice == 1) System.out.println(menu.getLoginUserMenu());
        }
    }
}
