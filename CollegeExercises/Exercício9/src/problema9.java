
import java.util.Scanner;

public class problema9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Voce faz parte do programa social? S ou N");
        char social = scan.next().charAt(0);
        System.out.println("\nQual o valor dos KW/h? ");
        int consumo = scan.nextInt();

        // Pergunta se o usuário faz parte do programa social
        // e calcula e imprime o resultado nessa resposta
        if (social == 's' || social == 'S') {
            Social eletro = new Social(consumo);
            System.out.println(eletro.info());
        }
        if (social == 'n' || social == 'N') {
            NaoSocial eletro = new NaoSocial(consumo);
            System.out.println(eletro.info());
        }

    }

}
