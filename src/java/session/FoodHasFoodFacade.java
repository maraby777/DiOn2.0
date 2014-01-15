/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.FoodHasFood;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vladimir
 */
@Stateless
public class FoodHasFoodFacade extends AbstractFacade<FoodHasFood> {
    @PersistenceContext(unitName = "WAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FoodHasFoodFacade() {
        super(FoodHasFood.class);
    }
    
}
