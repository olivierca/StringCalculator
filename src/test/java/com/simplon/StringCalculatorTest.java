package com.simplon;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class StringCalculatorTest

{

    /* Créer le test de la méthode Add pour que la méthode add accepte 0, 1 ou 2 chiffres
     et retourne leur somme (la chaîne vide
    retourne 0).
    Le caractère de séparation est la virgule.
    Exemple : add("")=0, add("1")=1 ou add("1,2")=3
     */

     @Test
    public void addTest_With_No_Number()
    {
        // set
        String x ="";
        StringCalculator calculator = new StringCalculator();
        //test
        int result = calculator.add(x);
        //assert
        assertEquals(0,result);

    }

    @Test
    public void addTest_With_one_Number()
    {
        // set
        String x ="1";
        StringCalculator calculator = new StringCalculator();
        //test
        int result = calculator.add(x);
        //assert
        assertEquals(1,result);

    }

    @Test
    public void addTest_With_two_Number()
    {
        // set
        String x ="1,2";
        StringCalculator calculator = new StringCalculator();
        //test
        int result = calculator.add(x);
        //assert
        assertEquals(3,result);

    }
}
