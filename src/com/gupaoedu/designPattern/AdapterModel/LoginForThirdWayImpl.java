package com.gupaoedu.designPattern.AdapterModel;

import com.gupaoedu.designPattern.AdapterModel.adapter.LoginAdapter;
import com.gupaoedu.designPattern.AdapterModel.adapter.LoginByQQAdapter;
import com.gupaoedu.designPattern.AdapterModel.adapter.LoginBySinaAdapter;
import com.gupaoedu.designPattern.AdapterModel.adapter.LoginByWechatAdapter;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class LoginForThirdWayImpl implements LoginForThirdWay {

    private DefaultLogin defaultLogin = new DefaultLogin();

    @Override
    public void LoginByQQ(String code) {

        LoginByQQAdapter adapter = new LoginByQQAdapter(defaultLogin);
        processLogin(code, adapter);

    }

    @Override
    public void LoginByWechat(String code) {

        LoginByWechatAdapter adapter = new LoginByWechatAdapter(defaultLogin);
        processLogin(code ,adapter);

    }

    @Override
    public void LoginBySina(String code) {

        LoginBySinaAdapter adapter = new LoginBySinaAdapter(defaultLogin);
        processLogin(code, adapter);

    }

    public void processLogin(String code, LoginAdapter loginAdapter) {

        if(loginAdapter.support(loginAdapter)) {
            loginAdapter.login(code, loginAdapter);
        }

    }

}
