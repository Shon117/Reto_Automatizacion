package demo.orange.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static demo.orange.UserInterfaces.AddRecruitmentPage.*;
import static demo.orange.UserInterfaces.PaginaPrincipalPage.BNT_RECRUITMENT;
import static demo.orange.UserInterfaces.RecruitmentPage.*;

public class LlenarFormularioRegistro implements Task {

    private String primerNombre;
    private String segundoNombre;
    private String apellido;
    private String email;

    public LlenarFormularioRegistro(String primerNombre, String segundoNombre, String apellido, String email) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BNT_RECRUITMENT),
                Click.on(BTN_ADD),
                Enter.theValue(primerNombre).into(TXT_FIRSTNAME),
                Enter.theValue(segundoNombre).into(TXT_MIDDLENAME),
                Enter.theValue(apellido).into(TXT_LASTNAME),
                Click.on(LST_VACANCY),
                Click.on(OPT_VACANCY),
                Enter.theValue(email).into(TXT_EMAIL),
                Click.on(BTN_SAVE),
                Click.on(BTN_SHORTLIST),
                Click.on(BTN_SAVE),
                Click.on(BTN_SCHEDULE_INTERVIEW)
        );
    }

    public static LlenarFormularioRegistro llenadoFormulario (String primerNombre, String segundoNombre, String apellido, String email){
        return Instrumented.instanceOf(LlenarFormularioRegistro.class).withProperties(primerNombre,segundoNombre,apellido,email);
    }
}
