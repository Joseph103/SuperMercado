/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;


/**
 *
 * @author User
 */
public class DetalleCompra {
    
     private int cantidadProductos;
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
     
  public float calcularDetalle(String codigo,float costo){
        float c = 0;
      if(Producto.getCodigo()== codigo){
           c=Producto.getCosto()+costo;
        }
        return c;
    }
  
    @Override
    public String toString() {
        return "DetalleCompra{" + "cantidadProductos=" + cantidadProductos + '}';
    }
    
}
