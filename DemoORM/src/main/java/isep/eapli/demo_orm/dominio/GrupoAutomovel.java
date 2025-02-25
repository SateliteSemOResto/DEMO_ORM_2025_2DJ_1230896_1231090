package isep.eapli.demo_orm.dominio;

public class GrupoAutomovel {
    String classe;

    void setClasse(String classe) {
        this.classe = classe;
    }
    Integer nPortas;

    String matricula;

    public String getMatricula() {
        return matricula;
    }


    public void setnPortas(Integer nPortas) {
        this.nPortas = nPortas;
    }

    @Override
    public String toString() {
        return "GrupoAutomovel{" + "classe=" + classe + ", nPortas=" + nPortas + "matricula"+ matricula +'}';
    }
}
