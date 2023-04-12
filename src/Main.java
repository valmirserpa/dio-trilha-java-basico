import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        /*Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido
        e continue pedindo até que o usuário informe um valor válido.*/

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota ");
        nota = scan.nextInt();

        while (nota < 0 | nota >11){
            System.out.println("Nota inválida! Por favor, digite novamente!");
             nota = scan.nextInt();

        }


    }

}