package ru.mishost.baseofcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mishost.baseofcars.model.Car;

/**
 * Created by zakharow on 13.03.17.
 */
@Repository("carRepository")
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("select s from Car s where s.userName = :userName")
    Car findByUserName(@Param("userName") String userName);

}
