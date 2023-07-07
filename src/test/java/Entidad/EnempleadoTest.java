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
public class EnempleadoTest {
    
    public EnempleadoTest() {
    }

    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Enempleado instance = new Enempleado();
        int expResult = 0;
        int result = instance.getDni();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 0;
        Enempleado instance = new Enempleado();
        instance.setDni(dni);
    }

    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Enempleado instance = new Enempleado();
        String expResult = "";
    }

    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Enempleado instance = new Enempleado();
        instance.setNom(nom);
    }

    @Test
    public void testGetApe() {
        System.out.println("getApe");
        Enempleado instance = new Enempleado();
        String expResult = "";
    }

    @Test
    public void testSetApe() {
        System.out.println("setApe");
        String ape = "";
        Enempleado instance = new Enempleado();
        instance.setApe(ape);
    }

    @Test
    public void testGetDir() {
        System.out.println("getDir");
        Enempleado instance = new Enempleado();
        String expResult = "";
    }

    @Test
    public void testSetDir() {
        System.out.println("setDir");
        String dir = "";
        Enempleado instance = new Enempleado();
        instance.setDir(dir);
    }

    @Test
    public void testGetCel() {
        System.out.println("getCel");
        Enempleado instance = new Enempleado();
        int expResult = 0;
        int result = instance.getCel();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCel() {
        System.out.println("setCel");
        int cel = 0;
        Enempleado instance = new Enempleado();
        instance.setCel(cel);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Enempleado instance = new Enempleado();
        String expResult = "";
        String result = instance.getEmail();
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Enempleado instance = new Enempleado();
        instance.setEmail(email);
    }

    @Test
    public void testGetClave() {
        System.out.println("getClave");
        Enempleado instance = new Enempleado();
        String expResult = "";
    }

    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        Enempleado instance = new Enempleado();
        instance.setClave(clave);
    }

    @Test
    public void testGetEst() {
        System.out.println("getEst");
        Enempleado instance = new Enempleado();
        String expResult = "";
    }

    @Test
    public void testSetEst() {
        System.out.println("setEst");
        String est = "";
        Enempleado instance = new Enempleado();
        instance.setEst(est);
    }
    
}
