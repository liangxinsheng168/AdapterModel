package com.gupaoedu.designPattern.AdapterModel.adapter;

import com.gupaoedu.designPattern.AdapterModel.DefaultLogin;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class LoginBySinaAdapter extends LoginAdapter {

    private DefaultLogin defaultLogin;

    public LoginBySinaAdapter(DefaultLogin defaultLogin) {

        super(defaultLogin);

    }

    @Override
    public boolean support(LoginAdapter adapter) {

        return adapter instanceof LoginBySinaAdapter;

    }

    @Override
    public String getThirdName() {

        return ThirdName.Sina.toString();

    }

}
