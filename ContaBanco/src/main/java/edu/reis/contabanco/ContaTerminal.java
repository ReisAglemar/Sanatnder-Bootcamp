package edu.reis.contabanco;

import java.util.Scanner;

/**
 * @author Reis
 * @version 1.0
 * @since 16/05/2024
 */
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        String agencia, nomeCliente;
        int numero;
        float saldo;

        String saida = """
                      \t        _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
                      \t >>>>>>>>|                               |>>>>>>>>
                      \t >>>>>>>>|    BEM VINDO AO SEU BANCO     |>>>>>>>>
                      \t >>>>>>>>|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|>>>>>>>>
                       """.formatted();

        System.out.println("\n" + saida);

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = entradaDados.nextLine();

        System.out.println("\nSr(a) " + nomeCliente + ", digite a sua agência!");
        agencia = entradaDados.nextLine();

        System.out.println("\nÓtimo, agora precisamos saber qual é o número da sua conta");
        numero = entradaDados.nextInt();

        System.out.println("\nPor fim, informe o seu saldo, use a vígula para os centavos");
        saldo = entradaDados.nextFloat();

        mostrarInformacoes(agencia, nomeCliente, numero, saldo);
    }

    /**
     *
     * @param agencia Uma String referente a agência deve ser informada.
     * @param nomeCliente Uma String para o nome do cliente deve ser informada.
     * @param numero Um int para o número da conta deve ser informado.
     * @param saldo Um float para o saldo deve ser informado.
     */
    public static void mostrarInformacoes(String agencia, String nomeCliente,
            int numero, float saldo) {

        String saida = """
                       \t "Olá %s, obrigado por criar uma conta em nosso banco, 
                       \t sua agência é %s, conta %d e seu saldo R$ %.2f 
                       \t já está disponível para saque."
                       """.formatted(nomeCliente, agencia, numero, saldo);

        System.out.println("\n" + saida);
    }
}
