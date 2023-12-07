package classe;
public class Eleve extends Exception {
    String nom;
    Section section;
    String classe;
    int puissanceUtiliser;
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Section getSection() {
        return section;
    }
    public void setSection(Section section) {
        this.section = section;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getPuissanceUtiliser() {
        return puissanceUtiliser;
    }
    public void setPuissanceUtiliser(int puissanceUtiliser) {
        this.puissanceUtiliser = puissanceUtiliser;
    }
}
