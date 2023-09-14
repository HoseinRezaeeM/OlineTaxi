package ir.javacup.onlinetaxi;

public class TripParam {

	private int source;
	private int destination;
	private boolean peakTime;
	private boolean rainy;
	public TripParam(){}

	public TripParam(int source, int destination, boolean peakTime, boolean rainy) {
		this.source = source;
		this.destination = destination;
		this.peakTime = peakTime;
		this.rainy = rainy;
	}


	@Override
	public String toString() {
		return "TripParam : " +
				"source = " + source +
				", destination = " + destination +
				", peakTime = " + peakTime +
				", rainy = " + rainy +
				"---->\n";
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public boolean isPeakTime() {
		return peakTime;
	}

	public void setPeakTime(boolean peakTime) {
		this.peakTime = peakTime;
	}

	public boolean isRainy() {
		return rainy;
	}

	public void setRainy(boolean rainy) {
		this.rainy = rainy;
	}
}
