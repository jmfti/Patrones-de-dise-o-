/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Xavier Mira Fernandez
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByNombreCliente", query = "SELECT c FROM Cliente c WHERE c.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Cliente.findByCalleCliente", query = "SELECT c FROM Cliente c WHERE c.calleCliente = :calleCliente"),
    @NamedQuery(name = "Cliente.findByCiudadCliente", query = "SELECT c FROM Cliente c WHERE c.ciudadCliente = :ciudadCliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Column(name = "calle_cliente")
    private String calleCliente;
    @Column(name = "ciudad_cliente")
    private String ciudadCliente;
    
    public Cliente(){
        /*
        * TODO : constructor
        */
    }

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCalleCliente() {
        return calleCliente;
    }

    public void setCalleCliente(String calleCliente) {
        this.calleCliente = calleCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreCliente != null ? nombreCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.nombreCliente == null && other.nombreCliente != null) || (this.nombreCliente != null && !this.nombreCliente.equals(other.nombreCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.Cliente[ nombreCliente=" + nombreCliente + " ]";
    }

}
