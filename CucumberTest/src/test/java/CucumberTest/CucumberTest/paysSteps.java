package CucumberTest.CucumberTest; 

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException; 

public class paysSteps { 
	Pays pays;
	Clan clan;
	int nombreClansInitiaux;
	int refus;
	
	@Given("^Etant donné un pays avec (\\d+) clans et un nouveau clan quelconque$")
	public void Etant_donné_un_pays_avec_clans_et_un_nouveau_clan_quelconque(int arg1) {
		pays = new Pays ("AnimalLand");
	    for(int i = 0; i < arg1; i++) {
	    		pays.emmenagement(new Clan(100+i));
	    }
	    nombreClansInitiaux = arg1;
	    clan = new Clan (100);
	}

	@When("^On fait emmenager le clan sur le pays$")
	public void On_fait_emmenager_le_clan_sur_le_pays() {
	    refus = pays.emmenagement(clan);
	}

	@Then("^le nombre de clan sur le pays doit avoir été incrémenté de (\\d+)$")
	public void le_de_clan_sur_le_pays_doit_avoir_été_incrémenté_de(int arg1) {
		assertEquals(pays.nombreResidents(), nombreClansInitiaux+arg1 );
	}

	@Given("^Etant donné un pays avec (\\d+) clans$")
	public void Etant_donné_un_pays_avec_clans(int arg1) {
		pays = new Pays ("AnimalLand");
	    for(int i = 0; i < arg1; i++) {
	    		if(i==0) {
	    			clan = new Clan(100+i);
	    			pays.emmenagement(clan);
	    		}
	    		else pays.emmenagement(new Clan(100+i));
	    }
	    nombreClansInitiaux = arg1;
	}

	@When("^On fait demmenager le premier clan du pays$")
	public void On_fait_demmenager_le_premier_clan_du_pays() {
	    pays.demenagement(clan);
	}


	@Then("^le nombre de clan sur le pays doit avoir été décrémenté de (\\d+)$")
	public void le_de_clan_sur_le_pays_doit_avoir_été_décrémenté_de(int arg1) {
		assertEquals(pays.nombreResidents(), nombreClansInitiaux-arg1 );
	}

	@Given("^Etant donné un pays avec (\\d+) clans et un nouveau clan ayant déjà une résidence quelconque$")
	public void Etant_donné_un_pays_avec_clans_et_un_nouveau_clan_ayant_déjà_une_résidence_quelconque(int arg1) {
		pays = new Pays ("AnimalLand");
	    for(int i = 0; i < arg1; i++) {
	    		pays.emmenagement(new Clan(100+i));
	    }
	    nombreClansInitiaux = arg1;
	    clan = new Clan (100);
	    clan.installation(new Pays("AutreLand"));
	}


	@Then("^le système refuse le changement et renvoie le code -(\\d+)$")
	public void le_système_refuse_le_changement_et_renvoie_le_code_(int arg1) {
		assertEquals(-arg1, refus );
	}
}