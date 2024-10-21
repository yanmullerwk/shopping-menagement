import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int response;

        do {
            System.out.println("Menu");
            System.out.println("(1) Criar uma Loja");
            System.out.println("(2) Criar Produto");
            System.out.println("(3) Sair");

            response = scan.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Criar loja");

                    System.out.println("Digite o Nome da sua loja: ");
                    scan.nextLine();
                    String nomeLoja = scan.nextLine();

                    System.out.println("Digite o numero de funcionarios:");
                    int numeroFuncionario = scan.nextInt();

                    System.out.println("Digite o salario base para os funcionarios:");
                    float salarioBase = scan.nextFloat();

                    System.out.println("Defina a data de fundação: ");
                    System.out.println("Digite o Dia: ");
                    int dia = scan.nextInt();
                    System.out.println("Digite o Mês: ");
                    int mes = scan.nextInt();
                    System.out.println("Digite o Ano: ");
                    int ano = scan.nextInt();
                    Data data = new Data(dia, mes, ano);

                    System.out.println("Defina o Endereço:");
                    scan.nextLine();

                    System.out.println("Digite o nome da rua:");
                    String nomeRua = scan.nextLine();

                    System.out.println("Digite o número:");
                    String numero = scan.next();

                    System.out.println("Digite o nome da cidade:");
                    scan.nextLine();
                    String cidade = scan.nextLine();

                    System.out.println("Digite o nome do estado:");
                    String estado = scan.nextLine();

                    System.out.println("Digite o nome do país:");
                    String pais = scan.nextLine();

                    System.out.println("Digite o cep:");
                    String cep = scan.next();

                    System.out.println("Digite o complemento:");
                    scan.nextLine();
                    String complemento = scan.nextLine();

                    Endereco endereco = new Endereco(nomeRua, numero, cidade, estado, pais, cep, complemento);
                    Loja loja = new Loja(nomeLoja, numeroFuncionario, salarioBase, endereco, data);
                    System.out.println("Loja criada com sucesso: " + loja.getNome());
                    break;

                case 2:
                    System.out.println("Criar produto:");

                    System.out.println("Digite o nome do produto:");
                    scan.nextLine();
                    String nomeProduto = scan.nextLine();

                    System.out.println("Digite o preço do produto: ");
                    float precoProduto = scan.nextFloat();

                    System.out.println("Data de validade: digite o dia");
                    int diaValidade = scan.nextInt();
                    System.out.println("Data de validade: digite o mês");
                    int mesValidade = scan.nextInt();
                    System.out.println("Data de validade: digite o ano");
                    int anoValidade = scan.nextInt();

                    Data validade = new Data(diaValidade, mesValidade, anoValidade);

                    Produto produto = new Produto(nomeProduto, precoProduto, validade);

                    Data dataReferencia = new Data(20, 10, 2023);
					
                    if (produto.estaVencido(dataReferencia)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;
            }
        } while (response != 3);

        scan.close();
    }
}
