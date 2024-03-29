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
 * @author maraby
 */
//аннотация бина 
@Named("user")
//область видимости, период жизни юзера- сессия
@SessionScoped
public class JBUser implements Serializable {

    @EJB
    //ссылка бина на юзерФассад
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

    //
    public String doLogin() {
        List l = userFacade.findByField("login", login);//поиск в базе логина по введенному логину
        if (l.size() == 1) {
//проверка хеш паролей
            User curUser = (User) l.get(0);
            if (curUser.getHashString() == null ? passHash == null : curUser.getHashString().equals(passHash)) {
                return "loginOK";
            } else {
                return "loginFail";
            }
        } else {
            return "loginFail";
        }
    }

    public String doRegister() {
        List l = userFacade.findByField("login", login);//поиск по полю "логин" логина
        if(l.isEmpty()){
            User u = new User();
            //u.setIdUser(Integer.parseInt("2"));
            u.setLogin(login);
            u.setHashString(passHash);
            userFacade.create(u);
            return "registerOK";
        }else{
            return "registerFail";
        }
        
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

    //получаем  стринг,  устанавливаем passHesh  новая строка с хеш функцией
    public void setPassHash(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        this.passHash = new String(md.digest(pass.getBytes()));
    }
}
