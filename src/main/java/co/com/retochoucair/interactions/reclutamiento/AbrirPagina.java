package co.com.retochoucair.interactions.reclutamiento;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirPagina implements Interaction {

    private String url;

    public AbrirPagina(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static AbrirPagina laPagina(String url) {
        return new AbrirPagina(url);
    }
}
