package ru.mishost.baseofcars.service;

import ru.mishost.baseofcars.model.Car;

/**
 * Created by zakharow on 13.03.17.
 */
public interface CarService {
    Car save(Car car);
    boolean findByLogin(String userName, String password);
    boolean findByUserName(String userName);
}
