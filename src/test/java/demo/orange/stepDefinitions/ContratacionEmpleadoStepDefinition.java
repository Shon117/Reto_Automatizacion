package demo.orange.stepDefinitions;

import demo.orange.Questions.ValidarEstadoEmpleado;
import demo.orange.Tasks.IniciarSesion;
import demo.orange.Tasks.LlenarFormularioApplication;
import demo.orange.Tasks.LlenarFormularioRegistro;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ContratacionEmpleadoStepDefinition {

    @Managed(driver = "Chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("actor");

    private String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void configuracion(){
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Dado("el usuario inicia sesion en la pagina con las credenciales {string} {string}")
    public void elUsuarioIniciaSesionEnLaPaginaConLasCredenciales(String usuario, String contrasena) {
        actor.wasAbleTo(Open.url(url));
        actor.attemptsTo(IniciarSesion.incioDeSesion(usuario,contrasena));
    }


    @Cuando("el usuario llena los formularios de registro {string} {string} {string} {string}")
    public void elUsuarioLlenaLosFormulariosDeRegistro(String primerNombre, String segundoNombre, String apellido, String email) {
        actor.attemptsTo(
                LlenarFormularioRegistro.llenadoFormulario(primerNombre,segundoNombre,apellido,email)
        );
    }

    @Cuando("el usuario llena los formularios adicionales {string} {string} {string}")
    public void elUsuarioLlenaLosFormulariosAdicionales(String tituloEntrevista, String entrevistador, String fecha) {
        actor.attemptsTo(
                LlenarFormularioApplication.llenadoformularioApp(tituloEntrevista,entrevistador,fecha)
        );
    }
    @Entonces("el usuario logra visualizar la contratacion del empleado")
    public void elUsuarioLograVisualizarLaContratacionDelEmpleado() {
        actor.should(seeThat("el usuario puede ver", ValidarEstadoEmpleado.textoContratado(), Matchers.equalTo(true)));
    }
}
