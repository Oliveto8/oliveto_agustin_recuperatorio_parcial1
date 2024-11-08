package modelo;

import java.util.List;
import java.util.ArrayList;
import exceptions.*;
import java.time.LocalDate;

public class Sistema {
    
    private List<Pedido> Pedidos;
    
    public Sistema() {
        this.Pedidos = new ArrayList<>();
    }

    public List<Pedido> getPedidos() {
        return Pedidos;
    }

    public void setPedidos(List<Pedido> Pedidos) {
        this.Pedidos = Pedidos;
    }
    
    public boolean agregarPedidoMensual(LocalDate fechaEntrega, int cantidadResmas,int idPedido,LocalDate fechaCreacion, double montoBase)throws ValorPositivoException{
        if (cantidadResmas <= 0){
            throw new ValorPositivoException("La cantidad de resmas tiene que ser mayor a 0");
        }
        PedidoPapelMensual pedido = new PedidoPapelMensual(fechaEntrega,cantidadResmas,idPedido, fechaCreacion, montoBase);
        
        Pedidos.add(pedido);
                
        return true;
    }
    
    public boolean agregarPedidoElectronico(String motivo, double porcentajeExtra, int idPedido, LocalDate fechaCreacion, double montoBase)throws CompletarCampoException{
        if (motivo == null){
            throw new CompletarCampoException("Es obligatorio completar el motivo");
        }  
        PedidoElectronico pedido = new PedidoElectronico(motivo, porcentajeExtra, idPedido, fechaCreacion,montoBase);
        
        Pedidos.add(pedido);
        
        return true;
    }
    
    public List<Pedido> traerPedidos(){
        return new ArrayList<>(Pedidos);
    } 
    
    public Pedido traerPedido(int idPedido){
        for(Pedido pedido : Pedidos){
            if (pedido.getIdPedido() == idPedido){
                return pedido;
            }
        }
        return null;
    }
    
    public List<Pedido> traerPedido(String motivo){
        List<Pedido> pedidosFiltrados = new ArrayList<>();
        
        for (Pedido pedido : Pedidos){
            if (pedido instanceof PedidoElectronico){
                PedidoElectronico pedidoElectronico = (PedidoElectronico) pedido;
                if (pedidoElectronico.getMotivo().equalsIgnoreCase(motivo)){
                    pedidosFiltrados.add(pedido);
                }
            }
        }
        return pedidosFiltrados;
    }
    
    
}
