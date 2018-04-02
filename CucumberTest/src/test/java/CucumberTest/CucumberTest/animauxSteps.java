package CucumberTest.CucumberTest; 

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException; 

public class animauxSteps { 
   
	Animal animal;
	int refus;
	@Given("^Un animal quelconque$")
	public void Un_animal_quelconque() {
	    animal = new Animal("hector");
	}

	@When("^L'animal met au monde (\\d+) nouveaux enfants$")
	public void L_animal_met_au_monde_nouveaux_enfants(int arg1) {
	    animal.Enfanter(arg1);
	}

	@Then("^Le (\\d+) d'enfants doit être automatiquement calculé$")
	public void Le_d_enfants_doit_être_automatiquement_calculé(int arg1) {
		assertEquals(arg1, animal.getNombreEnfants());
	}

	@When("^L'animal essaye de mettre au monde -(\\d+) nouveaux enfants$")
	public void L_animal_essaye_de_mettre_au_monde_nouveaux_enfants(int arg1) {
	    refus = animal.Enfanter(-arg1);
	}


	@Then("^le système refuse avec un code a -(\\d+)$")
	public void le_système_refuse_avec_un_code_a_(int arg1) {
		assertEquals(-arg1, refus);
	}




  
} 