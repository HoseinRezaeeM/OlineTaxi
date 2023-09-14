package ir.javacup.onlinetaxi;

public class Main {
    public static void main(String[] args) {
        TripParam tripParam=new TripParam();
        tripParam.setSource(4);
        tripParam.setDestination(0);
        tripParam.setRainy(true);
        tripParam.setPeakTime(false);




        TripMethod tripMethodVip=new VipTripMethod();
        TripMethod tripMethodEconomic=new EconomicTripMethod();
        TripMethod tripMethodBike=new BikeTripMethod();
        System.out.println("\n------Online Taxi --------\n");
        System.out.println(tripParam.toString());
        System.out.println("Price VipTripMethod : "+tripMethodVip.calcPrice(tripParam));
        System.out.println("Price EconomicTripMethod : "+tripMethodEconomic.calcPrice(tripParam));
        System.out.println("Price BikeTripMethod : "+tripMethodBike.calcPrice(tripParam));
    }
}
