/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

/**
 *
 * @author Joe
 */
public class ObjectNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>ObjectNotFoundException</code> without
     * detail message.
     */
    public ObjectNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ObjectNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
