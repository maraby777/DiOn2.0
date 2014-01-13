/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vladimir
 */
@Entity
@Table(name = "mealtime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mealtime.findAll", query = "SELECT m FROM Mealtime m"),
    @NamedQuery(name = "Mealtime.findByIdMealtime", query = "SELECT m FROM Mealtime m WHERE m.idMealtime = :idMealtime"),
    @NamedQuery(name = "Mealtime.findByName", query = "SELECT m FROM Mealtime m WHERE m.name = :name")})
public class Mealtime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMealtime")
    private Integer idMealtime;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mealtimeidMealtime")
    private Collection<Diares> diaresCollection;

    public Mealtime() {
    }

    public Mealtime(Integer idMealtime) {
        this.idMealtime = idMealtime;
    }

    public Integer getIdMealtime() {
        return idMealtime;
    }

    public void setIdMealtime(Integer idMealtime) {
        this.idMealtime = idMealtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Diares> getDiaresCollection() {
        return diaresCollection;
    }

    public void setDiaresCollection(Collection<Diares> diaresCollection) {
        this.diaresCollection = diaresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMealtime != null ? idMealtime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mealtime)) {
            return false;
        }
        Mealtime other = (Mealtime) object;
        if ((this.idMealtime == null && other.idMealtime != null) || (this.idMealtime != null && !this.idMealtime.equals(other.idMealtime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Mealtime[ idMealtime=" + idMealtime + " ]";
    }
    
}
