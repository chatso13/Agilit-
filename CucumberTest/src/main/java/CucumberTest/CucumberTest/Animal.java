package CucumberTest.CucumberTest;

/**
 * Décrivez votre classe Animal ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Animal
{
    // variables d'instance 
    private String prenom;
    private int nombreEnfants;

    /**
     * Constructeur d'objets de classe Animal
     */
    public Animal(String prenom)
    {
        // initialisation des variables d'instance
        this.prenom = prenom;
        this.nombreEnfants = 0;
    }
    
    /**
     * Accesseur du paramètre prénom
     *
     * @return     le prenom de l'animal
     */
    public String getPrenom()
    {
        // Insérez votre code ici
        return this.prenom;
    }
    
     /**
     * Accesseur du paramètre nombre d'Enfants
     *
     * @return     le nombre d'enfants de l'animal
     */
    public int getNombreEnfants()
    {
        // Insérez votre code ici
        return this.nombreEnfants;
    }
    
    /**
     * Méthode pour faire des nouveaux nés
     *
     * @param nouveauxNes
     * @return     le nombre d'enfants de l'animal
     */
    public int Enfanter(int nouveauxNes)
    {
    		if(nouveauxNes<1) return -1;
        // Insérez votre code ici
        nombreEnfants += nouveauxNes;
        return nombreEnfants;
    }
}

