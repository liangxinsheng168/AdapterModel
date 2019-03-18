package com.gupaoedu.designPattern.AdapterModel.adapter;

import com.gupaoedu.designPattern.AdapterModel.AuthUtil;
import com.gupaoedu.designPattern.AdapterModel.DefaultLogin;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public abstract class LoginAdapter {

    private DefaultLogin defaultLogin;

    public LoginAdapter(DefaultLogin defaultLogin) {

        this.defaultLogin = defaultLogin;

    }

    public abstract boolean support(LoginAdapter adapter);

    public abstract String getThirdName();

    public void login(String code, LoginAdapter loginAdapter) {

        AuthUtil util = new AuthUtil();
        String username = util.getUsernameByCode(code);
        String password = util.getPasswordByCode(code);
        defaultLogin.login(username, password);
        System.out.println("使用第三方：" + loginAdapter.getThirdName() + "登陆成功.");

    }

}
