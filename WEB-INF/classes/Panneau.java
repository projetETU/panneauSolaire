package solaire;

import meteo.Meteo;

public class Panneau {
    int puissance;
    public int getPuissance(){
        return puissance;
    }
    public void setPuissance(int puissance){
        puissance = 50000;
        this.puissance = puissance;
    }
    public double puissanceDelivrer(int luminositer)
    {
        Meteo meteo = new Meteo();
        
    }
    
}
