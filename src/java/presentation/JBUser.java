/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import entity.User;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import session.UserFacade;

/**
 *
 * @author vladimir
 */
@Named("User")
@SessionScoped
public class JBUser implements Serializable {

    @EJB
    private UserFacade userFacade;
    private User user;
    private boolean isAuth;

    private String login;
    private String passHash;

    public JBUser() {
    }

    public JBUser(User user) {
        this.user = user;
        isAuth = false;
    }

    public String doLogin() {
        List l = userFacade.findByField("login", login);
        if(l.size()==1){
            return "loginOK";
            //if(l.)
        }else{
            return "loginFail";
        }
    }

    public String doRegister() {
        return "success";
    }

    public String getLogin() {
        return login;
    }

    public String getPassHash() {
        return passHash;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassHash(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        this.passHash = new String(md.digest(pass.getBytes()));
    }
}
