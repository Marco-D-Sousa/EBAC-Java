public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public String getDocIdentificacao() {
        return cnpj;
    }

    @Override
    public void setDocIdentificacao(String cnpj) {
        this.cnpj = cnpj;
    }
}
