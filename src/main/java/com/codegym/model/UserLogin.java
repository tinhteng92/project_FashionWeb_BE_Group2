package com.codegym.model;

public class UserLogin {
    private long idAccount;
    private String username;
    private String role;
    private String token;

    public UserLogin() {
    }

    public UserLogin(long idAccount, String username, String role, String token) {
        this.idAccount = idAccount;
        this.username = username;
        this.role = role;
        this.token = token;
    }

    public long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}