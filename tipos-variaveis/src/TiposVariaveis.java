public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        


        final int NUMERO = 5; // Quando uma variável possui valor, devemos escrever "final" antes do tipo e nome em caixa alta
        System.out.println(NUMERO);

        String nomeComposto = "Valmir " + "Serpa";
        System.out.println(nomeComposto);

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);




    }
}
