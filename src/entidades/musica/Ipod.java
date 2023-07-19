package entidades.musica;

public class Ipod implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("TOCANDO A MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO A MÚSICA");
    }
}
