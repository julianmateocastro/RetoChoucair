package co.com.retochoucair.interactions.programarentrevista;

import co.com.retochoucair.models.TablaEntrevista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.retochoucair.userinterface.ContenedorProgramarEntrevista.*;

public class SeleccionarEntrevistador implements Interaction {
    private TablaEntrevista tablaEntrevista;

    public SeleccionarEntrevistador(TablaEntrevista tablaEntrevista){
        this.tablaEntrevista = tablaEntrevista;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(tablaEntrevista.getEntrevistador().equals("aleatorio")){
            for (char letter = 'a'; letter <= 'z'; letter++) {
                String letterStr = String.valueOf(letter);
                tablaEntrevista.setEntrevistador(letterStr);
                actor.attemptsTo(
                        SendKeys.of(Keys.BACK_SPACE).into(CAMPO_ENTREVISTADOR),
                        Enter.theValue(letterStr).into(CAMPO_ENTREVISTADOR)
                );
                String firstValueText = PRIMER_VALOR_CAMPO_ENTREVISTADOR.resolveFor(actor).getText();

                while (firstValueText.equals("Searching....")) {
                    actor.attemptsTo(
                            WaitUntil.the(PRIMER_VALOR_CAMPO_ENTREVISTADOR.of(tablaEntrevista.getEntrevistador()), WebElementStateMatchers.isVisible()).forNoMoreThan(2).seconds()
                    );
                    firstValueText =PRIMER_VALOR_CAMPO_ENTREVISTADOR.of(tablaEntrevista.getEntrevistador()).resolveFor(actor).getText();
                }
                if (!firstValueText.equals("No Records Found")) {
                    actor.attemptsTo(
                            Click.on(PRIMER_VALOR_CAMPO_ENTREVISTADOR.of(tablaEntrevista.getEntrevistador()))
                    );
                    break;
                }
            }}else{
            actor.attemptsTo(
                    Enter.theValue(tablaEntrevista.getEntrevistador()).into(CAMPO_ENTREVISTADOR),
                    Click.on(OPCION_ENTREVISTADOR.of(tablaEntrevista.getEntrevistador()))
            );
        }

    }

    public static SeleccionarEntrevistador enElCampo(TablaEntrevista  tablaEntrevista){
        return Tasks.instrumented(SeleccionarEntrevistador.class, tablaEntrevista);
    }
}
