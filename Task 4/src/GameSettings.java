public class GameSettings {
    private static volatile GameSettings instance;
    private String difficulty;
    private int volume;
    private String screenResolution;

    private GameSettings(String difficulty, int volume, String resolution) {
        this.difficulty = difficulty;
        this.volume = volume;
        this.screenResolution = resolution;
    }


    public static GameSettings getInstance() {
        GameSettings result = instance;
        if (result == null) {
            synchronized (GameSettings.class) {
                result = instance;
                if (result == null) {
                    instance = result = new GameSettings("Easy", 5, "1920x1080");
                }
            }
        }
        return result;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public  void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setScreenResolution(String resolution) {
        this.screenResolution = resolution;
    }
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Game Settings : [" +
                "Difficulty = '" + difficulty + '\'' +
                ", Volume = " + volume +
                ", Screen Resolution = '" + screenResolution + '\'' +
                ']';
    }
}
