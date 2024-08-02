public class Main {
    public static void main(String[] args) {
        GameSettings gameSetting = GameSettings.getInstance();
        System.out.println(gameSetting);

        // Change the game setting
        gameSetting.setVolume(7);
        gameSetting.setDifficulty("Hard");
        gameSetting.setScreenResolution("2560x1440");
        System.out.println(gameSetting);

        GameSettings gameSetting2 = GameSettings.getInstance();
        System.out.println(gameSetting2);

        System.out.println(gameSetting == gameSetting2);
    }
}