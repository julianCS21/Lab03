package edu.eci.cvds.tdd.aerodescuentos;




public class CalculadoraDescuentos {

    public CalculadoraDescuentos(){
        super();

    }

    /**calcular la tarifa de cada billete según el trayecto, la antelación en la que  se obtiene el billete y la edad del pasajero, de acuerdo con la normativa 005.@param tarifaBase valor base del vuelo@param diasAntelacion dias de antelación del vuelo@param edad -edad del pasajero@throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]**/
    public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad) throws descuentosException {
        double descuento = 0.0;
        if(edad <= 0 || edad >= 100 || diasAntelacion < 0 || tarifaBase <= 0){
            throw new descuentosException(descuentosException.PARAMETRO_INVALIDO);

        }
        if(edad < 18){
            descuento += 0.05;
        }
        if(edad > 65){
            descuento += 0.08;
        }
        if(diasAntelacion > 20){
            descuento += 0.15;
        }
        return (long) (tarifaBase - tarifaBase * descuento);



    }
}
