/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.reis.zonadetestes.finall;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reis
 */
public class ZonaDeTestes {

    public static void main(String[] args) {

//-------------------------- CASE E BREAK --------------------------------------
//
//        String plano = "T"; // M / T
//        switch (plano) {
//            case "T": {
//                System.out.println("5Gb Youtube");
//            }
//            case "M": {
//                System.out.println("Whats e Intagram grátis");
//
//            }
//            case "B": {
//                System.out.println("100 minutos de ligação");
//            }
//        }
//------------------------------------------------------------------------------
//---------------------- PRÉ E PÓS INCRMENTO -----------------------------------
//
//        int teste = 10;
//
//        for (int i = 0; i < teste; i++) {
//            System.out.println(i + " apenas i");
//            System.out.println(++i + " incrementa é imprime será um a mais que aciima");
//            System.out.println(i++ + "será igual acima depois mais um");
//            System.out.println(i + " ");
//
//        }
//------------------------------------------------------------------------------
//-------------------------- CASE E BREAK --------------------------------------
//
//        boolean teste = false;
//
//        String reposta = (teste) ? "true" : "false";
//        System.out.println(reposta);
//        for (int x = 0; x < 10; x++) {
//            if (x == 6) continue;
//            if (x == 8) break;
//            switch (x) {
//            case 0:
//                System.out.println("zero");
//                continue;
////                  break;
//            case 1:
//                System.out.println("um");
////                continue;
//                  break;
//            case 2:
//                System.out.println("dois");
//                break;
//            default:
//                System.out.println(x);
//                break;
//            }
//        }
//------------------------------------------------------------------------------
//----------------- FIZZ BUZZ COM O USO DE CONTINUE ----------------------------
//
//        int numero = 100;
//
//        for (int i = 0; i < numero; i++) {
//
//            boolean dividePor3 = (i % 3 == 0);
//            boolean dividepor5 = (i % 5 == 0);
//
//            if (dividePor3 && dividepor5) {
//                System.out.println("FIZZ BUZZ");
//                continue;
//            }
//            if (dividePor3) {
//                System.out.println("FIZZ");
//                continue;
//            }
//            if (dividepor5) {
//                System.out.println("BUZZ");
//                continue;
//            }
//            System.out.println(i);
//
//        }
//------------------------------------------------------------------------------
//----------------------------- TRY CATCH --------------------------------------
//
//        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//
//        int numero;
//
//        do {
//
//            try {
//
//                System.out.println("Digite seu nome");
//                String nome = scanner.next();
//
//                System.out.println("Digite seu sobrenome");
//                String sobrenome = scanner.next();
//
//                System.out.println("Digite sua idade");
//                int idade = scanner.nextInt();
//
//                System.out.println("Digite sua altura");
//                double altura = scanner.nextDouble();
//
//                //imprimindo os dados obtidos pelo usuario
//                System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
//                System.out.println("Tenho " + idade + " anos ");
//                System.out.println("Minha altura é " + altura + "cm ");
//                scanner.close();
//                numero = 0;
//
//            } catch (Exception e) {
//                String resposta = """
//                                 Que pena, algo não saiu conforme o esperado :/
//                              
//                              Por gentileza, verifique os valores digitados.
//                              Siga o seguinte padrão:
//                              Para nome insira letras;
//                              Para sobrenome insira letras;
//                              Para idade insira um número inteiro;
//                              Para alutra use o ponto na parte fracionada.
//                                  
//                              Digite 1 para tentar novamente ou 0 para sair.    
//                              """;
//                System.out.println(resposta);
//                scanner.nextLine(); // hô glória
//
//                try {
//                    numero = scanner.nextInt();
//                } catch (Exception f) {
//                    System.out.println("Desculpe, não coseguir entender!");
//                    System.out.println("Reinicie a aplicação!");
//                    numero = 0;
//                } finally {
//                }
//
//            } finally {
//            }
//        } while (numero != 0);
//
//        System.out.println("Programa Finalizado!");
//------------------------------------------------------------------------------
//----------------------- SINTAXE E SEMANTICA ----------------------------------
////
//        int numero1 = 5;
//        int numero2 = 2;
//        int resultado = numero1 / numero2;
//
//        float numero1F = 5;
//        float numero2F = 2;
//        float resultadoF = numero1F / numero2F;
//
//        float resultadoCast = (((float) numero1) / ((float) numero2));
//        Thread.dumpStack();
//        System.out.println(resultado);
//        System.out.println(resultadoF);
//        System.out.println(resultadoCast);
//------------------------------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        double nota = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);

            try {
                nota = scanner.nextDouble();
            } catch (Exception InputMismatchException) {
                System.out.println("informe apenas números");
            } 
                soma += nota;
           

        }

        return soma / alunos.length;
    }

}
