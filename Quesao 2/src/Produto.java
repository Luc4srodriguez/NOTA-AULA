public class Produto {

    private String nome_produto, cor_produto;
    private int codigo;
    private int quantidade;
    private double pagamento, valor_final;

    public int getQuantidade_comprada() {
        return quantidade_comprada;
    }

    public void setQuantidade_comprada(int quantidade_comprada) {
        this.quantidade_comprada = quantidade_comprada;
    }

    private int quantidade_comprada;
    private double tamanho, peso, valor;

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getCor_produto() {
        return cor_produto;
    }

    public void setCor_produto(String cor_produto) {
        this.cor_produto = cor_produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibir_dados() {
        System.out.println("informaçoes do produto: \n" + nome_produto + "\n" + cor_produto + "\n" + tamanho + "\n" + peso + "\n" + valor + "\n" + quantidade);
    }

    public void estoque() {

        if (quantidade_comprada <= quantidade) {
            System.out.println("Compra Realizada com Sucesso");
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void processarPagamento(int tipoPagamento, double valorPago) {
        if (tipoPagamento == 1) {
            valor_final = valor * 0.95;
            System.out.println("Pagamento com 5% de desconto. Valor final: " + valor_final);
        }
        else if (tipoPagamento == 2) {
            System.out.println("Pagamento em crédito. O valor pode ser parcelado em 3x de: " + (valor / 3));
        }
        else if (tipoPagamento == 3) {
            valor_final = valor;
            if (valorPago >= valor_final) {
                double troco = valorPago - valor_final;
                System.out.println("Pagamento em espécie. Troco: " + troco);
            } else {
                System.out.println("Valor pago é insuficiente.");
            }
        } else {
            System.out.println("Forma de pagamento inválida.");
        }
    }
}

