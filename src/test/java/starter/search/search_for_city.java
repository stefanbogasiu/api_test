package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class search_for_city {
    public static Performable the_weather_api_city(String term) {
        return Task.where("{0} opens the weather api home page",
        Open.relativeUrl("http://api.weatherstack.com/current?access_key=c101f43cfa610971ac8fc6607b02d8f7&query="+term));
    }
}
