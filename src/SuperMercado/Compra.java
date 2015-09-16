/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Compra {
    
    private float CostoTotal;
    private LinkedList<DetalleCompra> Detalles ;
    private Date FechaCompra;
    private Cliente Cliente;
    private Empleado Empleado;

    public Compra(Empleado Empleado) {
       
        
        
        this.CostoTotal = 0;
        this.Detalles = new LinkedList<>();
        this.FechaCompra = FechaCompra;
        this.Cliente = Cliente;
        this.Empleado = Empleado;
    }

    public float getCostoTotal() {
        return CostoTotal;
    }

    
    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }
    
    public LinkedList<DetalleCompra> getDetalles() {
        return Detalles;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }
    
   
    public void addDetalle(DetalleCompra detalle) {
        Detalles.add(detalle);
        this.CostoTotal += detalle.getProducto().getCosto();
    }
    
    public void acomularPuntos(){
      int t=0;
        if(CostoTotal>=200000){
            t=  (int) Math.floor(CostoTotal/10000);
        }
       this.Cliente.incrementarPuntos(t);
    }

    @Override
    public String toString() {
        return "Compra{" + "CostoTotal=" + CostoTotal + ", Detalles=" + Detalles + ", FechaCompra=" + FechaCompra + ", Cliente=" + Cliente + ", Empleado=" + Empleado + '}';
    }

    

   
    
   

    
}
