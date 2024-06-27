package tarefa_m13;

public class PessoaFisica extends Pessoa{
    
    private String cpf;
    
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public String getDocIdentificacao() {
        return cpf;
    }

    @Override
    public void setDocIdentificacao(String cpf) {
        this.cpf = cpf;
    }
}
