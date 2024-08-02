import RouteStrategy.*;
import RouteStrategy.Factories.*;

public class Main {
    public static void main(String[] args) {
        RouteFactory RouteFactory;
        NavigationApplication app = new NavigationApplication();

        RouteFactory = new CarRouteFactory();
        app.setRouteStrategy(RouteFactory.createRoute());
        app.buildRoute("A", "B");

        RouteFactory = new PublicTransportRouteFactory();
        app.setRouteStrategy(RouteFactory.createRoute());
        app.buildRoute("A", "B");

        RouteFactory = new WalkingRouteFactory();
        app.setRouteStrategy(RouteFactory.createRoute());
        app.buildRoute("A", "B");

        RouteFactory = new BicycleRouteFactory();
        app.setRouteStrategy(RouteFactory.createRoute());
        app.buildRoute("A", "B");

    }
}