package aparelho.reprodutormusical;

public class ReprodutorAbstract implements ReprodutorInterface {
    
    protected String nome;

    public ReprodutorAbstract(String nome){
        this.nome = nome;
    }

    @Override
    public void pausar() {
        System.out.println("Musica " + nome + " pausada.");
        
    }

    @Override
    public void selecionarMusica(String nome) {

        this.nome = nome; 

        System.out.println("Musica " + nome + " selecionada.");
        
    }

    @Override
    public void tocar() {
        System.out.println("Musica " + nome + " tocando.");
        
    }

}
