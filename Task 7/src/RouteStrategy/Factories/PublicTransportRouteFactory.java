package RouteStrategy.Factories;

import RouteStrategy.*;

public class PublicTransportRouteFactory implements RouteFactory {
    public RouteStrategy createRoute() {
        return new PublicTransportRoute();
    }
}
