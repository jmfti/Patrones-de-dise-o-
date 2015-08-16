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
public class ImpositorPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Basic(optional = false)
    @Column(name = "numero_cuenta")
    private String numeroCuenta;
    
    public ImpositorPK(){
        /*
        * TODO : constructor
        */
    }

    public ImpositorPK(String nombreCliente, String numeroCuenta) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreCliente != null ? nombreCliente.hashCode() : 0);
        hash += (numeroCuenta != null ? numeroCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpositorPK)) {
            return false;
        }
        ImpositorPK other = (ImpositorPK) object;
        if ((this.nombreCliente == null && other.nombreCliente != null) || (this.nombreCliente != null && !this.nombreCliente.equals(other.nombreCliente))) {
            return false;
        }
        if ((this.numeroCuenta == null && other.numeroCuenta != null) || (this.numeroCuenta != null && !this.numeroCuenta.equals(other.numeroCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.ImpositorPK[ nombreCliente=" + nombreCliente + ", numeroCuenta=" + numeroCuenta + " ]";
    }

}
