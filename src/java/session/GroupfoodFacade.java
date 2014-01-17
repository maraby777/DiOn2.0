/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.Groupfood;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author maraby
 */
@Stateless
public class GroupfoodFacade extends AbstractFacade<Groupfood> {
    @PersistenceContext(unitName = "WAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GroupfoodFacade() {
        super(Groupfood.class);
    }
    
}
