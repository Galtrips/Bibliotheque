/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bibliothèque.Adherent;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author p2103678
 */
public class AdherentTest {
    
    private Adherent ada;
    private Adherent test;
    
    public AdherentTest() {
    }
    
    @Before public void setUp() {
        ada = new Adherent(2003,"Lovelace", "Ada");
        test = new Adherent(2003,"Test", "test");
    }
    
    
    /**
     * Test of getIdentifiant method, of class Adherent.
     */
    @Test
    public void testGetIdentifiant() {
        assertTrue(ada.getId() > 123456);
        assertTrue(ada.getId() < test.getId());
    }

    /**
     * Test of getAge method, of class Adherent.
     */
    @Test
    public void testGetAge() {
       assertEquals(2003, ada.getAnneeDeNaissance());
    }

    /**
     * Test of getNom method, of class Adherent.
     */
    @Test
    public void testGetNom() {
        assertEquals("Lovelace", ada.getNom());
    }

    /**
     * Test of getPrenom method, of class Adherent.
     */
    @Test
    public void testGetPrenom() {
        assertEquals("Ada", ada.getPrenom());
    }

    /**
     * Test of setNom method, of class Adherent.
     */
    @Test
    public void testSetNom() {
        ada.setNom("Love");
        assertEquals("Love", ada.getNom());
    }

    /**
     * Test of setPrenom method, of class Adherent.
     */
    @Test
    public void testSetPrenom() {
        ada.setPrenom("Jackie");
        assertEquals("Jackie", ada.getPrenom());
    }
    
    /**
     * Test of setAge method, of class Adherent.
     */
    @Test
    public void testSetAge() {
        ada.setAnneeDeNaissance(2004);
        assertEquals(2004, ada.getAnneeDeNaissance());
    }
}
