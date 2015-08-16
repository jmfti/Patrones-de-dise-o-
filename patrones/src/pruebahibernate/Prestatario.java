/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahibernate;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Xavier Mira Fernandez
 */
@Entity
@Table(name = "prestatario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestatario.findAll", query = "SELECT p FROM Prestatario p"),
    @NamedQuery(name = "Prestatario.findByNumeroPrestamo", query = "SELECT p FROM Prestatario p WHERE p.prestatarioPK.numeroPrestamo = :numeroPrestamo"),
    @NamedQuery(name = "Prestatario.findByNombreCliente", query = "SELECT p FROM Prestatario p WHERE p.prestatarioPK.nombreCliente = :nombreCliente")})
public class Prestatario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrestatarioPK prestatarioPK;
    
    public Prestatario(){
        /*
        * TODO : constructor
        */
    }

    public Prestatario(PrestatarioPK prestatarioPK) {
        this.prestatarioPK = prestatarioPK;
    }

    public Prestatario(String numeroPrestamo, String nombreCliente) {
        this.prestatarioPK = new PrestatarioPK(numeroPrestamo, nombreCliente);
    }

    public PrestatarioPK getPrestatarioPK() {
        return prestatarioPK;
    }

    public void setPrestatarioPK(PrestatarioPK prestatarioPK) {
        this.prestatarioPK = prestatarioPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prestatarioPK != null ? prestatarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestatario)) {
            return false;
        }
        Prestatario other = (Prestatario) object;
        if ((this.prestatarioPK == null && other.prestatarioPK != null) || (this.prestatarioPK != null && !this.prestatarioPK.equals(other.prestatarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.Prestatario[ prestatarioPK=" + prestatarioPK + " ]";
    }

}
