public class Cosmeticos extends Loja {
    private double taxaDeComercializacao;

    public Cosmeticos(String nome, int quantidadeFuncionarios, float salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, double taxaDeComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao);
        this.taxaDeComercializacao = taxaDeComercializacao;
    }

    public double getTaxaDeComercializacao() {
        return this.taxaDeComercializacao;
    }

    public void setTaxaDeComercializacao(double taxaDeComercializacao) {
        this.taxaDeComercializacao = taxaDeComercializacao;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + ", " +
                "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + ", " +
                "Salário Base: " + super.getSalarioBaseFuncionarios() + ", " +
                "Endereço: " + super.getEndereco() + ", " +
                "Data de Fundação: " + super.getDataFundacao() + ", " +
                "Taxa de Comercialização: " + this.taxaDeComercializacao;
    }

}
