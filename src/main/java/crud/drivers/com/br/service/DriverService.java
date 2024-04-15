package crud.drivers.com.br.service;

import crud.drivers.com.br.dto.CreateDriverDTO;
import crud.drivers.com.br.entity.Driver;
import crud.drivers.com.br.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public UUID createDriver(CreateDriverDTO createDriverDTO) {
        var entity = new Driver(
                UUID.randomUUID(),
                createDriverDTO.name(),
                createDriverDTO.email(),
                createDriverDTO.cpf(),
                Instant.now(),
                null
        );
        var driverSaved = driverRepository.save(entity);
        return driverSaved.getId();
    }

    public Optional<Driver> getDriverById(String id) {
        return driverRepository.findById(UUID.fromString(id));
    }
}
