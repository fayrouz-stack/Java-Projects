public class Test {
    public static void main(String[] args) {

        System.out.println("=== TEST CLASSE ETUDIANT ===");


        Etudiant etudiant1 = new Etudiant();
        Etudiant etudiant2 = new Etudiant(1, "Dupont", "Jean");
        Etudiant etudiant3 = new Etudiant(2, "Martin", "Marie");
        Etudiant etudiant4 = new Etudiant(1, "Dupont", "Pierre");


        etudiant1.setId(3);
        etudiant1.setNom("Durand");
        etudiant1.setPrenom("Paul");


        System.out.println("Étudiant 1: " + etudiant1.getId() + " - " + etudiant1.getNom() + " " + etudiant1.getPrenom());
        System.out.println("Étudiant 2: " + etudiant2.getId() + " - " + etudiant2.getNom() + " " + etudiant2.getPrenom());


        System.out.println("etudiant2 equals etudiant4? " + etudiant2.equals(etudiant4));
        System.out.println("etudiant1 equals etudiant2? " + etudiant1.equals(etudiant2));


        System.out.println("toString etudiant1: " + etudiant1);
        System.out.println("toString etudiant2: " + etudiant2);

        System.out.println("\n=== TEST ESPRIT ARRAYLIST ===");

        University universite1 = new EspritArrayList();


        universite1.ajouterEtudiant(etudiant1);
        universite1.ajouterEtudiant(etudiant2);
        universite1.ajouterEtudiant(etudiant3);
        universite1.ajouterEtudiant(etudiant4);


        universite1.displayEtudiants();


        System.out.println("Recherche etudiant2: " + universite1.rechercherEtudiant(etudiant2));
        System.out.println("Recherche nom 'Martin': " + universite1.rechercherEtudiant("Martin"));
        System.out.println("Recherche nom 'Toto': " + universite1.rechercherEtudiant("Toto"));


        universite1.trierEtudiantsParId();
        universite1.displayEtudiants();

        universite1.trierEtudiantsParNom();
        universite1.displayEtudiants();


        universite1.supprimerEtudiant(etudiant3);
        universite1.displayEtudiants();

        System.out.println("\n=== TEST ESPRIT VECTOR ===");

        University universite2 = new EspritVector();

        universite2.ajouterEtudiant(new Etudiant(5, "Bernard", "Luc"));
        universite2.ajouterEtudiant(new Etudiant(4, "Moreau", "Sophie"));
        universite2.ajouterEtudiant(new Etudiant(6, "Leroy", "Thomas"));

        universite2.displayEtudiants();
        universite2.trierEtudiantsParId();
        universite2.displayEtudiants();
    }
}