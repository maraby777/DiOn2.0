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
 * @author maraby
 */
@Entity
@Table(name = "groupfood")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupfood.findAll", query = "SELECT g FROM Groupfood g"),
    @NamedQuery(name = "Groupfood.findByIdGroupFood", query = "SELECT g FROM Groupfood g WHERE g.idGroupFood = :idGroupFood"),
    @NamedQuery(name = "Groupfood.findByName", query = "SELECT g FROM Groupfood g WHERE g.name = :name")})
public class Groupfood implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idGroupFood")
    private Integer idGroupFood;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupFoodidGroupFood")
    private Collection<Food> foodCollection;

    public Groupfood() {
    }

    public Groupfood(Integer idGroupFood) {
        this.idGroupFood = idGroupFood;
    }

    public Integer getIdGroupFood() {
        return idGroupFood;
    }

    public void setIdGroupFood(Integer idGroupFood) {
        this.idGroupFood = idGroupFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Food> getFoodCollection() {
        return foodCollection;
    }

    public void setFoodCollection(Collection<Food> foodCollection) {
        this.foodCollection = foodCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGroupFood != null ? idGroupFood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupfood)) {
            return false;
        }
        Groupfood other = (Groupfood) object;
        if ((this.idGroupFood == null && other.idGroupFood != null) || (this.idGroupFood != null && !this.idGroupFood.equals(other.idGroupFood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Groupfood[ idGroupFood=" + idGroupFood + " ]";
    }
    
}
