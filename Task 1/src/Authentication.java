import Data.DataManager;
import Models.ModelsFactory;
import Models.User;
import UI.Menu;

import java.util.AbstractMap;

public class Authentication {
    static public User Register(){
        User dummyUser = null;
        String type = Menu.getType(); // S for student, I for instructor
        AbstractMap.SimpleEntry<String,String> enteredCredentials =  Menu.getCredentials();    // username and password
        if(DataManager.isUserRegistered(enteredCredentials.getKey())) System.out.println("Username already exists!");
        else dummyUser = ModelsFactory.createModel(enteredCredentials.getKey(), enteredCredentials.getValue(), type);
        DataManager.addUser(dummyUser);
        return dummyUser;
    }
    static public User Login(){
        AbstractMap.SimpleEntry<String,String> enteredCredentials =  Menu.getCredentials();    // username and password
        if(DataManager.isPasswordCorrect(enteredCredentials.getKey(), enteredCredentials.getValue())) {
            return DataManager.getUser(enteredCredentials.getKey());
        }
        else System.out.println("Invalid username or password!");
        return null;
    }
}
