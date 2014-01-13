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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "food")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Food.findAll", query = "SELECT f FROM Food f"),
    @NamedQuery(name = "Food.findByIdFood", query = "SELECT f FROM Food f WHERE f.idFood = :idFood"),
    @NamedQuery(name = "Food.findByName", query = "SELECT f FROM Food f WHERE f.name = :name"),
    @NamedQuery(name = "Food.findByKcal", query = "SELECT f FROM Food f WHERE f.kcal = :kcal"),
    @NamedQuery(name = "Food.findByProteins", query = "SELECT f FROM Food f WHERE f.proteins = :proteins"),
    @NamedQuery(name = "Food.findByFat", query = "SELECT f FROM Food f WHERE f.fat = :fat"),
    @NamedQuery(name = "Food.findByCarbohydrates", query = "SELECT f FROM Food f WHERE f.carbohydrates = :carbohydrates"),
    @NamedQuery(name = "Food.findByComments", query = "SELECT f FROM Food f WHERE f.comments = :comments"),
    @NamedQuery(name = "Food.findByIsComplex", query = "SELECT f FROM Food f WHERE f.isComplex = :isComplex")})
public class Food implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFood")
    private Integer idFood;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "kcal")
    private Integer kcal;
    @Column(name = "proteins")
    private Integer proteins;
    @Column(name = "fat")
    private Integer fat;
    @Column(name = "carbohydrates")
    private Integer carbohydrates;
    @Size(max = 200)
    @Column(name = "comments")
    private String comments;
    @Column(name = "isComplex")
    private Boolean isComplex;
    @JoinColumn(name = "GroupFood_idGroupFood", referencedColumnName = "idGroupFood")
    @ManyToOne(optional = false)
    private Groupfood groupFoodidGroupFood;
    @OneToMany(mappedBy = "foodidFood14")
    private Collection<FoodHasFood> foodHasFoodCollection;
    @OneToMany(mappedBy = "foodidFood13")
    private Collection<FoodHasFood> foodHasFoodCollection1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "food")
    private FoodHasFood foodHasFood;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foodidFood2")
    private Collection<FoodHasFood> foodHasFoodCollection2;
    @OneToMany(mappedBy = "foodidFood3")
    private Collection<FoodHasFood> foodHasFoodCollection3;
    @OneToMany(mappedBy = "foodidFood4")
    private Collection<FoodHasFood> foodHasFoodCollection4;
    @OneToMany(mappedBy = "foodidFood5")
    private Collection<FoodHasFood> foodHasFoodCollection5;
    @OneToMany(mappedBy = "foodidFood6")
    private Collection<FoodHasFood> foodHasFoodCollection6;
    @OneToMany(mappedBy = "foodidFood7")
    private Collection<FoodHasFood> foodHasFoodCollection7;
    @OneToMany(mappedBy = "foodidFood8")
    private Collection<FoodHasFood> foodHasFoodCollection8;
    @OneToMany(mappedBy = "foodidFood9")
    private Collection<FoodHasFood> foodHasFoodCollection9;
    @OneToMany(mappedBy = "foodidFood10")
    private Collection<FoodHasFood> foodHasFoodCollection10;
    @OneToMany(mappedBy = "foodidFood11")
    private Collection<FoodHasFood> foodHasFoodCollection11;
    @OneToMany(mappedBy = "foodidFood12")
    private Collection<FoodHasFood> foodHasFoodCollection12;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foodidFood")
    private Collection<Diares> diaresCollection;

    public Food() {
    }

    public Food(Integer idFood) {
        this.idFood = idFood;
    }

    public Integer getIdFood() {
        return idFood;
    }

    public void setIdFood(Integer idFood) {
        this.idFood = idFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKcal() {
        return kcal;
    }

    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }

    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        this.proteins = proteins;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getIsComplex() {
        return isComplex;
    }

    public void setIsComplex(Boolean isComplex) {
        this.isComplex = isComplex;
    }

    public Groupfood getGroupFoodidGroupFood() {
        return groupFoodidGroupFood;
    }

    public void setGroupFoodidGroupFood(Groupfood groupFoodidGroupFood) {
        this.groupFoodidGroupFood = groupFoodidGroupFood;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection() {
        return foodHasFoodCollection;
    }

    public void setFoodHasFoodCollection(Collection<FoodHasFood> foodHasFoodCollection) {
        this.foodHasFoodCollection = foodHasFoodCollection;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection1() {
        return foodHasFoodCollection1;
    }

    public void setFoodHasFoodCollection1(Collection<FoodHasFood> foodHasFoodCollection1) {
        this.foodHasFoodCollection1 = foodHasFoodCollection1;
    }

    public FoodHasFood getFoodHasFood() {
        return foodHasFood;
    }

    public void setFoodHasFood(FoodHasFood foodHasFood) {
        this.foodHasFood = foodHasFood;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection2() {
        return foodHasFoodCollection2;
    }

    public void setFoodHasFoodCollection2(Collection<FoodHasFood> foodHasFoodCollection2) {
        this.foodHasFoodCollection2 = foodHasFoodCollection2;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection3() {
        return foodHasFoodCollection3;
    }

    public void setFoodHasFoodCollection3(Collection<FoodHasFood> foodHasFoodCollection3) {
        this.foodHasFoodCollection3 = foodHasFoodCollection3;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection4() {
        return foodHasFoodCollection4;
    }

    public void setFoodHasFoodCollection4(Collection<FoodHasFood> foodHasFoodCollection4) {
        this.foodHasFoodCollection4 = foodHasFoodCollection4;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection5() {
        return foodHasFoodCollection5;
    }

    public void setFoodHasFoodCollection5(Collection<FoodHasFood> foodHasFoodCollection5) {
        this.foodHasFoodCollection5 = foodHasFoodCollection5;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection6() {
        return foodHasFoodCollection6;
    }

    public void setFoodHasFoodCollection6(Collection<FoodHasFood> foodHasFoodCollection6) {
        this.foodHasFoodCollection6 = foodHasFoodCollection6;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection7() {
        return foodHasFoodCollection7;
    }

    public void setFoodHasFoodCollection7(Collection<FoodHasFood> foodHasFoodCollection7) {
        this.foodHasFoodCollection7 = foodHasFoodCollection7;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection8() {
        return foodHasFoodCollection8;
    }

    public void setFoodHasFoodCollection8(Collection<FoodHasFood> foodHasFoodCollection8) {
        this.foodHasFoodCollection8 = foodHasFoodCollection8;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection9() {
        return foodHasFoodCollection9;
    }

    public void setFoodHasFoodCollection9(Collection<FoodHasFood> foodHasFoodCollection9) {
        this.foodHasFoodCollection9 = foodHasFoodCollection9;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection10() {
        return foodHasFoodCollection10;
    }

    public void setFoodHasFoodCollection10(Collection<FoodHasFood> foodHasFoodCollection10) {
        this.foodHasFoodCollection10 = foodHasFoodCollection10;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection11() {
        return foodHasFoodCollection11;
    }

    public void setFoodHasFoodCollection11(Collection<FoodHasFood> foodHasFoodCollection11) {
        this.foodHasFoodCollection11 = foodHasFoodCollection11;
    }

    @XmlTransient
    public Collection<FoodHasFood> getFoodHasFoodCollection12() {
        return foodHasFoodCollection12;
    }

    public void setFoodHasFoodCollection12(Collection<FoodHasFood> foodHasFoodCollection12) {
        this.foodHasFoodCollection12 = foodHasFoodCollection12;
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
        hash += (idFood != null ? idFood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.idFood == null && other.idFood != null) || (this.idFood != null && !this.idFood.equals(other.idFood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Food[ idFood=" + idFood + " ]";
    }
    
}
