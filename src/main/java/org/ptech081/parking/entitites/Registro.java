package org.ptech081.parking.entitites;
import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    //Atributos intrinsecos
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public LocalTime horaInicio;
    public LocalTime horaFin;
    public long valor;

    //Atributos de relación
    public Cupo cupo; 
    public Carro carro;
    public Cliente cliente;
    public Empleado empleado;

    

    // Constructores
    public Registro() {
    }


    public Registro(LocalDate fechaInicio, LocalDate fechaFin, LocalTime horaInicio, LocalTime horaFin, long valor,
            Cupo cupo, Carro carro, Cliente cliente, Empleado empleado) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.valor = valor;
        this.cupo = cupo;
        this.carro = carro;
        this.cliente = cliente;
        this.empleado = empleado;
       
    }


  
     

}
