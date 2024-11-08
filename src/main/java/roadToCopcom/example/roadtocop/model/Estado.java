package roadToCopcom.example.roadtocop.model;


import jakarta.persistence.*;

@Entity
@Table(name="ESTADO")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CODIGO")
    private Long id;

    @Column(name="NOME")
    private String nome;

    @Column(name="REGIAO_ID")
    private String etnia;

    @Column(name="ESTADO_CODIGO")
    private String estadoCodigo;
}
