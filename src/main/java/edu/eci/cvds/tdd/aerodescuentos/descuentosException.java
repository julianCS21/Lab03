package edu.eci.cvds.tdd.aerodescuentos;

public class descuentosException  extends Exception{

    final static String PARAMETRO_INVALIDO = "PARAMETROS INVALIDO";

    public descuentosException(String message){
        super(message);
    }

}
