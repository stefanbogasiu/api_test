package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable the_weather_api_homepage() {
        return Task.where("{0} opens the weather api home page",
                Open.browserOn().the(weather_api.class));
    }
}
