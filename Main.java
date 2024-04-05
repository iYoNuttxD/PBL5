package PBL5;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Equipe: Daniel Ganz Musse, João Vitor de Souza Hernandes, " +
                "Pedro Henrique Silva Cabral, Fabio Augusto Gortz");

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("---------- BEM VINDO ----------");
                System.out.println("O que você deseja fazer?");
                System.out.println("1. Cadastrar Produto");
                System.out.println("2. Descadastrar Produto");
                System.out.println("3. Visualizar Estoque");
                System.out.println("0. Sair");
                String opcao = scanner.nextLine();
                if (opcao.equals("1")) {
                    System.out.println("Implementar cadastrar produto");
                } else if (opcao.equals("2")){
                    System.out.println("Implementar descadastrar produto");
                } else if (opcao.equals("3")) {
                    System.out.println("Implementar visualizar estoque");
                } else if (opcao.equals("0")){
                    System.out.println("Obrigado por usar o sistema!!!");
                    break;
                } else {
                    System.out.println("Opção inválida!!!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }

    }
}
