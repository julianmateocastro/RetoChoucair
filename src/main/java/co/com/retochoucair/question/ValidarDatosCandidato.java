package co.com.retochoucair.question;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.retochoucair.userinterface.ContenedorCandidatos.*;

public class ValidarDatosCandidato implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String primerNombre = actor.recall("PrimerNombre");
        String segundoNombre = actor.recall("SegundoNombre");
        String apellido = actor.recall("Apellido");
        String vacante = actor.recall("Vacante");
        String fechaAplicacion = actor.recall("FechaAplicacion");
        String gerenteContratacion = actor.recall("GerenteContratacion");
        String estado = actor.recall("EstadoContratacion");
        String candidato = primerNombre + " " + segundoNombre + " " + apellido;
        estado = estado.replace("Status: ", "");


        if (primerNombre == null || segundoNombre == null || apellido == null || vacante == null || fechaAplicacion == null || gerenteContratacion == null || estado == null) {
            return false;
        }

        Boolean esVacante = DATO_VACANTE.resolveFor(actor).getText().equals(vacante);
        Boolean esCandidato = DATO_CANDIDATO.resolveFor(actor).getText().equals(candidato);
        Boolean esGerenteContratacion = DATO_GERENTE_CONTRATO.resolveFor(actor).getText().equals(gerenteContratacion);
        Boolean esFechaAplicacion = DATO_FECHA_APLICACION.resolveFor(actor).getText().equals(fechaAplicacion);
        Boolean esEstado = DATO_ESTADO.resolveFor(actor).getText().equals(estado);

        return esVacante && esCandidato && esGerenteContratacion && esFechaAplicacion && esEstado;
    }

    public static ValidarDatosCandidato enLaTabla() {
        return new ValidarDatosCandidato();
    }
}
