package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public List<Car> getCarList(Integer count) {
        if (count == null) return carDao.getCars();
        return carDao.getCars().stream().limit(count).toList();
    }
}
