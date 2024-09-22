package demo.orange.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro_empleado.feature",
        //tags = "@Busqueda",
        glue ="demo.orange.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class ContratacionEmpleadoRunner {
}
