package edu.reis.desafioIphone.modelo;

import edu.reis.desafioIphone.interfaces.AparelhoTelefonico;
import edu.reis.desafioIphone.interfaces.NavegadorInternet;
import edu.reis.desafioIphone.interfaces.ReprodutorMusical;


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    String modelo, cor;

    public Iphone(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     *
     * @param numero, é o número para o qual deseja-se ligar.
     */
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio voz iniciado");
    }

    /**
     *
     * @param url, é o endereço do site a qual deseja-se acessar.
     */
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    /**
     *
     * @param musica, é a música a qual deseja-se ouvir.
     */
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica);
    }
}
