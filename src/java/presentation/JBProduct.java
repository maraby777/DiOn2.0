/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation;

import entity.Food;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import session.FoodFacade;

/**
 *
 * @author maraby
 */
@Named("product")
@RequestScoped

public class JBProduct {
    
    @EJB
    private FoodFacade foodFacade;
    Food food;
    String name;
    Integer cal;
    Integer carb;
    Integer prot;
    Integer fat;
    
    
    public JBProduct() {
    }
    
    
    Food newFood(){
        Food f = new Food();
        f.setName(name);
        return f;
    }
    
    public String addToTable(){
        return "stroka iz produkta";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCal() {
        return cal.toString();
    }

    public void setCal(String cal) {
        this.cal = new Integer(cal);
    }

    public String getCarb() {
        return carb.toString();
    }

    public void setCarb(Integer carb) {
        this.carb = new Integer(carb);
    }

    public String getProt() {
        return prot.toString();
    }

    public void setProt(Integer prot) {
        this.prot = prot;
    }

    public String getFat() {
        return fat.toString();
    }

    public void setFat(Integer fat) {
        this.fat = new Integer(fat);
    }
   
}
