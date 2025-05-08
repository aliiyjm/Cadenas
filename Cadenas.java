import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args){
        //String nombre;
        String entrada = new Scanner(System.in);
        System.out pintln("Escibe tu nombre");
        String nombre = entrada.nextLine();
        System.out println("Escribe tu apellido");
        String apellido = entrada.nextLine();
        System.out pintln("Tu nombre es: "+ nombre + apellido);
    }
}