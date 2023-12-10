package meteo;

import meteo.MeteoException;

public class Meteo {
    int luminositer;
    public void setLuminositer(int luminositer) throws MeteoException
    {
       if (luminositer>=1 && luminositer<=10) {
        this.luminositer  = luminositer*10;
       }else{
        throw new MeteoException();
       }
    }
    public int getLuminositer()
    {
        return luminositer;
    }
}
