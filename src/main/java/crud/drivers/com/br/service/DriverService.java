package crud.drivers.com.br.service;

import crud.drivers.com.br.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    private DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
}
