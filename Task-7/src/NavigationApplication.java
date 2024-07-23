import RouteStrategy.RouteStrategy;

import java.util.Map;

public class NavigationApplication {
    private  RouteStrategy routeStrategy;
    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
    public void buildRoute(String start, String end) {
        if(routeStrategy == null)
            throw new IllegalStateException("Route strategy is not set");
        routeStrategy.buildRoute(start, end);
    }
}
