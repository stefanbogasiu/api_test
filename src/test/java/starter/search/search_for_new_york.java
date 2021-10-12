package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import starter.navigation.weather_api;

public class search_for_new_york {
    public static Performable the_weather_api_new_york() {
        return Task.where("{0} opens the weather api home page",
                Open.browserOn().the(new_york.class));
    }
}
