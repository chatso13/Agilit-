package CucumberTest.CucumberTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;
import junit.framework.TestCase;

@RunWith(Cucumber.class)
public class PaysTest extends TestCase{

	@Test
	public void test() {
		Clan savane = new Clan(106);
		Clan montagne = new Clan(100);
		Pays montagneLand = new Pays("MontagneLand");
		assertEquals(1, montagneLand.emmenagement(savane));
		assertEquals(2, montagneLand.emmenagement(montagne));
		assertEquals(1, montagneLand.demenagement(savane));
	}

}