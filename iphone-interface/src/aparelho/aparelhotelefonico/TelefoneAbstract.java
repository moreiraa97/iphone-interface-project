package aparelho.aparelhotelefonico;

public class TelefoneAbstract implements TelefoneInterface{

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz.");
        
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o numero: " + numero);
        
    }


}

