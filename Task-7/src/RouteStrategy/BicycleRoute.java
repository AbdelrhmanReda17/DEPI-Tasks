package RouteStrategy;

public class BicycleRoute implements RouteStrategy {
    @Override
    public void buildRoute(String startLocation, String endLocation) {
        System.out.println("Building bicycle route from " + startLocation + " to " + endLocation);
    }
}
