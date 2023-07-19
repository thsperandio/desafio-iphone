package entidades.celular;

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("DEIXANDO MENSAGEM DE VOZ");
    }
}
