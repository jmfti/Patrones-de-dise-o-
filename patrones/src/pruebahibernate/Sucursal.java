/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahibernate;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sucursal.findAll", query = "SELECT s FROM Sucursal s"),
    @NamedQuery(name = "Sucursal.findByNombreSucursal", query = "SELECT s FROM Sucursal s WHERE s.nombreSucursal = :nombreSucursal"),
    @NamedQuery(name = "Sucursal.findByCiudadSucursal", query = "SELECT s FROM Sucursal s WHERE s.ciudadSucursal = :ciudadSucursal"),
    @NamedQuery(name = "Sucursal.findByActivos", query = "SELECT s FROM Sucursal s WHERE s.activos = :activos")})
public class Sucursal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre_sucursal")
    private String nombreSucursal;
    @Column(name = "ciudad_sucursal")
    private String ciudadSucursal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "activos")
    private BigDecimal activos;
    
    public Sucursal(){
        /*
        * TODO : constructor
        */
    }

    public Sucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getCiudadSucursal() {
        return ciudadSucursal;
    }

    public void setCiudadSucursal(String ciudadSucursal) {
        this.ciudadSucursal = ciudadSucursal;
    }

    public BigDecimal getActivos() {
        return activos;
    }

    public void setActivos(BigDecimal activos) {
        this.activos = activos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreSucursal != null ? nombreSucursal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursal)) {
            return false;
        }
        Sucursal other = (Sucursal) object;
        if ((this.nombreSucursal == null && other.nombreSucursal != null) || (this.nombreSucursal != null && !this.nombreSucursal.equals(other.nombreSucursal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.Sucursal[ nombreSucursal=" + nombreSucursal + " ]";
    }

}
