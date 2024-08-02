package RouteStrategy;

public class PublicTransportRoute implements RouteStrategy {
    public void buildRoute(String startLocation, String endLocation) {
        System.out.println("Building public transport route from " + startLocation + " to " + endLocation);
    }
}
