
public class OperadoresIncremento {
    public static void main(String[] args) {
        
        int numero = 5;
 
        System.out.println(++ numero);
        System.out.println(-- numero);
        
        System.out.println(numero ++);
        System.out.println(numero --);


        int c = 5;
        int d = -- c;
        System.out.println(d); // imprime 4

        int g = 5;
        int h = g --;
        System.out.println(h); // imprime 5
        System.out.println(g); // imprime 4

        int e = 5;
        int f = e ++;
        System.out.println(f); // imprime 5
        System.out.println(e); // imprime 6

        int a = 5;
        int b = ++ a;
        System.out.println(b); // Imprime 6     




    }
}
