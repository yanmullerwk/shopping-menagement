public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, float salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + ", " +
                "Quantidade de Funcionários: " + super.getQuantidadeFuncionarios() + ", " +
                "Salário Base: " + super.getSalarioBaseFuncionarios() + ", " +
                "Endereço: " + super.getEndereco() + ", " +
                "Data de Fundação: " + super.getDataFundacao() + ", " +
                "Data Alvara: " + this.dataAlvara;
    }

}
