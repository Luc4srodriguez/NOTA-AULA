public class Aluno {
    private double n1, n2, n3, media;
    private String nome;

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  void calcular_media(){
        media = (n1 + n2 + n3)/3;
    }

    public void aprovacao(){
        if(media >= 7.0){
            System.out.println("Aprovado");

        }else if (media < 4.0){
            System.out.println("Esta reprovado");
        } else{
            System.out.println("Esta na final");
        }
    }

    public void exibir_detalhes(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Suas Notas são:\n" + n1 + "\n" + n2 + "\n" + n3 + "\n");
        System.out.printf("Sua media final é: %.2f%n ", media);
    }

}
