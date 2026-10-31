package src.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	@Mapping(source = "fuelConsumptionInLiters", target = "fuelConsumptionInGallons", qualifiedByName = "carTypeToGallons")
	CarDto mapCarToCarDto(Car car);

	default CarDto carToCarDto(Car car, Long id) {
		CarDto dto = mapCarToCarDto(car);
		return new CarDto(id, dto.getMake(), dto.getSeatCount(), dto.getType(), dto.getHorsePower(), dto.getFuelConsumptionInGallons());
	}

	Car carDtoToCar(CarDto carDto);

	@Named("carTypeToGallons")
	static double litersToGallons(double liters) {
		return liters * 0.264172;
	}
}
