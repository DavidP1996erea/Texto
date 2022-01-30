package principal;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Texto texto1 = new Texto(42);

        texto1.anadirCaracterPrincipio('p');
        texto1.anadirCaracterFinal('n');

        System.out.println(texto1.getCadena());

        texto1.anadirCadenaPrincipio("Que pasa hombre");
        System.out.println(texto1.getCadena());
        System.out.println("Tiene " + texto1.numeroVocales() + " vocales");

        texto1.anadirCadenaFinal(", pues nada aqui andamos");
        System.out.println(texto1.getCadena());

    }
}