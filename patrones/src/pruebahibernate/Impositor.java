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
@Table(name = "impositor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Impositor.findAll", query = "SELECT i FROM Impositor i"),
    @NamedQuery(name = "Impositor.findByNombreCliente", query = "SELECT i FROM Impositor i WHERE i.impositorPK.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Impositor.findByNumeroCuenta", query = "SELECT i FROM Impositor i WHERE i.impositorPK.numeroCuenta = :numeroCuenta")})
public class Impositor implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImpositorPK impositorPK;
    
    public Impositor(){
        /*
        * TODO : constructor
        */
    }

    public Impositor(ImpositorPK impositorPK) {
        this.impositorPK = impositorPK;
    }

    public Impositor(String nombreCliente, String numeroCuenta) {
        this.impositorPK = new ImpositorPK(nombreCliente, numeroCuenta);
    }

    public ImpositorPK getImpositorPK() {
        return impositorPK;
    }

    public void setImpositorPK(ImpositorPK impositorPK) {
        this.impositorPK = impositorPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (impositorPK != null ? impositorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impositor)) {
            return false;
        }
        Impositor other = (Impositor) object;
        if ((this.impositorPK == null && other.impositorPK != null) || (this.impositorPK != null && !this.impositorPK.equals(other.impositorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.Impositor[ impositorPK=" + impositorPK + " ]";
    }

}
