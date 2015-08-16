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
@Table(name = "prestamo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamo.findAll", query = "SELECT p FROM Prestamo p"),
    @NamedQuery(name = "Prestamo.findByNumeroPrestamo", query = "SELECT p FROM Prestamo p WHERE p.numeroPrestamo = :numeroPrestamo"),
    @NamedQuery(name = "Prestamo.findByNombreSucursal", query = "SELECT p FROM Prestamo p WHERE p.nombreSucursal = :nombreSucursal"),
    @NamedQuery(name = "Prestamo.findByImporte", query = "SELECT p FROM Prestamo p WHERE p.importe = :importe")})
public class Prestamo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero_prestamo")
    private String numeroPrestamo;
    @Column(name = "nombre_sucursal")
    private String nombreSucursal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe")
    private BigDecimal importe;
    
    public Prestamo(){
        /*
        * TODO : constructor
        */
    }

    public Prestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroPrestamo != null ? numeroPrestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamo)) {
            return false;
        }
        Prestamo other = (Prestamo) object;
        if ((this.numeroPrestamo == null && other.numeroPrestamo != null) || (this.numeroPrestamo != null && !this.numeroPrestamo.equals(other.numeroPrestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.Prestamo[ numeroPrestamo=" + numeroPrestamo + " ]";
    }

}
