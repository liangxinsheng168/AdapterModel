package com.gupaoedu.designPattern.AdapterModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class AdapterModelTest {

    public static void main(String[] args) {

        String code = "***";

        LoginForThirdWayImpl impl = new LoginForThirdWayImpl();

        //使用QQ登录
        impl.LoginByQQ(code);

        //使用微信登录
        impl.LoginByWechat(code);

        //使用微博登录
        impl.LoginBySina(code);

    }

}
