package src.mapstruct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
//		UserBodyImperialValuesDTO userBodyImperialValuesDTO = new UserBodyImperialValuesDTO();
//		userBodyImperialValuesDTO.setInch(10);
//
//		UserBodyValues userBodyValues = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(userBodyImperialValuesDTO);
//
//		log.info(String.valueOf(userBodyValues.getCentimeter()));
		CarMapper carMapper = CarMapper.INSTANCE;

		Car car = new Car("Toyota", 5, CarType.SEDAN, 100, 5.5);

		CarDto carDto = carMapper.carToCarDto(car, 1L);
		System.out.println(carDto);

		Car car1 = carMapper.carDtoToCar(carDto);
		System.out.println(car1);



	}
}
