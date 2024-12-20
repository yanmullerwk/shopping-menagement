public class Endereco {
    private String nomeRua;
    private String numero;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String complemento;

    public Endereco(String nomeRua, String numero, String cidade, String estado, String pais, String cep,
            String complemento) {
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String toString() {
        return "Rua: " + nomeRua +
                "Numero: " + numero +
                "cidade: " + cidade + ", " +
                "Estado: " + estado + ", " +
                "pais: " + pais + ", " +
                "complemento: " + complemento + ", " +
                "cep: " + cep + ",";
    }

}
