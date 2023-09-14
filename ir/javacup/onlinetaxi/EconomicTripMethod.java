package ir.javacup.onlinetaxi;

public class EconomicTripMethod implements TripMethod{
    private int basePrice=5000;
    @Override
    public int calcPrice(TripParam params) {
        int Price = 0;
        if((!params.isPeakTime()) && (params.isRainy())&& params.getSource()<5 && params.getDestination()<5){
            Price= (int) (basePrice * 1.2 * DistanceMap.distance[params.getSource()][params.getDestination()]);
        } else if ((params.isPeakTime()) && (!params.isRainy())&& params.getSource()<5 && params.getDestination()<5) {
            Price= (int) (basePrice * 1.2 * DistanceMap.distance[params.getSource()][params.getDestination()]);
        } else if ((params.isPeakTime()) && (params.isRainy())&& params.getSource()<5 && params.getDestination()<5) {
            Price= (int) (basePrice * 1.4 *DistanceMap.distance[params.getSource()][params.getDestination()]);
        }
        else {
            return -1;
        }
        return Price;
    }

}
