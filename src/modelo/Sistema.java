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
    
}
