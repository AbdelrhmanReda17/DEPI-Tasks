package RouteStrategy;

public class WalkingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String startLocation, String endLocation) {
        System.out.println("Building walking route from " + startLocation + " to " + endLocation);
    }
}
