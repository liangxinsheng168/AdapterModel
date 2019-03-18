package com.gupaoedu.designPattern.AdapterModel.adapter;

import com.gupaoedu.designPattern.AdapterModel.DefaultLogin;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class LoginByQQAdapter extends LoginAdapter {

    private DefaultLogin defaultLogin;

    public LoginByQQAdapter(DefaultLogin defaultLogin) {

        super(defaultLogin);

    }

    @Override
    public boolean support(LoginAdapter adapter) {

        return adapter instanceof LoginByQQAdapter;

    }

    @Override
    public String getThirdName() {

        return ThirdName.QQ.toString();

    }

}
