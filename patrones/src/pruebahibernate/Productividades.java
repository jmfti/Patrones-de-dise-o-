/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
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
@Table(name = "productividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productividades.findAll", query = "SELECT p FROM Productividades p"),
    @NamedQuery(name = "Productividades.findByUsuario", query = "SELECT p FROM Productividades p WHERE p.productividadesPK.usuario = :usuario"),
    @NamedQuery(name = "Productividades.findByFecha", query = "SELECT p FROM Productividades p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Productividades.findByFechamodif", query = "SELECT p FROM Productividades p WHERE p.productividadesPK.fechamodif = :fechamodif"),
    @NamedQuery(name = "Productividades.findByCampo", query = "SELECT p FROM Productividades p WHERE p.campo = :campo"),
    @NamedQuery(name = "Productividades.findByViejovalor", query = "SELECT p FROM Productividades p WHERE p.viejovalor = :viejovalor"),
    @NamedQuery(name = "Productividades.findByNuevovalor", query = "SELECT p FROM Productividades p WHERE p.nuevovalor = :nuevovalor"),
    @NamedQuery(name = "Productividades.findByGrupo", query = "SELECT p FROM Productividades p WHERE p.grupo = :grupo"),
    @NamedQuery(name = "Productividades.findBySubgrupo", query = "SELECT p FROM Productividades p WHERE p.subgrupo = :subgrupo"),
    @NamedQuery(name = "Productividades.findByAct", query = "SELECT p FROM Productividades p WHERE p.productividadesPK.act = :act"),
    @NamedQuery(name = "Productividades.findByActfechacierre", query = "SELECT p FROM Productividades p WHERE p.actfechacierre = :actfechacierre"),
    @NamedQuery(name = "Productividades.findByTipo", query = "SELECT p FROM Productividades p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Productividades.findBySubtipo", query = "SELECT p FROM Productividades p WHERE p.subtipo = :subtipo"),
    @NamedQuery(name = "Productividades.findByUsuariomodificado", query = "SELECT p FROM Productividades p WHERE p.usuariomodificado = :usuariomodificado")})
public class Productividades implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductividadesPK productividadesPK;
    @Basic(optional = false)
    @Column(name = "fecha")
    private int fecha;
    @Basic(optional = false)
    @Column(name = "campo")
    private String campo;
    @Basic(optional = false)
    @Column(name = "viejovalor")
    private String viejovalor;
    @Basic(optional = false)
    @Column(name = "nuevovalor")
    private String nuevovalor;
    @Basic(optional = false)
    @Column(name = "grupo")
    private String grupo;
    @Basic(optional = false)
    @Column(name = "subgrupo")
    private String subgrupo;
    @Basic(optional = false)
    @Column(name = "actfechacierre")
    private int actfechacierre;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "subtipo")
    private String subtipo;
    @Column(name = "usuariomodificado")
    private String usuariomodificado;
    
    public Productividades(){
        /*
        * TODO : constructor
        */
    }

    public Productividades(ProductividadesPK productividadesPK) {
        this.productividadesPK = productividadesPK;
    }

    public Productividades(ProductividadesPK productividadesPK, int fecha, String campo, String viejovalor, String nuevovalor, String grupo, String subgrupo, int actfechacierre, String tipo, String subtipo) {
        this.productividadesPK = productividadesPK;
        this.fecha = fecha;
        this.campo = campo;
        this.viejovalor = viejovalor;
        this.nuevovalor = nuevovalor;
        this.grupo = grupo;
        this.subgrupo = subgrupo;
        this.actfechacierre = actfechacierre;
        this.tipo = tipo;
        this.subtipo = subtipo;
    }

    public Productividades(String usuario, int fechamodif, String act) {
        this.productividadesPK = new ProductividadesPK(usuario, fechamodif, act);
    }

    public ProductividadesPK getProductividadesPK() {
        return productividadesPK;
    }

    public void setProductividadesPK(ProductividadesPK productividadesPK) {
        this.productividadesPK = productividadesPK;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getViejovalor() {
        return viejovalor;
    }

    public void setViejovalor(String viejovalor) {
        this.viejovalor = viejovalor;
    }

    public String getNuevovalor() {
        return nuevovalor;
    }

    public void setNuevovalor(String nuevovalor) {
        this.nuevovalor = nuevovalor;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(String subgrupo) {
        this.subgrupo = subgrupo;
    }

    public int getActfechacierre() {
        return actfechacierre;
    }

    public void setActfechacierre(int actfechacierre) {
        this.actfechacierre = actfechacierre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public String getUsuariomodificado() {
        return usuariomodificado;
    }

    public void setUsuariomodificado(String usuariomodificado) {
        this.usuariomodificado = usuariomodificado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productividadesPK != null ? productividadesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productividades)) {
            return false;
        }
        Productividades other = (Productividades) object;
        if ((this.productividadesPK == null && other.productividadesPK != null) || (this.productividadesPK != null && !this.productividadesPK.equals(other.productividadesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebahibernate.Productividades[ productividadesPK=" + productividadesPK + " ]";
    }

}
