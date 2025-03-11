/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.apresentacao;

import isep.eapli.demo_orm.aplicacao.GrupoAutomovelController;
import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import isep.eapli.demo_orm.util.Console;

import java.sql.SQLOutput;

/**
 *
 * @author mcn
 */
public class GrupoAutomovelUI {

    private final GrupoAutomovelController controller = new GrupoAutomovelController();
    
    public void registarGA() {
        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");
        GrupoAutomovel grupoAutomovel = controller.
                registarGrupoAutomóvel(nome, portas, classe);
        System.out.println("Grupo Automóvel" + grupoAutomovel);
    }
    public void listarGAs() {
		        System.out.println("*** Lista de Grupos Automóveis ***\n");
        for(GrupoAutomovel ga : controller.listarGruposAutomoveis()) {
            System.out.println(ga);
        }
    }

	public void procurarGAPorID() {
        long id = Console.readInteger("Id");
		System.out.println("*** Procurar Grupo Automóvel por ID ***\n");
        GrupoAutomovel ga = controller.encontrarPorId(id);
        System.out.println(ga);
	}
}
