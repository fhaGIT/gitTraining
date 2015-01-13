package com.campany.git.training;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("hiiiiii");
        System.out.println("hiiiiii");
        System.out.println("hiiiiii");
        System.out.println("hiiiiii");
        System.out.println("hiiiiii");
        System.out.println("hiiiiii");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	System.out.println("hello world");
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
