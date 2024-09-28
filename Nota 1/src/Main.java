import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite Seu nome");
        a.setNome(sc.nextLine());

        System.out.println("Digite Suas Notas");
        a.setN1(sc.nextDouble());
        System.out.println("Digite a segunda nota");
        a.setN2(sc.nextDouble());
        System.out.println("Digite a terceira nota");
        a.setN3(sc.nextDouble());
        a.calcular_media();
        a.aprovacao();
        a.exibir_detalhes();

    }
}