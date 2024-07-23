import Components.Component;

public class HomeTheaterFacade {
    private final Component projector;
    private final Component screen;
    private final Component soundSystem;
    private final Component lights;

    public HomeTheaterFacade(Component projector, Component screen , Component soundSystem , Component lights) {
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        lights.OFF();
        soundSystem.ON();
        projector.ON();
        screen.ON();
    }

    public void endMovie() {
        lights.ON();
        soundSystem.OFF();
        projector.OFF();
        screen.OFF();
    }
}
