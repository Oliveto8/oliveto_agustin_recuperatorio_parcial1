package test;

import modelo.*;
import java.time.LocalDate;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        System.out.println("Pruebas de Creacion de Objetos");
        System.out.println("1-1");
        
        try{
            Pedido pedidoPapelMensual = new PedidoPapelMensual(LocalDate.of(2020, 12, 12),5 ,1, LocalDate.of(2020, 12, 15),2500.0);
            System.out.println("PedidoPapelMensual agregado exitosamente con ID 1.");
            System.out.println(pedidoPapelMensual.toString());
        } catch (ValorPositivoException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("1-2");
        try{
            Pedido pedidoElectronico = new PedidoElectronico("PC no funciona", 200.0, 2, LocalDate.of(2020, 12, 12),3000.0 );
            System.out.println("PedidoElectronico agregado exitosamente con ID 2.");
            System.out.println(pedidoElectronico.toString());
        } catch (CompletarCampoException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("1-3");
        
        try{
            Pedido pedidoPapelMensual = new PedidoPapelMensual(LocalDate.of(2020, 12, 12),0 ,3, LocalDate.of(2020, 12, 15),2500.0);
            System.out.println("PedidoPapelMensual agregado exitosamente con ID 3.");
            System.out.println(pedidoPapelMensual.toString());
        } catch (ValorPositivoException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Pedido pedidoElectronico = new PedidoElectronico("", 200.0, 4, LocalDate.of(2020, 12, 12),3000.0 );
            System.out.println("PedidoElectronico agregado exitosamente con ID 4.");
            System.out.println(pedidoElectronico.toString());
        } catch (CompletarCampoException e){
            System.out.println(e.getMessage());
        }
    }
}
