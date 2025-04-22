package manager;
import model.Contact;

import java.util.ArrayList;
import java.util.Iterator;

public class CarnetAdresses {

    private ArrayList<Contact> listeOfContacts;

    public CarnetAdresses() {
        this.listeOfContacts = new ArrayList<Contact>();
    }


    public void ajouterContact(Contact c) {
        this.listeOfContacts.add(c);
    }

    public void supprimerContact(String nom) {
        Iterator<Contact> contacts = this.listeOfContacts.iterator();

        while (contacts.hasNext())
        {
            Contact person = contacts.next();
            if (person.getNom().equals(nom)){
                contacts.remove();
            }
        }

    }

    public void afficherTousLesContacts() {
        for (Contact c: listeOfContacts)
        {
            c.afficherContact();
        }
    }
}
