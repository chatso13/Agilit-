package CucumberTest.CucumberTest;

import java.util.ArrayList;

import CucumberTest.CucumberTest.Clan;

/**
 * Le pays sur lequel vivent les clans
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

public class Pays {
	
	private String nom;
	private ArrayList<Clan> residents;
	
	/**
     * Constructeur d'objets de classe Pays
     */
    public Pays(String nom)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        residents = new ArrayList<Clan>();
    }

    /**
     * Méthode pour rajouter un clan sur le pays
     *
     * @param  c   Clan qui souhaite emmenager
     * @return     le nombre de clans installés
     */
    public int emmenagement(Clan c)
    {
        // Insérez votre code ici
    		if(c.getResidence() != null) return -1;
        residents.add(c);
        return residents.size();
    }
    
    /**
     * Méthode pour rajouter un clan sur le pays
     *
     * @param  c   Clan qui souhaite emmenager
     * @return     le nombre de clans installés
     */
    public int demenagement(Clan c)
    {
        // Insérez votre code ici
        residents.remove(c);
        return residents.size();
    }
    
    public String getNom() {
    		return this.nom;
    }
    
    public int nombreResidents() {
    		return residents.size();
    }
	
}
