package crud.drivers.com.br.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_travels")
@Data
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "drivers_id")
    private int drivers_id;
    @Column(name = "origins")
    private String origin;
    @Column(name = "arrivals")
    private String arrival;
}
