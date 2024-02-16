package org.ptech081.parking;
import org.ptech081.parking.entitites.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        //crear carros con los constructores:
        Carro carrito1 = new Carro("ASB 456", TipoVehiculo.MOTO);

        Carro carrito2 = new Carro();
        carrito2.placa = "ERRT 566";
        carrito2.tipoVehiculo = TipoVehiculo.CAMIONETA;

        //crear clientes
        Cliente cliente1 = new Cliente("samuel ", "Perez", 6785875878L);
        Cliente cliente2 = new Cliente("Luisa ", "Rodriguez", 78575878L);

        //invocar el metodo addcar
        cliente1.addCar(carrito1);
        cliente1.addCar("ASB 456", TipoVehiculo.BUS);
        cliente2.addCar(carrito2);
        cliente2.addCar("DEC 654", TipoVehiculo.CAMIONETA);

        //crear dos cupos
        Cupo cupo1 = new Cupo(cupo:"A");
        Cupo cupo2 = new Cupo(cupo:"B");

        //Crear dos registros E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);
        LocalTime horaInicio = LocalTime.now();
        LocalTime horaFin = LocalTime.of(12, 45, 0);
        //2
        LocalDate fechaInicio1 = LocalDate.of(2024,Month.FEBRUARY,16);
        LocalDate fechaFin1 = LocalDate.of(2024, Month.FEBRUARY,26);
        LocalTime horaInicio1 = LocalTime.now();
        LocalTime horaFin1 = LocalTime.of(17, 35, 10);



        java.util.List<Registro> misRegistros = new ArrayList<Registro>();

        //Crear registro
        Registro registro1 = new Registro( fechaInicio ,
                                            fechaFin,
                                            horaInicio,
                                            horaFin,
                                            5000,
                                            cupo1 ,
                                            cliente1.misCarros.get(1),
                                            cliente1);
                                            

        Registro registro2 = new Registro( fechaInicio1 ,
                                            fechaFin1,
                                            horaInicio1,
                                            horaFin1,
                                            4000,
                                            cupo2 ,
                                            cliente2.misCarros.get(2),
                                            cliente2);

        //Añadir a la lista
        misRegistros.add(registro1);
        //
        System.out.println("Registros de E/S parking");
        for(Registro r : misRegistros){
            System.out.println("Cliente" + 
                                r.cliente.nombre +" "+
                                r.cliente.apellido +"|"+
                                r.carro.placa + " " +
                                r.carro.tipoVehiculo + "|" +
                                r.valor + "|" +
                                r.fechaInicio + " " +
                                r.horaInicio + "|"
            );
        }

      



    }
}