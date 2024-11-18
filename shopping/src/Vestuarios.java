public class Vestuarios extends Loja {
    private boolean produtosImportados;

    public Vestuarios(String nome, int quantidadeFuncionarios, float salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + ", " +
                "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + ", " +
                "Salário Base: " + super.getSalarioBaseFuncionarios() + ", " +
                "Endereço: " + super.getEndereco() + ", " +
                "Data de Fundação: " + super.getDataFundacao() + ", " +
                "Vende produtos importados: " + this.produtosImportados;
    }

}
