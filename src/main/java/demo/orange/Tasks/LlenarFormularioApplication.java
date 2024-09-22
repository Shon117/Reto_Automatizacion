package demo.orange.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static demo.orange.UserInterfaces.RecruitmentPage.*;
import static demo.orange.UserInterfaces.ScheduleInterviewPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioApplication implements Task {

    private String tituloEntrevista;
    private String entrevistador;
    private String fecha;

    public LlenarFormularioApplication(String tituloEntrevista, String entrevistador, String fecha){
        this.tituloEntrevista = tituloEntrevista;
        this.entrevistador = entrevistador;
        this.fecha = fecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Enter.theValue(tituloEntrevista).into(TXT_INTERVIEW_TITLE),
               Enter.theValue(entrevistador).into(TXT_INTERVIEWER),
               WaitUntil.the(OPT_INTERVIEWER, isVisible()).forNoMoreThan(8).seconds(),
               Click.on(OPT_INTERVIEWER),
               Enter.theValue(fecha).into(TXT_FECHA),
               Click.on(BTN_SAVE),
               Click.on(BTN_MARK_INTERVIEW_PASSED),
               Click.on(BTN_SAVE),
               Click.on(BTN_OFFER_JOB),
               Click.on(BTN_SAVE),
               Click.on(BTN_HIRE),
               Click.on(BTN_SAVE)
       );

    }

    public static LlenarFormularioApplication llenadoformularioApp (String tituloEntrevista, String entrevistador, String fecha){
        return Instrumented.instanceOf(LlenarFormularioApplication.class).withProperties(tituloEntrevista,entrevistador,fecha);
    }
}
