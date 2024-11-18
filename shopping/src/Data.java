public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("[ERRO] data invalida: data alterada para 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private boolean validaData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            return false;
        }

        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isBissexto(ano)) {
            diasPorMes[1] = 29;
        }

        return dia > 1 && dia <= diasPorMes[mes - 1];
    }

    public boolean isBissexto() {
        if (this.ano % 4 == 0) {
            if (this.ano % 100 == 0) {
                return this.ano % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                return ano % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean isBefore(Data outraData) {
        if (this.ano < outraData.getAno()) {
            return true;
        } else if (this.ano == outraData.getAno()) {
            if (this.mes < outraData.getMes()) {
                return true;
            } else if (this.mes == outraData.getMes()) {
                return this.dia < outraData.getDia();
            }
        }
        return false;
    }

    public String toString() {
        return "data:" + dia + '/' + mes + '/' + ano;
    }

}
