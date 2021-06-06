package web.DAO;

import web.model.Car;

import java.util.List;

public interface DAOCar {
    List<Car> allCar();
    List<Car> getCar(int count);
}
