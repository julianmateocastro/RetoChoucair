package co.com.retochoucair.task.reclutamiento;

import co.com.retochoucair.models.TablaCandidatos;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class IngresarContactos implements Task {

    private TablaCandidatos tablaCandidatos;

    public IngresarContactos(TablaCandidatos tablaCandidatos){
        this.tablaCandidatos = tablaCandidatos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
       if(tablaCandidatos.getCorreo().contains("aleatorio") && tablaCandidatos.getNumeroContacto().contains("aleatorio") ) {
            actor.attemptsTo(
                    Enter.theValue(Faker.instance().internet().emailAddress()).into(CAMPO_CORREO),
                    Enter.theValue(Faker.instance().phoneNumber().phoneNumber().replaceAll("[^\\d]", "")).into(CAMPO_NUMERO_CONTACTO)
            );
        }else{
            actor.attemptsTo(
                    Enter.theValue(tablaCandidatos.getCorreo()).into(CAMPO_CORREO),
                    Enter.theValue(tablaCandidatos.getNumeroContacto()).into(CAMPO_NUMERO_CONTACTO)
            );
        }
    }

    public static IngresarContactos enLosCamposCorreoYNumeroContacto(TablaCandidatos tablaCandidatos){
        return Tasks.instrumented(IngresarContactos.class,tablaCandidatos);
    }
}
