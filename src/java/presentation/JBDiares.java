/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import entity.User;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import session.DiaresFacade;
import session.MealtimeFacade;

/**
 *
 * @author maraby
 */
@Named("diary")
//обновление при запросе создается новый бин,время жизни бина в пределах одного запроса
@RequestScoped

public class JBDiares implements Serializable {

    //иньекция ггг бина
    @EJB
    private MealtimeFacade mealtimeFacade;
    @EJB
    private DiaresFacade diaresFacade;
    String nameOfProduct;
   

    public List todayFood(User user, Date currentDate) {
        HashMap hashMap = new HashMap();
        hashMap.put("User_idUser", user);
        hashMap.put("date", currentDate);
        return diaresFacade.findByFields(hashMap);
    }
    
    public String toAdd(){
        return "toAdd";
    }

    public String addToDB(){
        return "addToDB";
    }
    
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

   
    
    
}
