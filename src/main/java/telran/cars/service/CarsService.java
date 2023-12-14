package telran.cars.service;

import java.util.List;
import telran.cars.dto.*;

public interface CarsService {
	PersonDto addPerson(PersonDto person);

	CarDto addCar(CarDto carDto);

	PersonDto updatePerson(PersonDto personDto);

	PersonDto deletePerson(long io);

	CarDto deleteCar(String carNumber);

	TradeDealDto purchase(TradeDealDto tradeDeal);

	List<CarDto> getOwnerCars(long id);

	PersonDto getCarOwner(String carNumber);
}
