package ir.javacup.onlinetaxi;

public class BikeTripMethod implements TripMethod {
    @Override
    public int calcPrice(TripParam params) {
        int Price = 0;
        int basePrice = 4000;
        if ((!params.isPeakTime()) && (params.isRainy()) && params.getSource() < 5 && params.getDestination() < 5) {
            Price = (int) (basePrice * 0.8 * DistanceMap.distance[params.getSource()][params.getDestination()]);
        } else if ((params.isPeakTime()) && (!params.isRainy()) && params.getSource() < 5 && params.getDestination() < 5) {
            Price = basePrice * 2 * DistanceMap.distance[params.getSource()][params.getDestination()];
        } else if ((params.isPeakTime()) && (params.isRainy()) && params.getSource() < 5 && params.getDestination() < 5) {
            Price = (int) (basePrice * 1.5 * DistanceMap.distance[params.getSource()][params.getDestination()]);
        } else {
            return -1;
        }
        return Price;
    }

}
