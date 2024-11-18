public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadFuncionarios, float salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + ", " +
                "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + ", " +
                "Salário Base: " + super.getSalarioBaseFuncionarios() + ", " +
                "Endereço: " + super.getEndereco() + ", " +
                "Data de Fundação: " + super.getDataFundacao() + ", " +
                "Gasto com seguro de eletronicos:" + this.seguroEletronicos;
    }
}
