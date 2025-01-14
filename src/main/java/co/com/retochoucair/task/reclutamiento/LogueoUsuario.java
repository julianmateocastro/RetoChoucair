package co.com.retochoucair.task.reclutamiento;

import co.com.retochoucair.models.TablaUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterface.ContenedorLogin.*;

public class LogueoUsuario implements Task {
    private TablaUsuarios tablaUsuarios;
    public LogueoUsuario(TablaUsuarios tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaUsuarios.getNombreUsuario()).into(NOMBRE_USUARIO),
                Enter.theValue(tablaUsuarios.getContrasenna()).into(CONTRASENA),
                Click.on(BOTON_LOGIN));
    }

    public static LogueoUsuario conNombreUsuarioyContrasenna(TablaUsuarios tablaUsuarios){
        return Tasks.instrumented(LogueoUsuario.class,tablaUsuarios);
    }
}
