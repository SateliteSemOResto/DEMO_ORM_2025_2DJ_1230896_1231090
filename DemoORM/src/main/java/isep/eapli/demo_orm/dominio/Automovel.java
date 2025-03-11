package isep.eapli.demo_orm.dominio;

import jakarta.persistence.*;

@Entity
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Integer kms;

    public Automovel(){}

    void setKms(Integer kms) {
        this.kms = kms;
    }
}
