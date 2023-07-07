/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Negocio;

import Entidad.Encliente;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reneman
 */
public class NegclienteTest {
    
    public NegclienteTest() {
    }

    @Test
    public void testMtdListar() throws Exception {
        System.out.println("MtdListar");
        Negcliente instance = new Negcliente();
        ResultSet expResult = null;
        ResultSet result = instance.MtdListar();
        assertEquals(expResult, result);
    }

    @Test
    public void testMtdAgregarCliente() {
    System.out.println("MtdAgregarCliente");
    Encliente Ecli = new Encliente(); // Crea una instancia válida de Encliente
    Negcliente instance = new Negcliente();
    Boolean expResult = false; // Especifica el resultado esperado
    Boolean result = instance.MtdAgregarCliente(Ecli);
    assertEquals(expResult, result);
}

    
}
