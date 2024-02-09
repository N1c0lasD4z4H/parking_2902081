package org.ptech081.parking;
import org.ptech081.parking.entitites.*;

public class Main {
    public static void main(String[] args) {
        
        //crear carros con los constructores:
        Carro carrito1 = new Carro("ASB 456", TipoVehiculo.MOTO);

        Carro carrito2 = new Carro();
        carrito2.placa = "ERRT 566";
        carrito2.tipoVehiculo = TipoVehiculo.CAMIONETA;

        //crear clientes
        Cliente cliente1 = new Cliente("samuel ", "Perez", 6785875878L);

        //invocar el metodo addcar
        cliente1.addCar(carrito1);
        cliente1.addCar("ASB 456", TipoVehiculo.BUS);
        //recorrer los carros del cliente
        for(Carro c : cliente1.misCarros){
            System.err.println(c.placa + "" + c.tipoVehiculo);
            System.err.println("----------------");
        }



    }
}