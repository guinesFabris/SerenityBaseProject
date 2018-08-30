package br.com.rsinet.testes;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.rsinet.pages.TravellerStatusSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenEarningFrequentFlyerStatus {

	String Silver = null;
	String Bronze = null;

	@Steps
	TravellerStatusSteps travellerSteps;

	@Test
	public void membersShouldStartWithBronzeStatus() {
		// GIVEN
		travellerSteps.a_traveller_joins_the_frequent_flyer_program();

		// THEN
		travellerSteps.traveller_should_have_a_status_of(Bronze);
	}

	@Test
	public void earnSilverAfter1000Points() {
		// GIVEN
		travellerSteps.a_traveller_joins_the_frequent_flyer_program();

		// WHEN
		travellerSteps.the_traveller_flies(10000);

		// THEN
		travellerSteps.traveller_should_have_a_status_of(Silver);
	}
}