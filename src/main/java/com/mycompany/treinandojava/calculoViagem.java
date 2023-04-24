
package com.mycompany.treinandojava;

import java.util.Scanner;

public class calculoViagem {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao calculator, calculador de gastos de viagem :");
        System.out.println("Muito obrigado por usar nosso programa!!");

        int resposta;
        do {
            System.out.println("Fazer um novo calculo?: 1_ sim  2_ não ");
            resposta = ler.nextInt();

            switch (resposta) {

                case 1:
                    System.out.println("Digite a distância em kilômetros: ");
                    double distanciaKm = ler.nextDouble();

                    System.out.println("Selecione o combustivel: Gasolina-1 , Álcool-2 ");
                    int selCombustivel = ler.nextInt();

                    if (selCombustivel == 1) {
                        System.out.println("Combustivel selecionado, Gasolina: ");

                        System.out.println("Digite a média do veiculo na cidade km/l : ");
                        double mediaCidade = ler.nextDouble();
                        System.out.println("Digite a média do veiculo na estrada km/l : ");
                        double mediaEstrada = ler.nextDouble();

                        System.out.println("Digite o valor da Gasolina :");
                        double combustivel = ler.nextDouble();

                        double mediaPadrao = (mediaCidade + mediaEstrada) / 2;
                        double valorEmCombustivel = (distanciaKm / mediaPadrao) * combustivel;
                        System.out
                                .println("A média geral do veiculo é de " + mediaPadrao + "km por litro na Gasolina :");
                        System.out.printf("O valor gasto na viagem é de R$ %.2f.%n", valorEmCombustivel);

                    } else {
                        System.out.println("Combusitvel selecionado, Álcool :");

                        System.out.println("Digite a média do veiculo na cidade km/l : ");
                        double mediaCidade = ler.nextDouble();
                        System.out.println("Digite a média do veiculo na estrada km/l : ");
                        double mediaEstrada = ler.nextDouble();

                        System.out.println("Digite o valor do Álcool :");
                        double combustivel = ler.nextDouble();

                        double mediaPadrao = (mediaCidade + mediaEstrada) / 2;
                        double valorEmCombustivel = (distanciaKm / mediaPadrao) * combustivel;
                        System.out.println("A média geral do veiculo é de " + mediaPadrao + "km por litro no Álcool :");
                        System.out.printf("O valor gasto na viagem é de R$ %.2f.%n", valorEmCombustivel);

                    }
                    break;

                case 2:
                    System.out.println("Obrigado pela preferência!! : ");
                    break;

                default:
                    System.out.println("Opção inválida, por favor escolha uma opção válida: ");
                    break;

            }

        } while (resposta != 2);
    }
}
