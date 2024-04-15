package crud.drivers.com.br.controller;

import crud.drivers.com.br.dto.CreateDriverDTO;
import crud.drivers.com.br.entity.Driver;
import crud.drivers.com.br.service.DriverService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/drivers")
public class DriverController {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public ResponseEntity<Driver> createDriver(@RequestBody CreateDriverDTO createDriverDTO) {
        var driverId = driverService.createDriver(createDriverDTO);
        return ResponseEntity.created(URI.create("/drivers/" + driverId)).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Driver> getDriverById(@PathVariable String id) {
        var driver = driverService.getDriverById(id);

        if(driver.isPresent()) {
            return ResponseEntity.ok(driver.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
