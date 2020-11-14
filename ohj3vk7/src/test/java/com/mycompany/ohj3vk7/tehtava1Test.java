/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ohj3vk7;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tommi
 */
public class tehtava1Test {
    
    public tehtava1Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    @org.junit.jupiter.api.Test
    public void testYmpyranAla() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(78.54, tehtava1.ympyranAla(5));
        assertEquals(3.14, tehtava1.ympyranAla(1));
        assertEquals(28.27, tehtava1.ympyranAla(3));
    }
    @org.junit.jupiter.api.Test
    public void testTarkistasotu() {
        assertEquals(true, tehtava1.tarkistaSotu("131052-308T"));
        assertEquals(false,tehtava1.tarkistaSotu("111111-1111"));
    }
    @org.junit.jupiter.api.Test
    public void testMuunna() {
        assertEquals("Asdmoi",tehtava1.muunna("asd moi"));
        assertEquals("Tervevaan!",tehtava1.muunna("ter  ve     v  a an!"));
        assertEquals("Testivoijeee", tehtava1.muunna("testi v o i j e e e"));
    }
    
}
