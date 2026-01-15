package sangsog;

import common.Transportation;
import transportation.Bus;
import transportation.Car;
import transportation.Motorcycle;
import transportation.Train;

public class MainMethod5 {

	public static void main(String[] args) {
		
		Transportation[] transportations = {
			new Bus("고속버스"),
			new Car("소나타"),
			new Motorcycle("레플리카"),
			new Train("KTX")
		};
		
		for(Transportation a : transportations) {
			a.vehicleName();
			a.seats();
			a.speed();
		}
		System.out.println();
	}

}
