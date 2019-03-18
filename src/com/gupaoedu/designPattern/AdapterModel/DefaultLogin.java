package com.gupaoedu.designPattern.AdapterModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class DefaultLogin {

    public void login(String username, String password) {

        if(checkUser(username, password)) {
            System.out.println("Login success.");
        }else{
            System.out.println("Login fail.");
        }

    }

    public boolean checkUser(String username ,String password) {
        if(username.equals("") && password.equals("")) {
            return false;
        }
        return true;
    }

}
