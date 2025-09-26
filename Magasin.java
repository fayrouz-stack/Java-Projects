public class Magasin {
    private int id;
    private String adresse;
    private int  capacité;
    private Produit[] Produits;
    private int nbProduits; // compteur local pour ce magasin
    private static int totalProduits = 0; // compteur global


    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacité = Math.min(capacite, 50); // max 50
        this.Produits = new Produit[this.capacité];
        this.nbProduits = 0;
    }
    public boolean ajouterProduit(Produit p) {
        if (nbProduits < capacité) {
            Produits[nbProduits] = p;
            nbProduits++;
            totalProduits++;
            return true;
        } else {
            System.out.println(" Capacité maximale atteinte pour le magasin " + id);
            return false;
        }
    }
    public void afficherMagasin() {
        System.out.println(" Magasin " + id + " | Adresse: " + adresse + " | Capacité: " + capacité);
        System.out.println("Produits:");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println("  - " + Produits[i]);
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}
