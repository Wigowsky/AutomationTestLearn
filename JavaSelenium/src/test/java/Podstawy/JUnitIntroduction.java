package Podstawy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Executed before class...");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Executed after class...");
    }

//    Wykonywane przed każdym testem

    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before...");
    }

    //    Wykonywane po każdym teście

    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after...");
    }

    @Test
    public void test1() {
        System.out.println("Executed Test1...");
    }

    @Test
    public void test2() {
        System.out.println("Executed Test2...");
    }

}
