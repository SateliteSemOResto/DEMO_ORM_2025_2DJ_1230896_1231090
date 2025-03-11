package isep.eapli.demo_orm.dominio;

import jakarta.persistence.*;

@Entity
public class GrupoAutomovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String classe;

    public GrupoAutomovel(){}

    void setClasse(String classe) {
        this.classe = classe;
    }
    Integer nPortas;

    public void setnPortas(Integer nPortas) {
        this.nPortas = nPortas;
    }

    @Override
    public String toString() {
        return "GrupoAutomovel{" + "classe=" + classe + ", nPortas=" + nPortas + '}';
    }
}
