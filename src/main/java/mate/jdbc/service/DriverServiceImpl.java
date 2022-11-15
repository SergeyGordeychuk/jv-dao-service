package mate.jdbc.service;

import mate.jdbc.dao.DriverDao;
import mate.jdbc.model.Driver;

import java.util.List;
import java.util.Optional;

public class DriverServiceImpl implements DriverService{
    private DriverDao driverDao;
    @Override
    public Driver create(Driver driver) {
        return driverDao.create(driver);
    }

    @Override
    public Optional<Driver> get(Long id) {
        return driverDao.get(id);
    }

    @Override
    public List<Driver> getAll() {
        return driverDao.getAll();
    }

    @Override
    public Driver update(Driver driver) {
        return driverDao.update(driver);
    }

    @Override
    public boolean delete(Long id) {
        return driverDao.delete(id);
    }
}