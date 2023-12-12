package solaire;

import classe.Eleve;
import meteo.MeteoException;
import solaire.Panneau;

public class Batterie {
    int  intensite;
    int  tension;
    int  puissance;
    int puissanceReste;
    public int getPuissanceReste()
    {
        return puissanceReste;
    }
    public void setPuissanceReste(int puissanceReste){
        this.puissanceReste = puissanceReste;
    }
    public int getIntensite() {
        return intensite;
    }
    public void setIntensite(int intensite) {
        this.intensite = intensite;
    }
    public int getTension() {
        return tension;
    }
    public void setTension(int tension) {
        this.tension = tension;
    }
    public int getPuissance() {
        return puissance;
    }
    public void setPuissance() {
        int puissance =  getIntensite()*getTension();
        this.puissance = puissance*50/100 ;
    }
    public double[] consomationBatterie(double puissance)
    {
        double durree= getPuissance() / puissance;
        
    }
        public void  testPanneau(int luminositer)throws MeteoException {
        Panneau panneau = new Panneau();
        Eleve eleve = new Eleve();
        double puissanceReste  = 0;
        if (eleve.getPuissanceParEleve() > panneau.puissanceDelivrer(luminositer)) {
            puissanceReste = panneau.puissanceDelivrer(luminositer) - getPuissance();
            consomationBatterie(puissanceReste);
        }
    }

}