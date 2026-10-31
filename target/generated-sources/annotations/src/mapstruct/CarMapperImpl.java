package src.mapstruct;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-31T11:26:45+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.20.1 (Microsoft)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto mapCarToCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        int seatCount = 0;
        double fuelConsumptionInGallons = 0.0d;
        String make = null;
        String type = null;
        int horsePower = 0;

        seatCount = car.getNumberOfSeats();
        fuelConsumptionInGallons = CarMapper.litersToGallons( car.getFuelConsumptionInLiters() );
        make = car.getMake();
        if ( car.getType() != null ) {
            type = car.getType().name();
        }
        horsePower = car.getHorsePower();

        Long id = null;

        CarDto carDto = new CarDto( id, make, seatCount, type, horsePower, fuelConsumptionInGallons );

        return carDto;
    }

    @Override
    public Car carDtoToCar(CarDto carDto) {
        if ( carDto == null ) {
            return null;
        }

        String make = null;
        CarType type = null;
        int horsePower = 0;

        make = carDto.getMake();
        if ( carDto.getType() != null ) {
            type = Enum.valueOf( CarType.class, carDto.getType() );
        }
        horsePower = carDto.getHorsePower();

        int numberOfSeats = 0;
        double fuelConsumptionInLiters = 0.0d;

        Car car = new Car( make, numberOfSeats, type, horsePower, fuelConsumptionInLiters );

        return car;
    }
}
