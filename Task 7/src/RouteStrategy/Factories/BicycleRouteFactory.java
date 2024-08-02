package RouteStrategy.Factories;

import RouteStrategy.*;

public class BicycleRouteFactory implements RouteFactory {
    @Override
    public RouteStrategy createRoute() {
        return new BicycleRoute();
    }
}
