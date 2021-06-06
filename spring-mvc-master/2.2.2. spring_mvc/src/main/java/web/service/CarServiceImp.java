package web.service;

import org.springframework.stereotype.Service;
import web.DAO.DAOCarImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private DAOCarImp daoCarImp = new DAOCarImp();

    @Override
    public List<Car> allCar() {
        return daoCarImp.allCar();
    }

    @Override
    public List<Car> getCar(int count) {
        return daoCarImp.getCar(count);
    }
}
