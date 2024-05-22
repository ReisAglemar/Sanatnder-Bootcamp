package edu.reis.desafiocontrolefluxo;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    /**
     *
     * @param parametroUm PRIMEIRO parâmetro inserido pelo usuário
     * @param parametroDois SEGUNDO parâmetro inserido pelo usuário
     * @throws ParametrosInvalidosException validar se parametroUm é MAIOR que
     * parametroDois, se sim, lançar a exceção
     *
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;

        if (parametroUm >= parametroDois) {

            throw new ParametrosInvalidosException();

        } else {

            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }

    }
}
