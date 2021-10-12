package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

public class search_for_bucharest {
    public static Performable the_weather_api_new_york() {
        return Task.where("{0} opens the weather api home page on new york",
                Open.browserOn().the(new_york.class));
    }
}
