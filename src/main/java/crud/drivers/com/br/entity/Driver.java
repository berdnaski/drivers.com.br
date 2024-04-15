package crud.drivers.com.br.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_drivers")
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "cpf")
    private String cpf;
}
