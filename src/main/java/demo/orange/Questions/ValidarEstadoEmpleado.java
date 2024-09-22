package demo.orange.Questions;

import demo.orange.UserInterfaces.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarEstadoEmpleado implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return RecruitmentPage.LBL_DESCRIPTION.resolveFor(actor).isVisible();
    }

    public static Question textoContratado(){
        return new ValidarEstadoEmpleado();
    }
}
