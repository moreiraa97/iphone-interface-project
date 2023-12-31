package aparelho.navegadorinternet;

public class NavegadorAbstract implements NavegadorInterface{

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

    

    
}
