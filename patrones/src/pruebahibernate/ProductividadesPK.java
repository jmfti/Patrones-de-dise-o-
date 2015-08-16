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
public class ProductividadesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "fechamodif")
    private int fechamodif;
    @Basic(optional = false)
    @Column(name = "act")
    private String act;
    
    public ProductividadesPK(){
        /*
        * TODO : constructor
        */
    }

    public ProductividadesPK(String usuario, int fechamodif, String act) {
        this.usuario = usuario;
        this.fechamodif = fechamodif;
        this.act = act;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getFechamodif() {
        return fechamodif;
    }

    public void setFechamodif(int fechamodif) {
        this.fechamodif = fechamodif;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        hash += (int) fechamodif;
        hash += (act != null ? act.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductividadesPK)) {
            return false;
        }
        ProductividadesPK other = (ProductividadesPK) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        if (this.fechamodif != other.fechamodif) {
            return false;
        }
        if ((this.act == null && other.act != null) || (this.act != null && !this.act.equals(other.act))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.ProductividadesPK[ usuario=" + usuario + ", fechamodif=" + fechamodif + ", act=" + act + " ]";
    }

}
