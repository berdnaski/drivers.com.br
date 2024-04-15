package crud.drivers.com.br.service;

import crud.drivers.com.br.repository.TravelRepository;
import org.springframework.stereotype.Service;

@Service
public class TravelService {
    private TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }
}
