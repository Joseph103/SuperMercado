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
    private LinkedList<DetalleCompra> Detalles;
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

        if (Detalles.contains(detalle)) {
            int posdetalle = Detalles.indexOf(detalle);
            DetalleCompra Detail = Detalles.get(posdetalle);
            this.CostoTotal -= Detail.calcularDetalle();
            Detail.cantidadProductos += detalle.cantidadProductos;
            this.CostoTotal += Detail.calcularDetalle();
        } else {

            Detalles.add(detalle);
            this.CostoTotal += detalle.calcularDetalle() ;
        }

    }

//      public DetalleCompra BuscarDetalle(DetalleCompra detalle) throws ObjectNotFoundException{
//       
//          for (DetalleCompra Detalle : Detalles) {
//              if (Detalle.equals(detalle)){
//                  return detalle;
//              }
//              
//          }
//       throw new ObjectNotFoundException("el detalle de compra no se encuentra");
//   }
    
    public void removeDetalle(int detalle){
        
        DetalleCompra Detalle =this.Detalles.get(detalle);
        this.Detalles.remove(detalle);
        this.CostoTotal -=Detalle.calcularDetalle();
        
    }
    
    public int acomularPuntos() {
        int t = 0;
        if (CostoTotal >= 200000) {
            t = (int) Math.floor(CostoTotal / 10000);
        }
       return t;
       
    }

    @Override
    public String toString() {
        return "Compra{" + "CostoTotal=" + CostoTotal + ", Detalles=" + Detalles + ", FechaCompra=" + FechaCompra + ", Cliente=" + Cliente + ", Empleado=" + Empleado + '}';
    }

}
