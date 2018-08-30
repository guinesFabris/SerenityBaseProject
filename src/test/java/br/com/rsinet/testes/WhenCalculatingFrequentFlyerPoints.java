package br.com.rsinet.testes;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.rsinet.pages.TravellerSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenCalculatingFrequentFlyerPoints {

	@Steps
	TravellerSteps travellerSteps;

	@Test
	public void shouldCalculatePointsBasedOnDistance() throws Exception {
		// GIVEN
		travellerSteps.a_traveller_has_a_frequent_flyer_account_with_balance(10000);

		// WHEN
		travellerSteps.the_traveller_flies(1000);

		// THEN
		travellerSteps.traveller_should_have_a_balance_of(10100);

	}
}