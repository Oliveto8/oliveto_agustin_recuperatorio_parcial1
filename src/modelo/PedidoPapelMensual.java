package modelo;

import exceptions.ValorPositivoException;
import java.time.LocalDate;

public class PedidoPapelMensual extends Pedido{
    
    private LocalDate fechaEntrega;
    private int cantidadResmas;

    public PedidoPapelMensual(LocalDate fechaEntrega, int cantidadResmas, int idPedido, LocalDate fechaCreacion, double montoBase) throws ValorPositivoException {
        super(idPedido, fechaCreacion, montoBase);
        this.fechaEntrega = fechaEntrega;
        this.cantidadResmas = cantidadResmas;
        if (cantidadResmas <= 0){
            throw new ValorPositivoException("La cantidad de resmas tiene que ser mayor a 0");
        }
        
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadResmas() {
        return cantidadResmas;
    }

    public void setCantidadResmas(int cantidadResmas) throws ValorPositivoException {
        
        if (cantidadResmas <= 0){
            throw new ValorPositivoException("La cantidad de resmas tiene que ser mayor a 0");
        }
        this.cantidadResmas = cantidadResmas;
    }

    @Override
    public String toString() {
        return "PedidoPapelMensual{" + "fechaEntrega= " + fechaEntrega + ", cantidadResmas= " + cantidadResmas + '}';
    }
    
    @Override
    public double calcularPrecioFinal(){
        double precioFinal = this.montoBase * this.cantidadResmas;
        
        return precioFinal;
    }
    
}
