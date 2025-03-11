package isep.eapli.demo_orm.dominio;

import jakarta.persistence.*;

@Entity
public class GrupoAutomovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Integer nPortas;
    String nome;
    String matricula;
    String classe;

    public GrupoAutomovel(){}

    public GrupoAutomovel(String nome, int portas, String classe) {
        this.classe = classe;
        this.nPortas = portas;
        this.nome = nome;
    }

    void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMatricula() {
        return matricula;
    }


    public void setnPortas(Integer nPortas) {
        this.nPortas = nPortas;
    }

    @Override
    public String toString() {
        return "GrupoAutomovel{" + "id=" + id + ", nome=" + nome + ", classe=" + classe + ", nPortas=" + nPortas + ", matricula"+ matricula +'}';
    }
}
