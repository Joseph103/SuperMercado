/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

import ventanas.AdExterno;
import ventanas.Administrador;

/**
 *
 * @author User
 */
public class SuperMercado {
 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //Datos Base
       
       
        

            try {

            Almacen market = new Almacen("SuperMarket Best buy", "800.456.123-1");
            
            Empleado[] Empleados = 
               {new Empleado("12345", "Fabio", "belaquex", "tacobel", "F123"),
                new Empleado("12384", "Big", "Nigga", "nig", "nigga123")};
            
            Producto[] Productos = 
               {new Producto("001", "RAM 4GB", 90000),
                new Producto("002", "RAM 8GB", 180000),
                new Producto("003", "SDD 256GB", 320000),
                new Producto("004", "HUB USB", 10000) };
            
//        DetalleCompra detalle = new DetalleCompra(4,item);
            Cliente[] Clientes = 
               {new Cliente(123456789, "Tarzan", "amazonas",0),
                new Cliente(12345, "Buss", "Light",0)};


                for (Empleado empleado : Empleados) {
                    market.addEmpleados(empleado);
                }

            
               
            for (Cliente customer : Clientes) {
                  market.addCliente(customer);
                }

            
            
            for (Producto producto : Productos) {
                market.addProducto(producto);
            }

            
        AdExterno ventana = new AdExterno(market);
         ventana.setVisible(true);
       
            
         } catch (ObjectNotFoundException notFound) {
            notFound.printStackTrace();
        } catch (Exception error) {
            error.printStackTrace();
        }
   
    }

}