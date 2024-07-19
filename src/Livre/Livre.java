package Livre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// Classe Livre.Livre
public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private String categorie;

    public Livre(int id, String titre, String auteur, String categorie) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.categorie = categorie;
    }

    public Livre(String titre, String auteur) {

    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getCategorie() {
        return categorie;
    }

    // Fonction pour afficher les détails d'un livre
    public void afficherDetails() {
        System.out.println("ID: " + id + ", Titre: " + titre + ", Auteur: " + auteur + ", Catégorie: " + categorie);
    }

    // Fonction pour rechercher un livre par nom
    public boolean rechercherParNom(String nom) {
        return titre.toLowerCase().contains(nom.toLowerCase());
    }

    // Fonction pour afficher les livres par titre
    public void afficherParTitre(String lettre) {
        if (titre.toLowerCase().startsWith(lettre.toLowerCase())) {
            System.out.println("Titre: " + titre + ", Auteur: " + auteur + ", Catégorie: " + categorie);
        }
    }
}

class bibliotheque {
    public static void main(String[] args) {
        Map<Integer, Livre> bibliotheque = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int id = 1;

        // Ajouter des livres à la bibliothèque
        bibliotheque.put(id++, new Livre(1, "Harry Potter", "J.K. Rowling", "Livre.Livre.Roman"));
        bibliotheque.put(id++, new Livre(2, "Dune", "Frank Herbert", "Science-Fiction"));
        bibliotheque.put(id++, new Livre(3, "Steve Jobs", "Walter Isaacson", "Biographie"));

        // Afficher les détails d'un livre par son identifiant
        int idLivre = 2;
        Livre livre = bibliotheque.get(idLivre);
        if (livre != null) {
            livre.afficherDetails();
        }

        // Rechercher un livre par nom
        System.out.print("Entrez un nom de livre à rechercher : ");
        String nomRecherche = scanner.nextLine();
        for (Livre l : bibliotheque.values()) {
            if (l.rechercherParNom(nomRecherche)) {
                l.afficherDetails();
            }
        }

        // Lister les livres en saisissant une lettre alphabétique
        System.out.print("Entrez une lettre pour lister les livres commençant par cette lettre : ");
        String lettre = scanner.nextLine();
        for (Livre l : bibliotheque.values()) {
            l.afficherParTitre(lettre);
        }

        // Afficher le nombre de livres
        System.out.println("Nombre de livres dans la bibliothèque : " + bibliotheque.size());

        scanner.close();
    }
}
