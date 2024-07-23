package RouteStrategy.Factories;

import RouteStrategy.*;

public class CarRouteFactory implements RouteFactory {
    @Override
    public RouteStrategy createRoute() {
        return new CarRoute();
    }
}
