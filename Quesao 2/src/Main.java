import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        Produto p = new Produto();
        String Continuar;

do {
        System.out.println("Escolha uma opção");
        System.out.println("1- Para cadastrar produto");
        System.out.println("2- Para Realizar uma compra");
        int escolha = sc.nextInt();



        switch (escolha) {
            case 1:
                System.out.println("Digite o nome do Produto");
                p.setNome_produto(line.nextLine());
                System.out.println("Digite a cor do produto");
                p.setCor_produto(line.nextLine());
                System.out.println("Digite o tamanho do produto");
                p.setTamanho(sc.nextDouble());
                System.out.println("Digite o peso do produto");
                p.setPeso(sc.nextDouble());
                System.out.println("Digite o valor do produto");
                p.setValor(sc.nextDouble());
                System.out.println("Digite o Codigo do produto");
                p.setCodigo(sc.nextInt());
                System.out.println("Digite a quantidade de produto");
                p.setQuantidade(sc.nextInt());
                p.exibir_dados();
                break;


            case 2:
                System.out.println("Digite o nome do produto que deseja comprar");
                p.setNome_produto(line.nextLine());
                System.out.println("Digite a quantidade que quer comprar");
                p.setQuantidade_comprada(sc.nextInt());
                p.estoque();


                System.out.println("Escolha a forma de pagamento");
                System.out.println("1- Pix, Transferência ou Débito (5% de Desconto)");
                System.out.println("2- Espécie (com 5% de Desconto)");
                System.out.println("3- Crédito (parcela em 3x sem juros)");
                int pagamento = sc.nextInt();

                if (pagamento == 3) {
                    p.processarPagamento(pagamento, 0);
                } else if (pagamento == 2) {
                    System.out.println("Digite o valor pago:");
                    double valorPago = sc.nextDouble();
                    p.processarPagamento(pagamento, valorPago);
                } else {
                    p.processarPagamento(pagamento, 0);
                }
                break;
            }
    System.out.println("Deseja continuar? (S/N):");
        Continuar = sc.next();
        }while (Continuar.equalsIgnoreCase("S"));
        System.out.println("Programa Finalizado");

    }
}