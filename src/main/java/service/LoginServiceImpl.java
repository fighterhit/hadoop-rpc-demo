package service;

import common.LoginServiceInterface;

/**
 * @auther Fighter Created on 2018/4/2.
 */
public class LoginServiceImpl implements LoginServiceInterface{

    public String login(String username, String passwd) {
        System.out.println(String.format("user %s login server successfully!",username));
        return String.format("user %s login successfully!",username);
    }
}
