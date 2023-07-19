package entidades.iphone;

import entidades.celular.AparelhoTelefonico;
import entidades.musica.ReprodutorMusical;
import entidades.navegador.NavegadorNaInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {


    @Override
    public void ligar() {
        System.out.println("LIGANDO DO IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO DO IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("DEIXANDO CAIXA POSTAL DO IPHONE");
    }

    @Override
    public void tocar() {
    System.out.println("TOCANDO MÚSICA DO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA DO IPHONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA DO IPHONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO A PÁGINA DO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA DO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA DO IPHONE");
    }
}
