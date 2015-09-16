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
public class Producto {
    
    private String Codigo;
    private String Nombre;
    private float Costo;

    public Producto(String Codigo, String Nombre, float Costo) throws Exception {
       
        if((Nombre == null)||("".equals(Nombre.trim()))){
            throw new Exception("Es necesarion digitar un Nombre");
      }
        if((Codigo == null)||("".equals(Codigo.trim()))){
            throw new Exception("Es necesarion digitar un Codigo");
      }
        
        if(Costo<0){
            throw new Exception("Es necesarion que el costo se mayor a cero");
      }
        
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Costo = Costo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getCosto() {
        return Costo;
    }

    
    @Override
    public String toString() {
        return "Producto{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Costo=" + Costo + '}';
    }
    
    
    
}
