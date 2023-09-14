package ir.javacup.onlinetaxi;

public class VipTripMethod implements TripMethod {

    @Override
    public int calcPrice(TripParam params) {

        int Price = 0;
        int basePrice = 10000;
        if((!params.isPeakTime()) && (params.isRainy())&& params.getSource()<5 && params.getDestination()<5){
            Price= basePrice * 2 * DistanceMap.distance[params.getSource()][params.getDestination()];
        } else if ((params.isPeakTime()) && (!params.isRainy())&& params.getSource()<5 && params.getDestination()<5) {
            Price= basePrice * 2 * DistanceMap.distance[params.getSource()][params.getDestination()];
        } else if ((params.isPeakTime()) && (params.isRainy())&& params.getSource()<5 && params.getDestination()<5) {
            Price= basePrice *3 *DistanceMap.distance[params.getSource()][params.getDestination()];
        }else {
            return -1;
        }
        return Price;
    }
}
