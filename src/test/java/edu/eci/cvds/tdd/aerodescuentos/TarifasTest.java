package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

    private CalculadoraDescuentos calculadora = new CalculadoraDescuentos();

    @Test(expected = descuentosException.class )
    public void IfTheAgeIsNegativeShouldThrowAnException() throws descuentosException {
        //arrange
        int edad = -14;
        long tarifa = 10000;
        int dias = 20;
        long expected = 10000;


        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);





    }

    @Test(expected = descuentosException.class )
    public void IfTheAgeIsMostThan100ShouldThrowAnException() throws descuentosException {
        //arrange
        int edad = 100;
        long tarifa = 10000;
        int dias = 20;
        long expected = 10000;


        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);



    }

    @Test
    public void ifAgeIsGreaterThan0andLessThan18ShouldCalculate() throws descuentosException {
        //arrange
        int edad = 15;
        long tarifa = 100000;
        int dias = 14;
        long expected = (long) (tarifa - tarifa*0.05);


        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }

    @Test
    public void IfAgeisGreaterThan18andLessThan66ShouldNotChange() throws descuentosException {
        //arrange
        int edad = 21;
        long tarifa = 100000;
        int dias = 14;
        long expected = tarifa;


        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }

    @Test
    public void IfAgeisGreaterThan65ShouldCalculate() throws descuentosException {
        //arrange
        int edad = 67;
        long tarifa = 100000;
        int dias = 14;
        long expected = (long) (tarifa - (tarifa*0.08));


        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }



    @Test(expected = descuentosException.class)
    public void IfDaysAreNegativesShouldThrowAnException() throws descuentosException {
        //arrange
        int edad = 15;
        long tarifa = 100000;
        int dias = -14;
        long expected = (long) (tarifa - tarifa*0.08);





        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }

    @Test
    public void IfDaysAreLessThan21ShouldNotChange() throws descuentosException {
        //arrange
        int edad = 21;
        long tarifa = 100000;
        int dias = 18;
        long expected = tarifa;





        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }

    @Test
    public void IfDaysAreGreaterThan20ShouldCalculate() throws descuentosException {
        //arrange
        int edad = 30;
        long tarifa = 100000;
        int dias = 21;
        long expected = (long) (tarifa - tarifa*0.15);





        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }


    @Test(expected = descuentosException.class)
    public void IfRateIsNegativeShouldThrowAnException() throws descuentosException {
        //arrange
        int edad = 67;
        long tarifa = -100000;
        int dias = 14;
        long expected = (long) (tarifa - tarifa*0.08);



        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }

    @Test
    public void ifTheRateIsCorrectShouldCalculate() throws descuentosException {
        //arrange
        int edad = 21;
        long tarifa = 100000;
        int dias = 14;
        long expected = (tarifa);



        //act
        long resultado = calculadora.calculoTarifa(tarifa,dias,edad);

        //Assert
        Assert.assertEquals(resultado,expected);

    }



}


