package src.mapstruct;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CarDto {
	private final Long id;
	private final String make;
	private final int seatCount;
	private final String type;
	private final int horsePower;
	private final double fuelConsumptionInGallons;

	public CarDto(Long id, String make, int seatCount, String type, int horsePower, double fuelConsumptionInGallons) {
		this.id = id;
		this.make = make;
		this.seatCount = seatCount;
		this.type = type;
		this.horsePower = horsePower;
		this.fuelConsumptionInGallons = fuelConsumptionInGallons;
	}

}
