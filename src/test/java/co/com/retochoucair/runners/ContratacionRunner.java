package co.com.retochoucair.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Contratacion.feature",
        glue = "co.com.retochoucair.stepdefinitions",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ContratacionRunner {

}
