/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mack.entity;

/**
 *
 * @author 31327291
 */
public class Usuario {
 
    private String name;
    private String login;
    private String password;

    private boolean isLogged;

    public Usuario(String name, String login, String password,boolean isLogged) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.isLogged = isLogged;
    }

    public Usuario(){
        this.isLogged = false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsLogged() {
        return isLogged;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }
    
    
}
