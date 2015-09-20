/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

import java.util.Objects;


/**
 *
 * @author User
 */
public class DetalleCompra {
    
     public int cantidadProductos;
     private Producto Producto;

    public DetalleCompra(int cantidadProductos, Producto Producto) {
        this.cantidadProductos = cantidadProductos;
        this.Producto = Producto;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public Producto getProducto() {
        return Producto;
    }
     
  public float calcularDetalle(){
        float c = 0;
           c= Producto.getCosto()*cantidadProductos;
      return c;
    }
  
    @Override
    public String toString() {
        return "DetalleCompra{" + "cantidadProductos=" + cantidadProductos + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleCompra other = (DetalleCompra) obj;
        if (!Objects.equals(this.Producto, other.Producto)) {
            return false;
        }
        return true;
    }
    
}
