import manager.CarnetAdresses;
import model.Contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarnetAdresses carnet = new CarnetAdresses();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Carnet d'Adresses ===");
            System.out.println("1. Ajouter un contact");
            System.out.println("2. Supprimer un contact");
            System.out.println("3. Afficher tous les contacts");
            System.out.println("4. Quitter");
            System.out.print("Votre choix: ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();

                    System.out.print("Téléphone: ");
                    String tel = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contact nouveau = new Contact(nom, tel, email);
                    carnet.ajouterContact(nouveau);
                    System.out.println("✅ Contact ajouté !");
                    break;

                case "2":
                    System.out.print("Nom du contact à supprimer: ");
                    String nomSuppr = scanner.nextLine();
                    carnet.supprimerContact(nomSuppr);
                    System.out.println("🗑️ Contact supprimé (si trouvé).");
                    break;

                case "3":
                    System.out.println("\n📒 Liste des contacts :");
                    carnet.afficherTousLesContacts();
                    break;

                case "4":
                    running = false;
                    System.out.println("👋 Au revoir !");
                    break;

                default:
                    System.out.println("❌ Option invalide, réessayez.");
            }
        }

        scanner.close();
    }
}