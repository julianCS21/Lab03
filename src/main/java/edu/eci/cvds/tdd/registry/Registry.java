package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

    private ArrayList<Person> registers = new ArrayList<Person>();
    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.return RegisterResult.VALID;


        if(p.getAge() <= 0){
            return RegisterResult.INVALID_AGE;
        }

        if(p.getAge() > 0 && p.getAge()< 18 ){
            return RegisterResult.UNDERAGE;
        }

        if(p.getAge() > 100 || !p.isAlive()){
            return RegisterResult.DEAD;
        }

        for(Person pe : registers){
            if(pe.getName().equals(p.getName())){
                return RegisterResult.DUPLICATED;
            }
        }
        registers.add(p);
        return RegisterResult.VALID;


    }
}
