import java.util.Scanner;

class TravelComputation {

	public static void main(String[] args) {

		String name, fromCity, viaCity, toCity;

		double distanceFromToVia, distanceViaToFinalCity;

		int timeFromToVia, timeViaToFinalCity;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of Person Travelling : ");
		name = input.next();

		System.out.print("Enter the city from where you are Travelling: ");
		fromCity = input.next();
		System.out.print("Enter the city via you which you are Travelling : ");
		viaCity = input.next();
		System.out.print("Enter the city to destination you are Travelling to  : ");
		toCity = input.next();

		System.out.print("Enter the distanace from where you are Travelling to via : ");
		distanceFromToVia = input.nextDouble();

		System.out.print("Enter the time taken to travel from fromCity to viaCity in minutes : ");
		timeFromToVia = input.nextInt();

		System.out.print("Enter the distanace from viaCity to your destination : ");
		distanceViaToFinalCity = input.nextDouble();

		System.out.print("Enter the time taken to travel from viaCity to destination in minutes : ");
		timeViaToFinalCity = input.nextInt();

		double totalDistance = distanceFromToVia + distanceViaToFinalCity;

		int totalTime = timeFromToVia + timeViaToFinalCity;

		System.out.println("The Total Distance travelled by " + name + " from " +
				fromCity + " to " + toCity + " via " + viaCity +
				" is " + totalDistance + " km and " +
				"the Total Time taken is " + totalTime + " minutes");
		input.close();
	}
}
