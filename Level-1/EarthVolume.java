import java.lang.Math;

class EarthVolume {
	public static void main(String[] args) {
		double radiusOfEarthInKilo = 6378;
		double radiusOfEarthInMiles = radiusOfEarthInKilo * 0.621371;
		double pi = Math.PI;
		double volumeOfEarthInKilo = (4.0 / 3.0) * pi * Math.pow(radiusOfEarthInKilo, 3);
		double volumeOfEarthInMiles = (4.0 / 3.0) * pi * Math.pow(radiusOfEarthInMiles, 3);
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKilo + " and cubic miles is "
				+ volumeOfEarthInMiles);
	}
}