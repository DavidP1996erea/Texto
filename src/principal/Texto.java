package principal;

public class Texto {

    private final String VOCALES="aeiouáéíóú";
    private final int MAXTEXTO;
    private String cadena;
    private char caracter;


    public Texto(int MAXTEXTO){

        this.MAXTEXTO=MAXTEXTO;
        cadena="";
    }


    public void anadirCaracterPrincipio(char caracter){

        if(cadena.length()+1<MAXTEXTO){
            this.cadena+=caracter;
        }
    }


    public void anadirCaracterFinal(char caracter){

        if(cadena.length()+1<MAXTEXTO){
            this.cadena=cadena+caracter;
        }
    }


    public void anadirCadenaPrincipio(String cadenaEntrada){
        if(this.cadena.length()+cadenaEntrada.length()<MAXTEXTO){
            this.cadena=cadenaEntrada+cadena;
        }
    }


    public  void anadirCadenaFinal(String cadenaEntrada){
        if (this.cadena.length()+cadenaEntrada.length()<MAXTEXTO){
            this.cadena=cadena+cadenaEntrada;
        }
    }

    public int numeroVocales(){
        int contador=0;

        for (int i = 0; i<cadena.length() ; i++){
            if (esVocal(cadena.charAt(i))){
                contador++;
            }
        }

        return contador;
    }


    public boolean esVocal(char caracter){
        boolean vocal=false;
        caracter=Character.toLowerCase(caracter);

        if(VOCALES.indexOf(caracter) != -1){
            vocal=true;
        }
        return vocal;
    }




    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
}

