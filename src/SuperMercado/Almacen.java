/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Almacen {
    
    public Empleado logueado = null;
    private String Nombre;
    private String NIT;
    private LinkedList<Empleado> Empleados; 
    private LinkedList<Producto> Productos;
    private LinkedList<Cliente> Clientes;
    private LinkedList<Compra> Compras;
    private Exception ObjectNotFound;

    public Almacen(String Nombre, String NIT) throws Exception {
      if((Nombre == null)||("".equals(Nombre.trim()))){
            throw new Exception("Es necesarion digitar un Nombre");
      }
        if((NIT == null)||("".equals(NIT.trim()))){
            throw new Exception("Es necesarion digitar un NIT");
        }
            
        this.Nombre = Nombre;
        this.NIT = NIT;
        this.Empleados = new LinkedList<>();
        this.Productos = new LinkedList<>();
        this.Clientes = new LinkedList<>();
        this.Compras = new LinkedList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public LinkedList<Compra> getCompras() {
        return Compras;
    }
    
    
    

    public void addEmpleados(Empleado empleado) throws Exception{
        for (Empleado Empleado : Empleados) {
           
            if(this.Empleados.contains(empleado)){
            throw new Exception("el empleado ya se encuentra en la lista");
           }
        
        }
      
            this.Empleados.add(empleado);
        
    }
    public void addProducto(Producto producto) throws Exception{
        for (Producto Producto:Productos) {
           
            if(this.Productos.contains(producto)){
            throw new Exception("el producto ya se encuentra en la lista");
           }
        
        }
      
            this.Productos.add(producto);
        
    }
    public void addCliente(Cliente cliente) throws Exception{
        for (Cliente Cliente: Clientes) {
           
            if(this.Clientes.contains(cliente)){
            throw new Exception("el empleado ya se encuentra en la lista");
           }
        
        }
      
            this.Clientes.add(cliente);
        
    }
    public void addCompra(Compra compra) throws Exception{
        for (Compra Compra : Compras) {
           
            if(this.Compras.contains(compra)){
            throw new Exception("el empleado ya se encuentra en la lista");
           }
        
        }
      
            this.Compras.add(compra);
        
    }
    
    
    
    
    public Empleado BuscarEmpleados(String identificacion) throws Exception{
        for (Empleado empleado : Empleados) {
            if(empleado.getIdentificacion().equals( identificacion)){
                return empleado;
            }
            
        }
       throw new ObjectNotFoundException("el empleado con identificacion "+identificacion+" no se encuentra");
    }
    
    public Empleado BuscarEmpleado(String login) throws Exception{
        for (Empleado empleado : Empleados) {
            if(empleado.getLogin().equals( login)){
                return empleado;
            }
            
        }
       throw new ObjectNotFoundException("el empleado con login: "+login+" no se encuentra");
    }
    
    
       public Producto BuscarProductos(String codigo) throws Exception{
        for (Producto producto: Productos) {
            if(producto.getCodigo().equals(codigo)){
                return producto;
            }
            
        }
       throw new ObjectNotFoundException("el producto con codigo"+codigo+"no se encuentra");
    }
      
       public Cliente BuscarCliente(long identificacion) throws Exception{
        for (Cliente cliente: Clientes) {
            if(cliente.getIdentificacion()==identificacion){
                return cliente;
            }
            
        }
       throw new ObjectNotFoundException("el cliente con identificacion"+identificacion+"no se encuentra");
    }
    

    @Override
    public String toString() {
        return "Almacen{" + "Nombre=" + Nombre + ", NIT=" + NIT + ", Empleados=" + Empleados + ", Productos=" + Productos + ", Clientes=" + Clientes + ", Compras=" + Compras + ", ObjectNotFound=" + ObjectNotFound + '}';
    }
    

   
 
    
}
