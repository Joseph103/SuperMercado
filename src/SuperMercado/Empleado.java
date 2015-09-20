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
public class Empleado {
    private String Identificacion;
    private String Nombres;
    private String Apellidos;
    private String Login;
    private String Contraseña;

    public Empleado(String Identificacion, String Nombres, String Apellidos, String Login, String Contraseña) throws Exception {
        
        if(((Nombres)== null||((Apellidos) == null))||("".equals(Nombres.trim()))||("".equals(Apellidos.trim()))){
            throw new Exception("Es necesarion digitar un nombre y apellido ");
        }
        
        if(((Login)== null||((Contraseña) == null))||("".equals(Login.trim()))||("".equals(Contraseña.trim()))){
            throw new Exception("Es necesarion digitar un login y una contraseña");
        }
        
        this.Identificacion = Identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Login = Login;
        this.Contraseña = Contraseña;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getLogin() {
        return Login;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "Identificacion=" + Identificacion + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Login=" + Login + ", Contrase\u00f1a=" + Contraseña + '}';
    }
    
    
    
}
