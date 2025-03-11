/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.aplicacao;

import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import isep.eapli.demo_orm.persistencia.GrupoAutomovelRepositorio;
import isep.eapli.demo_orm.persistencia.GrupoAutomovelRepositorioJPAImpl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eapli
 */
public class GrupoAutomovelController {

    GrupoAutomovelRepositorioJPAImpl repo = new GrupoAutomovelRepositorioJPAImpl();

    public GrupoAutomovel registarGrupoAutomóvel(String nome, int portas,
            String classe) {
        GrupoAutomovel grupo1 = new GrupoAutomovel(nome, portas, classe);
        GrupoAutomovelRepositorio repo = new GrupoAutomovelRepositorioJPAImpl();
        return repo.add(grupo1);
    }
    
    public List<GrupoAutomovel> listarGruposAutomoveis() {
		return repo.findAll();
	}

    public GrupoAutomovel encontrarPorId(long id){
        return repo.findById(id);
    }

	public GrupoAutomovel procurarGrupoAutomovel(long id) {
		throw new UnsupportedOperationException("Ainda não implementada");
	}

}
