package co.com.retochoucair.stepdefinitions;


import co.com.retochoucair.interactions.filtrobsuquedacandidato.ClicBotonBusqueda;
import co.com.retochoucair.interactions.filtrobsuquedacandidato.SeleccionarCandidato;
import co.com.retochoucair.interactions.programarentrevista.SeleccionarEntrevistador;
import co.com.retochoucair.interactions.programarentrevista.IngresarFechaEntrevista;
import co.com.retochoucair.interactions.programarentrevista.IngresarHora;
import co.com.retochoucair.interactions.programarentrevista.IngresarTituloEntrevista;
import co.com.retochoucair.interactions.reclutamiento.*;
import co.com.retochoucair.models.TablaCandidatos;
import co.com.retochoucair.models.TablaEntrevista;
import co.com.retochoucair.models.TablaUsuarios;
import co.com.retochoucair.question.ValidarDatosCandidato;
import co.com.retochoucair.task.reclutamiento.IngresarContactos;
import co.com.retochoucair.task.reclutamiento.IngresoNombre;
import co.com.retochoucair.task.reclutamiento.LogueoUsuario;
import co.com.retochoucair.models.TablaFiltrosBusqueda;
import co.com.retochoucair.userinterface.ContenedorLogin;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class ContratacionStepdefinitions {

    @DataTableType
    public TablaUsuarios tablaUsuariosEntry(Map<String, String> entry) {
        return new TablaUsuarios(entry.get("nombreUsuario"), entry.get("contrasenna"));
    }

    @DataTableType
    public TablaCandidatos tablaCandidatos(Map<String, String> entry) {
        return new TablaCandidatos(
                entry.get("primerNombre"),
                entry.get("segundoNombre"),
                entry.get("apellido"),
                entry.get("vacante"),
                entry.get("correo"),
                entry.get("numeroContacto"),
                entry.get("palabrasClave"),
                entry.get("fechaAplicacion"),
                entry.get("notas"),
                entry.get("casillaVerificacion"),
                entry.get("archivo"),
                entry.get("status"));
    }

    @DataTableType
    public TablaEntrevista tablaEntrevista(Map<String, String> entry) {
        return new TablaEntrevista(
                entry.get("tituloEntrevista"),
                entry.get("entrevistador"),
                entry.get("fecha"),
                entry.get("hora"),
                entry.get("minuto"),
                entry.get("formato")
                );
    }

    @DataTableType
    public TablaFiltrosBusqueda tablaFiltrosBusqueda(Map<String, String> entry) {
        return new TablaFiltrosBusqueda(
                entry.get("tituloTrabajo"),
                entry.get("vacante"),
                entry.get("gerenteContratacion"),
                entry.get("estado"),
                entry.get("nombreCandidato"),
                entry.get("palabrasClave"),
                entry.get("fechaAplicacionDesde"),
                entry.get("fechaAplicacionHasta"),
                entry.get("metodoAplicacion")
        );
    }

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se loguee en el sistema")
    public void queElUsuarioSeLogueeEnElSistema(List<TablaUsuarios> tablaUsuariosList) {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPagina.laPagina(ContenedorLogin.url));
        OnStage.theActorInTheSpotlight().attemptsTo(LogueoUsuario.conNombreUsuarioyContrasenna(tablaUsuariosList.get(0)));
    }

    @Y("pueda seleccionar la opción Recruitment")
    public void puedaSeleccionarLaOpciónRecruitment() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicOpcionReclutamiento.clic());
    }


    @Dado("que el usuario seleccione el botón Add")
    public void queElUsuarioSeleccioneElBotónAdd() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicBotonAdd.clic());
    }

    @Cuando("complete los campos primer nombre, segundo nombre y apellido")
    public void completeLosCamposPrimerNombreSegundoNombreYApellido(List<TablaCandidatos> tablaCandidatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoNombre.enLosCampos(tablaCandidatosList.get(0)));
    }

    @Y("seleccione una vacante")
    public void seleccioneUnaVacante(List<TablaCandidatos> tablaCandidatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarVacante.enElSeleccionableVacante(tablaCandidatosList.get(0)));
    }

    @Y("ingrese datos de contacto correo y numero")
    public void ingreseDatosDeContactoCorreoYNumero(List<TablaCandidatos> tablaCandidatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarContactos.enLosCamposCorreoYNumeroContacto(tablaCandidatosList.get(0)));

    }

    @Y("ingresar notas")
    public void ingreseNotas(List<TablaCandidatos> tablaCandidatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNotas.enElCampoNotas(tablaCandidatosList.get(0)));
    }

    @Y("seleccione la casilla de verificación")
    public void seleccioneLaCasillaDeVerificación(List<TablaCandidatos> tablaCandidatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicCasillaConsentimiento.clic(tablaCandidatosList.get(0)));
    }

    @Y("seleccione el botón Guardar")
    public void seleccioneElBotónGuardar() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicBotonGuardar.clic());
    }



    @Y("información de interés general")
    public void informaciónDeInterésGeneral(List<TablaCandidatos> tablaCandidatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(CargarResumen.enLaPagina(tablaCandidatosList.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPalabrasClave.enElCampoPalabrasClave(tablaCandidatosList.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarFecha.enElCampoFecha(tablaCandidatosList.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNotas.enElCampoNotas(tablaCandidatosList.get(0)));
    }

    @Y("selecciona el botón lista corta")
    public void seleccionaElBotónListaCorta() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicBtnListaCorta.clic());
    }

    @Y("selecciona el botón programar entrevista")
    public void seleccionaElBotónProgramarEntrevista() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicBotonPrograEntre.clic());
    }

    @Y("ingresa el titulo de la entrevista, nombre del entrevistador, date y hora")
    public void ingresaElTituloDeLaEntrevistaNombreDelEntrevistadorDateYHora(List<TablaEntrevista> tablaEntrevistaList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarTituloEntrevista.enElCampo(tablaEntrevistaList.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarEntrevistador.enElCampo(tablaEntrevistaList.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarFechaEntrevista.enElCampoFecha(tablaEntrevistaList.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarHora.enElCampo(tablaEntrevistaList.get(0)));
    }

    @Y("selecciona el botón entrevista aprobada")
    public void seleccionaElBotónEntrevistaAprobada() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicEntrevistaAprobada.clic());
    }

    @Y("selecciona el botón ofrecer trabajo")
    public void seleccionaElBotónOfrecerTrabajo() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicOfrecerTrabajo.clic());
    }

    @Y("selecciona el botón contratado")
    public void seleccionaElBotónContratado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicBotonContratado.clic());
    }

    @Y("selecciona el botón reclutamiento")
    public void seleccionaElBotónReclutamiento() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicOpcionReclutamiento.clic());
    }

    @Y("obtiene el gerente de contratación y el estado del candidato")
    public void obtieneElGerenteDeContratacionYElEstadoDelCandidato() {
        OnStage.theActorInTheSpotlight().attemptsTo(ObtenerGerenteYEstado.obtener());
    }

    @Entonces("valida la información del candidato")
    public void validaLaInformaciónDelCandidato() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarDatosCandidato.enLaTabla(), is(true)));
    }

    @Y("selecciona el nombre del candidato")
    public void seleccionaElNombreDelCandidato() {

        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarCandidato.enElCampo());
    }

    @Y("selecciona el botón buscar")
    public void seleccionaElBotónBuscar() {

        OnStage.theActorInTheSpotlight().attemptsTo(ClicBotonBusqueda.clic());
    }

}

