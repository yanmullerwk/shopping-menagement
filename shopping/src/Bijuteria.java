public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, float salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + ", " +
                "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + ", " +
                "Salário Base: " + super.getSalarioBaseFuncionarios() + ", " +
                "Endereço: " + super.getEndereco() + ", " +
                "Data de Fundação: " + super.getDataFundacao() + ", " +
                "meta de Vendas: " + this.metaVendas;
    }
}
