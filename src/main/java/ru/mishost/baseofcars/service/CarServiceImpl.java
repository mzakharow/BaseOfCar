package ru.mishost.baseofcars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mishost.baseofcars.model.Car;
import ru.mishost.baseofcars.repository.CarRepository;

/**
 * Created by zakharow on 13.03.17.
 */
@Service("carService")
public class CarServiceImpl implements CarService {

    //@Qualifier("carRepository")

    @Autowired
    private CarRepository carRepository;

    @Transactional
    public Car save(Car car) {
        return carRepository.save(car);
    }

    public boolean findByLogin(String userName, String password) {
        Car car = carRepository.findByUserName(userName);

        if(car != null && car.getPassword().equals(password)) {
            return true;
        }

        return false;
    }

    public boolean findByUserName(String userName) {
        Car car = carRepository.findByUserName(userName);

        if(car != null) {
            return true;
        }

        return false;
    }

}
