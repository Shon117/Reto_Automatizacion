package demo.orange.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static demo.orange.UserInterfaces.InicioSesionPage.*;

public class IniciarSesion implements Task {

    private String usuario;
    private String contrasena;

    public IniciarSesion(String usuario, String contrasena){
        this.usuario=usuario;
        this.contrasena=contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(contrasena).into(TXT_CONTRASENA),
                Click.on(BTN_LOGIN)
        );
    }

    public static IniciarSesion incioDeSesion(String usuario, String contrasena){
        return Instrumented.instanceOf(IniciarSesion.class).withProperties(usuario,contrasena);
    }

}
