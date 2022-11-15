package mate.jdbc.service;

import mate.jdbc.dao.ManufacturerDao;
import mate.jdbc.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public class ManufacturerServiceImpl implements ManufacturerService{
    private ManufacturerDao manufacturerDao;
    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        return manufacturerDao.create(manufacturer);
    }

    @Override
    public Optional<Manufacturer> get(Long id) {
        return manufacturerDao.get(id);
    }

    @Override
    public List<Manufacturer> getAll() {
        return manufacturerDao.getAll();
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        return manufacturerDao.update(manufacturer);
    }

    @Override
    public boolean delete(Long id) {
        return manufacturerDao.delete(id);
    }
}
