package steps;

import Conexion.conexion;
import Entidad.Enempleado;
import Negocio.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.sql.Statement;
import static org.junit.Assert.*;

public class editar {
    private Enempleado empleado;
    private String consultaGenerada;
    private Boolean resultado;

    @Given("un empleado con DNI {string}")
    public void unEmpleadoConDNI(String dni) {
        Enempleado empleado = new Enempleado();
        // Puedes establecer cualquier valor inicial adicional que necesites para las pruebas.
    }

    @When("se edita el nombre a {string} y el apellido a {string}")
    public void seEditaElNombreYApellido(String nombre, String apellido) {
        empleado.setNom(nombre);
        empleado.setApe(apellido);
        MtdEditEmpleado(empleado);
    }

    @Then("la consulta SQL generada debe ser {string}")
    public void laConsultaSQLGeneradaDebeSer(String consultaEsperada) {
        assertEquals(consultaEsperada, consultaGenerada);
    }

    @Then("la consulta SQL generada no debe ser ejecutada y se debe retornar falso")
    public void laConsultaSQLNoDebeSerEjecutadaYSedbeRetornarFalso() {
        assertFalse(resultado);
    }

    // Método MtdEditEmpleado con la generación de la consulta
    public Boolean MtdEditEmpleado(Enempleado Eemp) {
        consultaGenerada = "UPDATE empleado SET nombre='" + Eemp.getNom() + "' apellido='" + Eemp.getApe()
                + "' direccion='" + Eemp.getDir() + "' where dni='" + Eemp.getDni() + "'";
        System.out.println(consultaGenerada);
        try {
            Statement st = conexion.obtener().createStatement();
            st.executeUpdate(consultaGenerada);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}