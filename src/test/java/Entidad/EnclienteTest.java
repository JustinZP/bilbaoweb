/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Entidad;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reneman
 */
public class EnclienteTest {
    
    public EnclienteTest() {
    }

    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Encliente instance = new Encliente();
        int expResult = 0;
        int result = instance.getDni();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 0;
        Encliente instance = new Encliente();
        instance.setDni(dni);
    }

    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Encliente instance = new Encliente();
        String expResult = "";
    }

    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Encliente instance = new Encliente();
        instance.setNom(nom);
    }

    @Test
    public void testGetApe() {
        System.out.println("getApe");
        Encliente instance = new Encliente();
        String expResult = "";
    }

    @Test
    public void testSetApe() {
        System.out.println("setApe");
        String ape = "";
        Encliente instance = new Encliente();
        instance.setApe(ape);
    }

    @Test
    public void testGetDir() {
        System.out.println("getDir");
        Encliente instance = new Encliente();
        String expResult = "";
    }

    @Test
    public void testSetDir() {
        System.out.println("setDir");
        String dir = "";
        Encliente instance = new Encliente();
        instance.setDir(dir);
    }

    @Test
    public void testGetCel() {
        System.out.println("getCel");
        Encliente instance = new Encliente();
        int expResult = 0;
        int result = instance.getCel();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCel() {
        System.out.println("setCel");
        int cel = 0;
        Encliente instance = new Encliente();
        instance.setCel(cel);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Encliente instance = new Encliente();
        String expResult = "";
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Encliente instance = new Encliente();
        instance.setEmail(email);
    }

    @Test
    public void testGetClave() {
        System.out.println("getClave");
        Encliente instance = new Encliente();
        String expResult = "";
    }

    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        Encliente instance = new Encliente();
        instance.setClave(clave);
    }
    
}
