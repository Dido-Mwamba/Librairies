package Librairies;

import Livre.Livre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bibliotheque {

        Map<Integer, Livre> bibliotheque = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int id = 1;

        // Ajouter des livres à la bibliothèque
        bibliotheque.put(id++, new Roman("Harry Potter", "J.K. Rowling"));
        bibliotheque.put(id++, new ScienceFiction("Dune", "Frank Herbert"));
        bibliotheque.put(id++, new Biographie("Steve Jobs", "Walter Isaacson"));

        // Trafficker les livres de la bibliothèque
        System.out.println("Livres dans la bibliothèque :");
        for(Map.Entry<Integer, Livre> entry; : bibliotheque.entrySet()) {
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


