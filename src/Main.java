
import Librairies.Biographie;
import Livre.Livre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Menu:");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Modifier un livre par son identifiant");
            System.out.println("4. Rechercher un livre par nom");
            System.out.println("5. Lister les livres en saisissant une lettre alphabetique");
            System.out.println("6. Afficher le nombre de livres");
            System.out.println("7. Afficher les livres par catégorie");
            System.out.println("8. Afficher les détails d'un livre par son identifiant");
            System.out.println("9. Emprunter un livre (fonction supplementaire)");
            System.out.println("10. Retourner un livre (fonction supplementaire)");

            // Ajoutez d'autres options si nécessaire

            // Lire l'entrée de l'utilisateur pour choisir une option
            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();


            switch (choix) {
                case 1:
                    // Appeler la méthode pour ajouter un livre
                    break;
                case 2:
                    // Appeler la méthode pour supprimer un livre
                    break;
                case 3:
                    // Appeler la méthode pour modifier un livre par son identifiant
                    break;
                case 4:
                    // Appeler la méthode pour rechercher un livre par nom
                    break;
                case 5:
                    // Appeler la méthode pour lister les livres en saisissant une lettre alphabétique
                    break;
                case 6:
                    // Appeler la méthode pour afficher le nombre de livres
                    break;
                case 7:
                    // Appeler la méthode pour afficher les livres par catégorie
                    break;
                case 8:
                    // Appeler la méthode pour afficher les détails d'un livre par son identifiant
                    break;
                case 9:
                    //emprunterLivre();
                    break;
                case 10:
                    //retournerLivre();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }


        Map<Integer, Livre> bibliotheque = new HashMap<>();
        Scanner scanner1 = new Scanner(System.in);
        int id = 1;

        // Ajouter des livres à la bibliothèque
        bibliotheque.put(id++, new Roman("Harry Potter", "J.K. Rowling"));
        bibliotheque.put(id++, new ScienceFiction("Dune", "Frank Herbert"));
        bibliotheque.put(id++, new Biographie("Steve Jobs", "Walter Isaacson"));

        // Afficher les livres de la bibliothèque
        System.out.println("Livres dans la bibliothèque :");
        for (Map.Entry<Integer, Livre> entry : bibliotheque.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Titre: " + entry.getValue().getTitre() + ", Auteur: " + entry.getValue().getAuteur());
        }

        // Rechercher un livre par ID
        System.out.print("Entrez l'ID du livre à rechercher : ");
        int rechercheId = scanner.nextInt();
        Livre livreRecherche = bibliotheque.get(rechercheId);
        if (livreRecherche != null) {
            System.out.println("Livre.Livre trouvé - Titre: " + livreRecherche.getTitre() + ", Auteur: " + livreRecherche.getAuteur());
        } else {
            System.out.println("Livre.Livre non trouvé.");
        }

        scanner.close();

    }
}