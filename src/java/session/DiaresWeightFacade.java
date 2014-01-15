/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.DiaresWeight;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vladimir
 */
@Stateless
public class DiaresWeightFacade extends AbstractFacade<DiaresWeight> {
    @PersistenceContext(unitName = "WAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiaresWeightFacade() {
        super(DiaresWeight.class);
    }
    
}
