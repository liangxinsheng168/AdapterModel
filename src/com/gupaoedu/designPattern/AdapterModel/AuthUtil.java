package com.gupaoedu.designPattern.AdapterModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class AuthUtil {

    private String username = "***";
    private String password = "***";

    public String getUsernameByCode(String code) {
        if(!code.equals("")) {
            return username;
        }
        return null;
    }

    public String getPasswordByCode(String code) {
        if(!code.equals("")) {
            return password;
        }
        return null;
    }

}
