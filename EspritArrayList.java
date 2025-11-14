import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EspritArrayList implements University {
    private List<Etudiant> etudiants;

    public EspritArrayList() {
        this.etudiants = new ArrayList<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        if (!etudiants.contains(e)) {
            etudiants.add(e);
            System.out.println("Étudiant ajouté: " + e);
        } else {
            System.out.println("Étudiant déjà existant: " + e);
        }
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        if (etudiants.remove(e)) {
            System.out.println("Étudiant supprimé: " + e);
        } else {
            System.out.println("Étudiant non trouvé: " + e);
        }
    }

    @Override
    public void displayEtudiants() {
        System.out.println("=== Liste des étudiants ===");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
        System.out.println("===========================");
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
        System.out.println("Étudiants triés par ID");
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return e1.getNom().compareToIgnoreCase(e2.getNom());
            }
        });
        System.out.println("Étudiants triés par nom");
    }
}