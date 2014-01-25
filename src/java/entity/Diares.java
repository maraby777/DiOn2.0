/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maraby
 */
@Entity
@Table(name = "diares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diares.findAll", query = "SELECT d FROM Diares d"),
    @NamedQuery(name = "Diares.findByIdDiares", query = "SELECT d FROM Diares d WHERE d.idDiares = :idDiares"),
    @NamedQuery(name = "Diares.findByName", query = "SELECT d FROM Diares d WHERE d.name = :name"),
    @NamedQuery(name = "Diares.findByTime", query = "SELECT d FROM Diares d WHERE d.time = :time"),
    @NamedQuery(name = "Diares.findByDate", query = "SELECT d FROM Diares d WHERE d.date = :date"),
    @NamedQuery(name = "Diares.findByWeight", query = "SELECT d FROM Diares d WHERE d.weight = :weight")})
public class Diares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDiares")
    private Integer idDiares;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weight")
    private BigDecimal weight;
    @JoinColumn(name = "Mealtime_idMealtime", referencedColumnName = "idMealtime")
    @ManyToOne(optional = false)
    private Mealtime mealtimeidMealtime;
    @JoinColumn(name = "Food_idFood", referencedColumnName = "idFood")
    @ManyToOne(optional = false)
    private Food foodidFood;
    @JoinColumn(name = "User_idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User useridUser;

    public Diares() {
    }

    public Diares(Integer idDiares) {
        this.idDiares = idDiares;
    }

    public Integer getIdDiares() {
        return idDiares;
    }

    public void setIdDiares(Integer idDiares) {
        this.idDiares = idDiares;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Mealtime getMealtimeidMealtime() {
        return mealtimeidMealtime;
    }

    public void setMealtimeidMealtime(Mealtime mealtimeidMealtime) {
        this.mealtimeidMealtime = mealtimeidMealtime;
    }

    public Food getFoodidFood() {
        return foodidFood;
    }

    public void setFoodidFood(Food foodidFood) {
        this.foodidFood = foodidFood;
    }

    public User getUseridUser() {
        return useridUser;
    }

    public void setUseridUser(User useridUser) {
        this.useridUser = useridUser;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiares != null ? idDiares.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diares)) {
            return false;
        }
        Diares other = (Diares) object;
        if ((this.idDiares == null && other.idDiares != null) || (this.idDiares != null && !this.idDiares.equals(other.idDiares))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Diares[ idDiares=" + idDiares + " ]";
    }
    
}
