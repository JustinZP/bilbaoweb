/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
    features = "src/test/java/pruebas",
    glue="steps",
    plugin={
     "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
     "json:target/cucumber-report/editartest/cucumber.json",
     "html:target/cucumber-report/editartest/cucumber-html_report",
     "html:target/cucumber-report/editartest/editarreport.html",
     }
    )

public class runeditar {
}

