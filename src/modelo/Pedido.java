package modelo;

import java.time.LocalDate;

public abstract class Pedido {

    protected static int contador = 1;
    protected int idPedido;
    protected LocalDate fechaCreacion;
    protected double montoBase;         
    
    public Pedido(int idPedido, LocalDate fechaCreacion, double montoBase){
        this.idPedido = contador++;
        this.fechaCreacion = LocalDate.now();
        this.montoBase = montoBase;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setMontoBase(double montoBase) {
        this.montoBase = montoBase;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido= " + idPedido + ", fechaCreacion= " + fechaCreacion + ", montoBase= " + montoBase + '}';
    }
    
    public abstract double calcularPrecioFinal();
}
