import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Produit lait = new Produit(1021, "Lait", "Delice", 0.7);
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait", 0.8);
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1.2);


        lait.setDateExpiration(new Date(2025-1900, 9, 30));
        yaourt.setDateExpiration(new Date(2025-1900, 10, 5));
        tomate.setDateExpiration(new Date(2025-1900, 12, 15));


        Magasin m1 = new Magasin(101, "Tunis Centre", 50);
        Magasin m2 = new Magasin(102, "Ariana", 50);


        m1.ajouterProduit(lait);
        m1.ajouterProduit(yaourt);
        m2.ajouterProduit(tomate);


        System.out.println("\n--- Magasin 1 ---");
        m1.afficherMagasin();

        System.out.println("\n--- Magasin 2 ---");
        m2.afficherMagasin();


        System.out.println("\nNombre total de produits dans tous les magasins : " + Magasin.getTotalProduits());
    }
}