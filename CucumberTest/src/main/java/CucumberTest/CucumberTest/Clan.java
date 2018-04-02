package CucumberTest.CucumberTest;

import CucumberTest.CucumberTest.Animal;
import CucumberTest.CucumberTest.Pays;

/**
 * Le clan dans lequel se regroupes plusieurs animaux
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Clan
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int nombreMembres;
    private Animal chef;
    private Pays residence;
    /**
     * Constructeur d'objets de classe Clan
     */
    public Clan(int nombreMembres)
    {
        // initialisation des variables d'instance
        this.nombreMembres = nombreMembres;
        this.residence = null;
    }
    
    /**
     * Méthode d'installation dans un pays
     *
     * @param  p   pays de résidence
     */
    public Pays installation(Pays p) {
    		this.residence = p;
    		return residence;
    }

    /**
     * Méthode de nomination d'un nouveau chef de clan
     *
     * @param  a   Animal devenant maintenant le chef du clan
     * @return     le nombre de membres dans le clan
     */
    public int nouveauChef(Animal a)
    {
        // Insérez votre code ici
    		if(a.getNombreEnfants()==0) return -1;
        this.chef = a;
        this.nombreMembres += a.getNombreEnfants() + 1;
        return this.nombreMembres;
    }
    
    public int getNombreMembres() {
    		return nombreMembres;
    }
    
    public Pays getResidence() {
    		return residence;
    }
}
