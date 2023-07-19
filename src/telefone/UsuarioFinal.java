package telefone;

import entidades.celular.AparelhoTelefonico;
import entidades.celular.Telefone;
import entidades.iphone.iPhone;
import entidades.musica.Ipod;
import entidades.musica.ReprodutorMusical;
import entidades.navegador.Safari;

public class UsuarioFinal {
    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();

        System.out.println("------------------------------------");

        Ipod ipod = new Ipod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        System.out.println("------------------------------------");

        Safari safari = new Safari();
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();

        System.out.println("------------------------------------");

        iPhone iphone = new iPhone();
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("------------------------------------");
    }
}