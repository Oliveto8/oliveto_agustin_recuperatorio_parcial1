package modelo;

import java.time.LocalDate;
import exceptions.CompletarCampoException;

public class PedidoElectronico extends Pedido{
    
    private String motivo;
    private double porcentajeExtra;

    public PedidoElectronico(String motivo, double porcentajeExtra, int idPedido, LocalDate fechaCreacion, double montoBase) throws CompletarCampoException{
        super(idPedido, fechaCreacion, montoBase);
        this.motivo = motivo;
        this.porcentajeExtra = porcentajeExtra;
        if (motivo == null){
            throw new CompletarCampoException("Es obligatorio completar el motivo");
        }            
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws CompletarCampoException {
        if (motivo == null){
            throw new CompletarCampoException("Es obligatorio completar el motivo");
        }   
        this.motivo = motivo;
    }

    public double getPorcentajeExtra() {
        return porcentajeExtra;
    }

    public void setPorcentajeExtra(double porcentajeExtra) {
        this.porcentajeExtra = porcentajeExtra;
    }

    @Override
    public String toString() {
        return "PedidoElectronico{" + "motivo= " + motivo + ", porcentajeExtra= " + porcentajeExtra + '}';
    }
    @Override
    public double calcularPrecioFinal(){
        double precioFinal = this.montoBase + (this.porcentajeExtra / 100);
        
        return precioFinal;
    }
    
}
