public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionarios;
    private Endereco endereco;
    private Data dataFundação;

    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionarios, Endereco endereco, Data dataFundacao){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionarios=salarioBaseFuncionarios;
        this.endereco=endereco;
        this.dataFundação=dataFundacao;
    }
    
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionarios=-1;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public float getSalarioBaseFuncionarios() {
        return salarioBaseFuncionarios;
    }
    public void setSalarioBaseFuncionarios(float salarioBaseFuncionarios) {
        this.salarioBaseFuncionarios = salarioBaseFuncionarios;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundação() {
        return dataFundação;
    }

    public void setDataFundação(Data dataFundação) {
        this.dataFundação = dataFundação;
    }

    public String toString(){
        return "Loja:{"+
            "nome: "+nome+", "+"qntd.funcionarios: "+quantidadeFuncionarios+", "+"Salario Base: "+salarioBaseFuncionarios+" }";
    }

    public float gastosComSalario(){
        if(salarioBaseFuncionarios!=-1){
            float gastos = quantidadeFuncionarios*salarioBaseFuncionarios;
            System.out.println(gastos);
            return gastos;
        }else{
            System.out.println(-1);
            return -1;
        }
    }

    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios<10){
            return 'P';
        }else if(quantidadeFuncionarios>=10 && quantidadeFuncionarios<=30){
            return 'M';
        }else{
            return 'G';
        }
    }
}
