package solaire;
public class Batterie {
    int  intensite;
    int  tension;
    int  puissance;
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
        // puissance a 50%
        int puissance =  getIntensite()*getTension();
        this.puissance = puissance*50/100 ;
    }
}
