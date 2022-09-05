package edu.eci.cvds.tdd.registry;

import edu.eci.cvds.tdd.registry.Gender;
import edu.eci.cvds.tdd.registry.Person;
import edu.eci.cvds.tdd.registry.RegisterResult;
import edu.eci.cvds.tdd.registry.Registry;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        //arrange
        Person person = new Person("Julian",10234,21, Gender.MALE,true);

        //act
        RegisterResult result = registry.registerVoter(person);

        //asserts
        Assert.assertEquals(RegisterResult.VALID, result);
    }


    @Test
    public void IfAgeIsLessThan18() {
        //arrange
        Person person = new Person("Julian",10234,5,Gender.MALE,true);

        //act
        RegisterResult result = registry.registerVoter(person);

        //asserts
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void IfAgeIsLessThan0() {
        //arrange
        Person person = new Person("Julian",10234,0,Gender.MALE,true);

        //act
        RegisterResult result = registry.registerVoter(person);

        //asserts
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


    @Test
    public void IfAgeIsExaggerated() {
        //arrange
        Person person = new Person("Julian",10234,159,Gender.MALE,true);

        //act
        RegisterResult result = registry.registerVoter(person);

        //asserts
        Assert.assertEquals(RegisterResult.DEAD, result);
    }


    @Test
    public void IfPersonIsDead() {
        //arrange
        Person person = new Person("Julian",10234,50,Gender.MALE,false);

        //act
        RegisterResult result = registry.registerVoter(person);

        //asserts
        Assert.assertEquals(RegisterResult.DEAD, result);
    }


    @Test
    public void IfRegisterIsDuplicated() {
        //arrange
        Person person = new Person("Julian",10234,25,Gender.MALE,true);

        //act
        RegisterResult result = registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person);

        //asserts
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }











}
