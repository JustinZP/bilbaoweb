/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Negocio;

import Entidad.Encliente;
import Entidad.Enempleado;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reneman
 */
public class NegempleadoTest {
    
    public NegempleadoTest() {
    }

    @Test
    public void testMtdListar() throws Exception {
        System.out.println("MtdListar");
    }

    @Test
    public void testMtdAgregarEmpleado() {
        System.out.println("MtdAgregarEmpleado");
        Enempleado Eemp = new Enempleado();
        Negempleado instance = new Negempleado();
        Boolean result = instance.MtdAgregarEmpleado(Eemp);
        assertNotNull(result);
    }

    @Test
    public void testMtdOnEmpleado() {
        System.out.println("MtdOnEmpleado");
        int dni = 0;
        Negempleado instance = new Negempleado();
        instance.MtdOnEmpleado(dni);
    }

    @Test
    public void testMtdOffEmpleado() {
        System.out.println("MtdOffEmpleado");
        int dni = 0;
        Negempleado instance = new Negempleado();
        instance.MtdOffEmpleado(dni);
    }

    @Test
    public void testMtdEditEmpleado() {
        System.out.println("MtdEditEmpleado");
        Enempleado Eemp = new Enempleado();
        Negempleado instance = new Negempleado();
        Boolean result = instance.MtdEditEmpleado(Eemp);
        assertNotNull(result);
    }
    
}
