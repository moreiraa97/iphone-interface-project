

import aparelho.aparelhotelefonico.TelefoneInterface;
import aparelho.navegadorinternet.NavegadorInterface;
import aparelho.reprodutormusical.ReprodutorInterface;


public class AparelhoCelular implements TelefoneInterface, NavegadorInterface, ReprodutorInterface {

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz.");
        
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o numero: " + numero);
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página.");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica.");
        
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecionando a musica: " + nome);
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica");
        
    }
    

    

}
