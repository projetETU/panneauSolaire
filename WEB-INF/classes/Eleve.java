package classe;

import classe.Section;

public class Eleve  {
    int nombre;
    int puissanceParEleve;

    public int getNombre(){
        return nombre;
    }
    public void setNombre(int nombre,Section section)
    {
        this.nombre = nombre;
    }
    public void setPuissanceParEleve(int puissanceParEleve){
        this.puissanceParEleve = puissanceParEleve*getNombre() ;
    }
    public int getPuissanceParEleve(){
        return puissanceParEleve;
    }
}