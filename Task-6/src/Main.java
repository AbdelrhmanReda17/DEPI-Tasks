import Components.*;
public class Main {
    public static void main(String[] args) {
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();
        Screen screen = new Screen();
        LightSystem lights = new LightSystem();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(projector, screen , soundSystem , lights);
        homeTheaterFacade.watchMovie();
    }
}