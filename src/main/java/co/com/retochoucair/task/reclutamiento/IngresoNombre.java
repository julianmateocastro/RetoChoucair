package co.com.retochoucair.task.reclutamiento;

import co.com.retochoucair.models.TablaCandidatos;
import co.com.retochoucair.userinterface.ContenedorReclutamiento;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorReclutamiento.*;

public class IngresoNombre implements Task {

    private TablaCandidatos tablaCandidatos;
   
    public IngresoNombre(TablaCandidatos tablaCandidatos){
        this.tablaCandidatos = tablaCandidatos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(tablaCandidatos.getPrimerNombre().contains("aleatorio") && tablaCandidatos.getSegundoNombre().contains("aleatorio") && tablaCandidatos.getApellido().contains("aleatorio")) {
            tablaCandidatos.setPrimerNombre(Faker.instance().name().firstName());
            tablaCandidatos.setSegundoNombre(Faker.instance().name().name());
            tablaCandidatos.setApellido(Faker.instance().name().lastName());

            actor.attemptsTo(
                    Enter.theValue(tablaCandidatos.getPrimerNombre()).into(CAMPO_PRIMER_NOMBRE),
                    Enter.theValue(tablaCandidatos.getSegundoNombre()).into(CAMPO_SEGUNDO_NOMBRE),
                    Enter.theValue(tablaCandidatos.getApellido()).into(CAMPO_APELLIDO));

        }else {
            actor.attemptsTo(
                    Enter.theValue(tablaCandidatos.getPrimerNombre()).into(CAMPO_PRIMER_NOMBRE),
                    Enter.theValue(tablaCandidatos.getSegundoNombre()).into(CAMPO_SEGUNDO_NOMBRE),
                    Enter.theValue(tablaCandidatos.getApellido()).into(CAMPO_APELLIDO)
            );
        }
        actor.remember("PrimerNombre", tablaCandidatos.getPrimerNombre());
        actor.remember("SegundoNombre", tablaCandidatos.getSegundoNombre());
        actor.remember("Apellido", tablaCandidatos.getApellido());
    }

    public static IngresoNombre enLosCampos(TablaCandidatos tablaCandidatos) {
        return Tasks.instrumented(IngresoNombre.class, tablaCandidatos);
    }
}
