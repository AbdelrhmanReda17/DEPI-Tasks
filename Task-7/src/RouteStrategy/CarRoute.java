package RouteStrategy;

public class CarRoute implements RouteStrategy {
    @Override
    public void buildRoute(String startLocation, String endLocation) {
        System.out.println("Building car route from " + startLocation + " to " + endLocation);
    }
}
