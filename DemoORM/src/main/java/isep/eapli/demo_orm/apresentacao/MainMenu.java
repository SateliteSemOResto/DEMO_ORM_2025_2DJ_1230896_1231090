/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.apresentacao;

import isep.eapli.demo_orm.util.Console;

/**
 *
 * @author mcn
 */
public class MainMenu {

    public static void mainLoop() {
        int opcao = 0;
        GrupoAutomovelUI grupoAutomovelUI = new GrupoAutomovelUI();
        do {
            opcao = menu();

            switch (opcao) {
                case 0:
                    System.out.println("fim ...");
                    break;
                case 1:
                    grupoAutomovelUI.registarGA();
                    break;

                case 2:
                    grupoAutomovelUI.listarGAs();
                    break;

                case 3:
                    grupoAutomovelUI.procurarGAPorID();
                    break;

                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 0);

    }

    private static int menu() {
        int option = -1;
        System.out.println("");
        System.out.println("=============================");
        System.out.println(" Rent a Car ");
        System.out.println("=============================\n");
        System.out.println("1.Registar Grupo Automóvel");
        System.out.println("2.Listar todos os Grupos Automóveis");
        System.out.println("3.Procurar Grupo Automóvel por ID");
        System.out.println("=============================");
        System.out.println("0. Sair\n\n");
        option = Console.readInteger("Por favor escolha opção");
        return option;
    }
}
