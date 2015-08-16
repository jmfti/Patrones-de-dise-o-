/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Xavier Mira Fernandez
 */
@Embeddable
public class PrestatarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "numero_prestamo")
    private String numeroPrestamo;
    @Basic(optional = false)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    
    public PrestatarioPK(){
        /*
        * TODO : constructor
        */
    }

    public PrestatarioPK(String numeroPrestamo, String nombreCliente) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroPrestamo != null ? numeroPrestamo.hashCode() : 0);
        hash += (nombreCliente != null ? nombreCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestatarioPK)) {
            return false;
        }
        PrestatarioPK other = (PrestatarioPK) object;
        if ((this.numeroPrestamo == null && other.numeroPrestamo != null) || (this.numeroPrestamo != null && !this.numeroPrestamo.equals(other.numeroPrestamo))) {
            return false;
        }
        if ((this.nombreCliente == null && other.nombreCliente != null) || (this.nombreCliente != null && !this.nombreCliente.equals(other.nombreCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.PrestatarioPK[ numeroPrestamo=" + numeroPrestamo + ", nombreCliente=" + nombreCliente + " ]";
    }

}
