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
public class Cliente {
   
    private  long Identificacion;
    private String Nombres;
    private String Apellidos;
    private int Puntos;

    public Cliente(long Identificacion, String Nombres, String Apellidos, int Puntos) throws Exception {
        
        if(((Nombres)== null||((Apellidos) == null))||("".equals(Nombres.trim()))||("".equals(Apellidos.trim()))){
            throw new Exception("Es necesarion digitar un nombre y un apellido");
        }
        
        if(Puntos<0){
            throw new Exception("Los puntos no pueden ser menor que cero");
        }
        
        this.Identificacion = Identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Puntos = 0;
    }

    public long getIdentificacion() {
        return Identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }
    
    public void incrementarPuntos(int puntos){
        this.Puntos += puntos;
        
    }
    
    
    @Override
    public String toString() {
        return "Cliente{" + "Identificacion=" + Identificacion + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Puntos=" + Puntos + '}';
    }

   
    
}
