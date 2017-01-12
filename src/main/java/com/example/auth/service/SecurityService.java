package com.example.auth.service;

/**
 * Created by sartika.s.hasibuan on 1/11/2017.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);

}
