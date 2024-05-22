package tarefa_m19;


@Tabela(value = "nomes") 
public class Nomes {

    private String nome;

    public Nomes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
