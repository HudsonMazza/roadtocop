package roadToCopcom.example.roadtocop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="REGIAO")
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_REGIAO")
    private Long id;

    @Column(name="NOME")
    private String nome;

}
