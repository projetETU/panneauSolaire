package meteo;
public class MeteoException extends Exception{

    public MeteoException (){
        super("La luminositer doit etre comprise entre 1 a 10");
    }
}