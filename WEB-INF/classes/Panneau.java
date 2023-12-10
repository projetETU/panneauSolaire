package solaire;

import meteo.Meteo;
import meteo.MeteoException;

public class Panneau {
    int puissance;
    public int getPuissance(){
        return puissance;
    }
    public void setPuissance(int puissance){
        // 10 = 100%
        this.puissance = puissance;
    }
    public double puissanceDelivrer(int luminositer)throws MeteoException
    {
        int puissancePanneau = 50000;
        Meteo meteo = new Meteo();
        meteo.setLuminositer(luminositer);
        int puissance = puissancePanneau*meteo.getLuminositer()/100;
        return puissance;
    }
    
}
