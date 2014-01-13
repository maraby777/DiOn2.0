/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladimir
 */
@Entity
@Table(name = "food_has_food")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FoodHasFood.findAll", query = "SELECT f FROM FoodHasFood f"),
    @NamedQuery(name = "FoodHasFood.findByFoodidFood", query = "SELECT f FROM FoodHasFood f WHERE f.foodidFood = :foodidFood"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood2", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood2 = :weightFood2"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood3", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood3 = :weightFood3"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood4", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood4 = :weightFood4"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood5", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood5 = :weightFood5"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood6", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood6 = :weightFood6"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood7", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood7 = :weightFood7"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood8", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood8 = :weightFood8"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood9", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood9 = :weightFood9"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood10", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood10 = :weightFood10"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood11", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood11 = :weightFood11"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood12", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood12 = :weightFood12"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood13", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood13 = :weightFood13"),
    @NamedQuery(name = "FoodHasFood.findByWeightFood14", query = "SELECT f FROM FoodHasFood f WHERE f.weightFood14 = :weightFood14")})
public class FoodHasFood implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Food_idFood")
    private Integer foodidFood;
    @Column(name = "weightFood2")
    private Integer weightFood2;
    @Column(name = "weightFood3")
    private Integer weightFood3;
    @Column(name = "weightFood4")
    private Integer weightFood4;
    @Column(name = "weightFood5")
    private Integer weightFood5;
    @Column(name = "weightFood6")
    private Integer weightFood6;
    @Column(name = "weightFood7")
    private Integer weightFood7;
    @Column(name = "weightFood8")
    private Integer weightFood8;
    @Column(name = "weightFood9")
    private Integer weightFood9;
    @Column(name = "weightFood10")
    private Integer weightFood10;
    @Column(name = "weightFood11")
    private Integer weightFood11;
    @Column(name = "weightFood12")
    private Integer weightFood12;
    @Column(name = "weightFood13")
    private Integer weightFood13;
    @Column(name = "weightFood14")
    private Integer weightFood14;
    @JoinColumn(name = "Food_idFood14", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood14;
    @JoinColumn(name = "Food_idFood13", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood13;
    @JoinColumn(name = "Food_idFood", referencedColumnName = "idFood", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Food food;
    @JoinColumn(name = "Food_idFood2", referencedColumnName = "idFood")
    @ManyToOne(optional = false)
    private Food foodidFood2;
    @JoinColumn(name = "Food_idFood3", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood3;
    @JoinColumn(name = "Food_idFood4", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood4;
    @JoinColumn(name = "Food_idFood5", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood5;
    @JoinColumn(name = "Food_idFood6", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood6;
    @JoinColumn(name = "Food_idFood7", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood7;
    @JoinColumn(name = "Food_idFood8", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood8;
    @JoinColumn(name = "Food_idFood9", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood9;
    @JoinColumn(name = "Food_idFood10", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood10;
    @JoinColumn(name = "Food_idFood11", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood11;
    @JoinColumn(name = "Food_idFood12", referencedColumnName = "idFood")
    @ManyToOne
    private Food foodidFood12;

    public FoodHasFood() {
    }

    public FoodHasFood(Integer foodidFood) {
        this.foodidFood = foodidFood;
    }

    public Integer getFoodidFood() {
        return foodidFood;
    }

    public void setFoodidFood(Integer foodidFood) {
        this.foodidFood = foodidFood;
    }

    public Integer getWeightFood2() {
        return weightFood2;
    }

    public void setWeightFood2(Integer weightFood2) {
        this.weightFood2 = weightFood2;
    }

    public Integer getWeightFood3() {
        return weightFood3;
    }

    public void setWeightFood3(Integer weightFood3) {
        this.weightFood3 = weightFood3;
    }

    public Integer getWeightFood4() {
        return weightFood4;
    }

    public void setWeightFood4(Integer weightFood4) {
        this.weightFood4 = weightFood4;
    }

    public Integer getWeightFood5() {
        return weightFood5;
    }

    public void setWeightFood5(Integer weightFood5) {
        this.weightFood5 = weightFood5;
    }

    public Integer getWeightFood6() {
        return weightFood6;
    }

    public void setWeightFood6(Integer weightFood6) {
        this.weightFood6 = weightFood6;
    }

    public Integer getWeightFood7() {
        return weightFood7;
    }

    public void setWeightFood7(Integer weightFood7) {
        this.weightFood7 = weightFood7;
    }

    public Integer getWeightFood8() {
        return weightFood8;
    }

    public void setWeightFood8(Integer weightFood8) {
        this.weightFood8 = weightFood8;
    }

    public Integer getWeightFood9() {
        return weightFood9;
    }

    public void setWeightFood9(Integer weightFood9) {
        this.weightFood9 = weightFood9;
    }

    public Integer getWeightFood10() {
        return weightFood10;
    }

    public void setWeightFood10(Integer weightFood10) {
        this.weightFood10 = weightFood10;
    }

    public Integer getWeightFood11() {
        return weightFood11;
    }

    public void setWeightFood11(Integer weightFood11) {
        this.weightFood11 = weightFood11;
    }

    public Integer getWeightFood12() {
        return weightFood12;
    }

    public void setWeightFood12(Integer weightFood12) {
        this.weightFood12 = weightFood12;
    }

    public Integer getWeightFood13() {
        return weightFood13;
    }

    public void setWeightFood13(Integer weightFood13) {
        this.weightFood13 = weightFood13;
    }

    public Integer getWeightFood14() {
        return weightFood14;
    }

    public void setWeightFood14(Integer weightFood14) {
        this.weightFood14 = weightFood14;
    }

    public Food getFoodidFood14() {
        return foodidFood14;
    }

    public void setFoodidFood14(Food foodidFood14) {
        this.foodidFood14 = foodidFood14;
    }

    public Food getFoodidFood13() {
        return foodidFood13;
    }

    public void setFoodidFood13(Food foodidFood13) {
        this.foodidFood13 = foodidFood13;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFoodidFood2() {
        return foodidFood2;
    }

    public void setFoodidFood2(Food foodidFood2) {
        this.foodidFood2 = foodidFood2;
    }

    public Food getFoodidFood3() {
        return foodidFood3;
    }

    public void setFoodidFood3(Food foodidFood3) {
        this.foodidFood3 = foodidFood3;
    }

    public Food getFoodidFood4() {
        return foodidFood4;
    }

    public void setFoodidFood4(Food foodidFood4) {
        this.foodidFood4 = foodidFood4;
    }

    public Food getFoodidFood5() {
        return foodidFood5;
    }

    public void setFoodidFood5(Food foodidFood5) {
        this.foodidFood5 = foodidFood5;
    }

    public Food getFoodidFood6() {
        return foodidFood6;
    }

    public void setFoodidFood6(Food foodidFood6) {
        this.foodidFood6 = foodidFood6;
    }

    public Food getFoodidFood7() {
        return foodidFood7;
    }

    public void setFoodidFood7(Food foodidFood7) {
        this.foodidFood7 = foodidFood7;
    }

    public Food getFoodidFood8() {
        return foodidFood8;
    }

    public void setFoodidFood8(Food foodidFood8) {
        this.foodidFood8 = foodidFood8;
    }

    public Food getFoodidFood9() {
        return foodidFood9;
    }

    public void setFoodidFood9(Food foodidFood9) {
        this.foodidFood9 = foodidFood9;
    }

    public Food getFoodidFood10() {
        return foodidFood10;
    }

    public void setFoodidFood10(Food foodidFood10) {
        this.foodidFood10 = foodidFood10;
    }

    public Food getFoodidFood11() {
        return foodidFood11;
    }

    public void setFoodidFood11(Food foodidFood11) {
        this.foodidFood11 = foodidFood11;
    }

    public Food getFoodidFood12() {
        return foodidFood12;
    }

    public void setFoodidFood12(Food foodidFood12) {
        this.foodidFood12 = foodidFood12;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodidFood != null ? foodidFood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FoodHasFood)) {
            return false;
        }
        FoodHasFood other = (FoodHasFood) object;
        if ((this.foodidFood == null && other.foodidFood != null) || (this.foodidFood != null && !this.foodidFood.equals(other.foodidFood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.FoodHasFood[ foodidFood=" + foodidFood + " ]";
    }
    
}
