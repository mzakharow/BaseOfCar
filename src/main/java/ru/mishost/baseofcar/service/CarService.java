package ru.mishost.baseofcar.service;

import ru.mishost.baseofcar.model.Car;

/**
 * Created by zakharow on 13.03.17.
 */
public interface CarService {
    Car save(Car car);
    boolean findByLogin(String userName, String password);
    boolean findByUserName(String userName);
}
