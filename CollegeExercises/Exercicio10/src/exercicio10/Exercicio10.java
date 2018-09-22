/*
    Exercício 10
    Programa gera boleto baseado do perfil do usuário, se o usuário
    for cadastrado no programa social CadÚnico ele receberá um desconto
    no valor da tarifa.
*/
package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nQual o valor dos KW/h? ");
        int consumo = scan.nextInt();
        
        System.out.println("Voce faz parte do programa social CadÚnico? (S ou N) ");
        char social = scan.next().charAt(0);

        Social eletro = new Social(consumo, social);
        System.out.println(eletro.boleto());

    }
    
}
