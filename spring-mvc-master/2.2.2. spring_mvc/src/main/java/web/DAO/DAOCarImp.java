package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DAOCarImp implements DAOCar {

    private List<Car> car;
    {
        car = new ArrayList<>();
        car.add(new Car("BMW", "7", "black"));
        car.add(new Car("Mers", "GLE", "white"));
        car.add(new Car("AUDI", "Q7", "red"));
        car.add(new Car("VOLVO", "XC90", "yellow"));
        car.add(new Car("LADA", "Vesta", "brown"));
    }

    @Override
    public List<Car> allCar() {
        return car;
    }

    @Override
    public List<Car> getCar(int count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }
}
