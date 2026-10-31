package src.mapstruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {

	private String make;
	private int numberOfSeats;
	private CarType type;
	private int horsePower;
	private double fuelConsumptionInLiters;

	public Car(String make, int numberOfSeats, CarType type, int horsePower, double fuelConsumptionInLiters) {
		this.make = make;
		this.numberOfSeats = numberOfSeats;
		this.type = type;
		this.horsePower = horsePower;
		this.fuelConsumptionInLiters = fuelConsumptionInLiters;
	}
}
