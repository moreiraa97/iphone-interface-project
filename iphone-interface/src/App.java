public class App {
    public static void main(String[] args) throws Exception {
        
        AparelhoCelular aparelho = new AparelhoCelular();

        System.out.println("---------------");
        aparelho.selecionarMusica("Lugar ao Sol, Charlie Brown Junior");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println("---------------");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(985667824);

        System.out.println("---------------");
        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();

        System.out.println("---------------");
    }
}
