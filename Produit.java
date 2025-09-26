import java.util.Date;

public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;


    public Produit() {}


    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }


    public Produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }


    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }


    public void afficher() {
        System.out.println("ID: " + id +
                " | Libellé: " + libelle +
                " | Marque: " + marque +
                " | Prix: " + prix +
                " | Expiration: " + dateExpiration);
    }


    @Override
    public String toString() {
        return "Produit {id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", expiration=" + dateExpiration + "}";
    }


}
