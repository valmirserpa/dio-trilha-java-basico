public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        int numero1 =1;
        int numero2 =2;

        boolean simNao = numero1 == numero2;

        System.out.println("Número1 e Número2 são iguais? " + simNao); // Imprime false


        int numero3 =2;
        int numero4 =2;

        boolean simNao1 = numero3 == numero4;

        System.out.println("Número3 e Número4 são iguais? " + simNao1); // Imprime true


        int numero5 =2;
        int numero6 =2;

        boolean simNao2 = numero5 != numero6;

        System.out.println("Número5 e Número6 são diferentes? " + simNao2); // Imprime false


        int numero7 =2;
        int numero8 =2;

        boolean simNao3 = numero7 > numero8;

        System.out.println("Número7 é maior que o número8 " + simNao3); // Imprime false


        int numero9 =3;
        int numero10 =4;

        boolean simNao4 = numero9 < numero10;

        System.out.println("Número9 é menor que o número8 " + simNao4); // Imprime true

        if (numero9 > numero10) {
            System.out.println("Numéro 9 é maior que 10");
        } else {
            System.out.println("Número 9 não é maio que 10");
        }
    

        String nomeUm ="Valmir";
        String nomeDois="Serpa";

        System.out.println(nomeUm==nomeDois);









    }

}

