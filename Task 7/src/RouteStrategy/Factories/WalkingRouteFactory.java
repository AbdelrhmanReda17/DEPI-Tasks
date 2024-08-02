package RouteStrategy.Factories;

import RouteStrategy.*;

public class WalkingRouteFactory implements RouteFactory {
    public RouteStrategy createRoute() {
        return new WalkingRoute();
    }
}
