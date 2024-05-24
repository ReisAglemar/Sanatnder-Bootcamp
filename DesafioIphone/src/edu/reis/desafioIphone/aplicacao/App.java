package edu.reis.desafioIphone.aplicacao;

import edu.reis.desafioIphone.modelo.Iphone;

/**
 * @author Reis
 * @since 24/05/24
 * @version 1.0
 *
 */
public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Prata", "13 ProMax");

        String msg = """
                -------------------------------------------------
                """;

        //Tocando ligacoes
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Numb");

        //Fazendo ligacoes
        System.out.println(msg);
        iphone.ligar("(99)12345-6789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Navegando na web
        System.out.println(msg);
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
