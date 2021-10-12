package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.search_for_city;
import starter.search.weather_api_response;

public class SearchStepDefinitions {

    @Given("{actor} is navigating to weather api homepage")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.the_weather_api_homepage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                search_for_city.the_weather_api_city(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(weather_api_response.HEADING).text().contains(term)
        );
    }
}
