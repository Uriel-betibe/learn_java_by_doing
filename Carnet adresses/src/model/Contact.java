package model;

public class Contact {
    public String nom;
    public String telephone;
    public String email;

    public Contact(String nom, String telephone, String email) {
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
    }


    public String getNom() {
        return nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    // Affichage
    public void afficherContact() {
        System.out.println("Nom: " + nom);
        System.out.println("Téléphone: " + telephone);
        System.out.println("Email: " + email);
        System.out.println("--------------------");
    }

}
