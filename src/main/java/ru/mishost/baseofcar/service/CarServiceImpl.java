package ru.mishost.baseofcar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mishost.baseofcar.model.Car;
import ru.mishost.baseofcar.repository.CarRepository;

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
